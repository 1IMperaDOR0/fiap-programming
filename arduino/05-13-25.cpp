/*Link do projeto: https://wokwi.com/projects/430531208183426049*/

#include <DHT.h>
#include <LiquidCrystal_I2C.h>

#define ldrPin A0
#define dhtPin 13
#define dhtType DHT22

DHT dht(dhtPin, dhtType);

LiquidCrystal_I2C lcdLux(0x27, 16, 2);

LiquidCrystal_I2C lcdUmid(0x26, 16, 2);

LiquidCrystal_I2C lcdTemp(0x25, 16 , 2);

void setup() {
  pinMode(ldrPin, INPUT);
  Serial.begin(9600);
  dht.begin();

  lcdLux.init();
  lcdLux.backlight();

  lcdUmid.init();
  lcdUmid.backlight();

  lcdTemp.init();
  lcdTemp.backlight();
}

void loop() {
  int analogValue = analogRead(ldrPin);
  float voltage = analogValue / 1024.0 * 5;
  float resistance = 2000 * voltage / (1 - voltage / 5);
  float GAMMA = 0.7;
  float RL10 = 50;
  float lux = pow(RL10 * 1e3 * pow(10, GAMMA) / resistance, (1 / GAMMA));

  String statusLux = "";
  if(lux < 50) {
    statusLux = "SEGURO";
  } else if(lux > 499) {
    statusLux = "PERIGO";
  } else {
    statusLux = "CUIDADO";
  }

  lcdLux.clear();
  lcdLux.setCursor(0, 0);
  lcdLux.print("Lux: " + String(lux));
  lcdLux.setCursor(0, 1);
  lcdLux.print("Status: " + statusLux);

  float umid = dht.readHumidity();
  String statusUmid = "";

  if(umid < 50) {
    statusUmid = "BAIXA";
  } else if(umid < 85) {
    statusUmid = "OK";
  } else {
    statusUmid = "ALTA";
  }

  lcdUmid.clear();
  lcdUmid.setCursor(0, 0);
  lcdUmid.print("Umid: " + String(umid) + "%");
  lcdUmid.setCursor(0, 1);
  lcdUmid.print("Status: " + statusUmid);

  float temp = dht.readTemperature();
  String statusTemp = "";

  if(temp > 13) {
    statusTemp = "QUENTE";
  } else if(temp < 13) {
    statusTemp = "FRIO";
  } else {
    statusTemp = "IDEAL";
  }
  lcdTemp.clear();
  lcdTemp.setCursor(0, 0);
  lcdTemp.print("Temp: " + String(temp) + " C");
  lcdTemp.setCursor(0, 1);
  lcdTemp.print("Status: " + statusTemp);

  delay(1000);
}