import 'dart:io';

void main(List<String> arguments) {
  // Calculadora de operações básicas com 2 valores
  // print('Digite o primeiro valor:');
  // double n1 = double.parse(stdin.readLineSync()!);
  // print('Digite o segundo valor:');
  // double n2 = double.parse(stdin.readLineSync()!);
  // print('Os valores digitados foram $n1 e $n2.');

  // print('Qual operação você vai fazer? (Digite o número que corresponda a sua escolha)\n1. adição;\n2. subtração;\n3. multiplicação;\n4. divisão.');
  // String operacao = stdin.readLineSync()!;

  double n1 = 0;
  double n2 = 0;

  String operacao = "";

  void soma() {
    double adicao = n1 + n2;
    print('O valor da adição é $adicao.');
  }

  void menos() {
    double menos = n1 - n2;
    print('O valor da subtração é $menos.');
  }

  void mult() {
    double mult = n1 * n2;
    print('O valor da multiplicação é $mult.');
  }

  void divisao() {
    double divsao = n1 / n2;
    print('O valor da divisão é $divsao.');
  }
  
  print('Digite o primeiro valor:');
  String? entrada = stdin.readLineSync();

  if(entrada != null) {
    if(entrada != "") {
      n1 = double.parse(entrada);
    }
  }

  print('Digite o segundo valor:');
  entrada = stdin.readLineSync();

  if(entrada != null) {
    if(entrada != "") {
      n2 = double.parse(entrada);
    }
  }

  print('Os valores digitados foram $n1 e $n2.');

  print('Qual operação você vai fazer? (Digite o número que corresponda a sua escolha)\n1. adição;\n2. subtração;\n3. multiplicação;\n4. divisão.');
  entrada = stdin.readLineSync();

  if(entrada != null) {
    if(entrada != "") {
      operacao = entrada;
    }
  }

  switch(operacao) {
    case '1':
    soma();

    case '2':
    menos();

    case '3':
    mult();

    case '4':
    divisao();

    break;
  }

  
}
