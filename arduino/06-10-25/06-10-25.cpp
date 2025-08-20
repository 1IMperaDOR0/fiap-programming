/*Link do projeto: https://wokwi.com/projects/433382947551841281*/

#include <Servo.h>

#define servoPin 3
#define ledG 13
#define ledY 12
#define ledR 11

Servo myServo;

void setup() {
  Serial.begin(9600);
  pinMode(ledG, OUTPUT);
  pinMode(ledY, OUTPUT);
  pinMode(ledR, OUTPUT);
  myServo.attach(servoPin);
  Serial.println("Terminal Aberto");
}

void loop() {
  if(Serial.available() > 0) {
    char comando = Serial.read();
    if(comando == '1') {
      digitalWrite(ledG, HIGH);
    } else if(comando == '2') {
      digitalWrite(ledY, HIGH);
    } else if(comando == '3') {
      digitalWrite(ledR, HIGH);
    } else if(comando == '0') {
      digitalWrite(ledG, LOW);
      digitalWrite(ledY, LOW);
      digitalWrite(ledR, LOW);
    } else if(comando == 'a' || comando == 'A') {
      myServo.write(180);
    } else if(comando == 'f' || comando == 'F') {
      myServo.write(0);
    }
  }
}
