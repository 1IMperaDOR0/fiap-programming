/* Link do projeto: https://wokwi.com/projects/443526276749196289 */

#include <Servo.h>

#define trigger 7
#define echo 6

#define servoPin 11

Servo myServo;

void setup() {
  Serial.begin(9600);
  myServo.attach(servoPin);
  pinMode(trigger, OUTPUT);
  pinMode(echo, INPUT);
}

void loop() {
  digitalWrite(trigger, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigger, LOW);

  int dist = pulseIn(echo, HIGH);
  dist = dist/58;
  Serial.println(dist);

  if(Serial.available() > 0) {
    char comando = Serial.read();
    if(comando == '1') {
      myServo.write(90);
    } else if(comando == '2') {
      myServo.write(180);
    }
  }
}