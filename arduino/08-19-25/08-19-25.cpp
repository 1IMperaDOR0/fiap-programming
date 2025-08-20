#include <ArduinoJson.h>
#include <DHT.h>

#define trigger 4
#define echo 3

#define dhtPin 2 
#define dhtType DHT11 

DHT dht(dhtPin, dhtType); 

void setup() { 
    Serial.begin(9600); 
    dht.begin(); 

    pinMode(trigger, OUTPUT); 
    pinMode(echo, INPUT); 
} 

void loop() { 
    digitalWrite(trigger, HIGH); 
    delayMicroseconds(10); 
    digitalWrite(trigger, LOW); 

    int dist = pulseIn(echo,HIGH); 
    dist = dist/58; 

    int temp = dht.readTemperature(); 
    int umi = dht.readHumidity(); 

    // Declara um objeto JsonDocument com tamanho máximo de 100 bytes
    StaticJsonDocument<100> doc;

    // Adiciona dados ao objeto
    doc["Distancia"] = dist;
    doc["Temperatura"] = temp;
    doc["Umidade"] = umi;

    // Serializa o objeto em uma string JSON
    String jsonString;
    serializeJson(doc, jsonString);

    // Imprime a string JSON
    Serial.println(jsonString);
} 