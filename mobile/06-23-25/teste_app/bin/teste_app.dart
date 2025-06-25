import 'dart:io';

void main() {
  print('Hello World!');
  print('Digite "Olá Mundo!"');
  var entrada = stdin.readLineSync();
  if(entrada == 'Olá Mundo!') {
    print('É isso aí!');
  } else {
    print('Poxa... tudo bem.');
  }
}
