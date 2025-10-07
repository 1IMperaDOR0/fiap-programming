#include <WiFi.h>
#include <PubSubClient.h>
#include <DHT.h>
#include <ArduinoJson.h>

#define DHTPIN 15
#define LEDPIN 2
DHT dht(DHTPIN, DHT22);

WiFiClient wifiClient;
PubSubClient mqttClient(wifiClient);

void setup() {
  Serial.begin(115200);
  pinMode(LEDPIN, OUTPUT);
  dht.begin();

  WiFi.begin("Wokwi-GUEST", "");
  while (WiFi.status() != WL_CONNECTED) {
    delay(100);
    Serial.print(".");
  }
  Serial.println("\nWiFi conectado!");

  mqttClient.setServer("test.mosquitto.org", 1883);
  mqttClient.setCallback([](char* topic, byte* payload, unsigned int length) {
    if (payload[0] == '1') digitalWrite(LEDPIN, HIGH);
    if (payload[0] == '0') digitalWrite(LEDPIN, LOW);
  });

  while (!mqttClient.connect("esp32-lucas-sena")) {
    Serial.println("Tentando conectar ao MQTT...");
    delay(1000);
  }

  Serial.println("MQTT conectado!");
  mqttClient.subscribe("led/control/lucas-sena");
}

void loop() {
  if (!mqttClient.connected()) {
    mqttClient.connect("esp32-lucas-sena");
  }
  
  mqttClient.loop();

  float t = dht.readTemperature();
  float h = dht.readHumidity();

  if (isnan(t) || isnan(h)) {
    Serial.println("Erro ao ler do sensor DHT!");
    return;
  }

  StaticJsonDocument<200> json;
  json["Temperatura"] = t;
  json["Umidade"] = h;

  char jsonBuffer[200];
  serializeJson(json, jsonBuffer);
  
  mqttClient.publish("sensor/dht/lucas-sena", jsonBuffer);

  Serial.println("JSON publicado no MQTT!");
}