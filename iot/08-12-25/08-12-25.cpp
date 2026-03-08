#define trigger 8
#define echo 7

int dist = 0;

void setup() {
    Serial.begin(9600);
    pinMode(trigger, OUTPUT);
    pinMode(echo, INPUT);
}

void loop() {
    digitalWrite(trigger, HIGH);
    delayMicroseconds(10);
    digitalWrite(trigger, LOW);

    dist = pulseIn(echo, HIGH);
    dist = dist/58;

    Serial.println(dist);
    delay(1000);
}