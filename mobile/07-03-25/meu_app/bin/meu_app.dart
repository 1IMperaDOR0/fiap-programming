import 'dart:io';

void main(List<String> arguments) {
  double n1 = 0;
  double n2 = 0;
  String? entrada = "";
  String operacao = "";
  List<String> operacoes = <String>['+', '-', '*', '/'];

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

  void calcular() {
    switch(operacao) {
      case '+':
      soma();

      case '-':
      menos();

      case '*':
      mult();

      case '/':
      divisao();

      break;
    }
  }

  void getOperacao() {
    print("Qual operação você vai fazer? ${operacoes.toString()}.");
    entrada = stdin.readLineSync();
    if(entrada != null && entrada != "") {
      if(operacoes.contains(entrada)) {
        operacao = entrada!;
      } else {
        print("Operação inválida.");
        getOperacao();
      }
    }
  }
  
  print('Digite o primeiro valor:');
  entrada = stdin.readLineSync();

  if(entrada != null) {
    if(entrada != "") {
      n1 = double.parse(entrada!);
    }
  }

  getOperacao();

  print('Digite o segundo valor:');
  entrada = stdin.readLineSync();

  if(entrada != null) {
    if(entrada != "") {
      n2 = double.parse(entrada!);
    }
  }

  print('Os valores digitados foram $n1 e $n2.');

  calcular();
}