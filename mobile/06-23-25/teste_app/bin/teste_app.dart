import 'dart:io';

void main() {
  print('Hello World!');
  print('Digite "Ola Mundo!"');
  var entrada = stdin.readLineSync();
  if(entrada == "Ola Mundo!") {
    print('É isso aí!');
  } else {
    print('Poxa... tudo bem.');
  }
}
