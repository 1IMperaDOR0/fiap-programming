import 'dart:io';

void main() {
  print("Olá, me chamo Dart. Qual o seu nome?");
  String? nome = stdin.readLineSync();
  print("Quantos anos você tem?");
  String? idade = stdin.readLineSync();
  print("Muito prazer, $nome. Você tem $idade anos. Vamos fazer vários programas juntos.");
}