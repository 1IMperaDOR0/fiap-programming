import 'dart:io';

void main() {
  // Calculadora de operações básicas com 2 valores
  print('Digite o primeiro valor:');
  double n1 = double.parse(stdin.readLineSync()!);
  print('Digite o segundo valor:');
  double n2 = double.parse(stdin.readLineSync()!);
  print('Os valores digitados foram $n1 e $n2.');

  print('Qual operação você vai fazer? (Digite o número que corresponda a sua escolha)\n1. adição;\n2. subtração;\n3. multiplicação;\n4. divisão.');
  String operacao = stdin.readLineSync()!;

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

  if(operacao == '1') {
      soma();
  } else if(operacao == '2') {
      menos();
  } else if(operacao == '3') {
      mult();
  } else {
      divisao();
  }

  // // Calculadora que calcula o dobro de 1 valor.
  // print('Digite um número que você queira saber o dobro:');
  // double n = double.parse(stdin.readLineSync()!);

  // print('O valor digitado foi $n.');

  // double dobro = n * 2;
  // print('O resultado é $dobro.');

  // // Calculadora de média com 3 valores.
  // print('Digite o primeiro valor:');
  // double n3 = double.parse(stdin.readLineSync()!);

  // print('Digite o segundo valor:');
  // double n4 = double.parse(stdin.readLineSync()!);

  // print('Digite o terceiro valor:');
  // double n5 = double.parse(stdin.readLineSync()!);

  // print('Os valores digitados foram $n3, $n4 e $n5.');

  // double media = (n3 + n4 + n5) / 3;
  // print('O valor da média é $media.');

  // // Calculadora do salário de freela baseado em horas.
  // print('Digite o número de horas que você trabalhou:');
  // double horas = double.parse(stdin.readLineSync()!);

  // double salarioBruto = 50 * horas; 
  // double desconto = salarioBruto * 0.05;
  // double salarioLiquido = salarioBruto - desconto;
  // print('O salário líquido é R\$ $salarioLiquido.');

  // // Correção de problemas propostos
  // void problemaUm() {
  //   double saldo = 1000.0; // Saldo inicial em reais

  //   print('Boas-vindas ao seu banco digital!');
  //   print('Seu saldo atual é de: R\$ ${saldo.toStringAsFixed(2)}');

  //   print('Digite o valor do Pix que deseja realizar:');
  //   double valorPix = double.parse(stdin.readLineSync()!);

  //   saldo -= valorPix;

  //   print('Pix realizado com sucesso!');
  //   print('Seu saldo atual é de: R\$ ${saldo.toStringAsFixed(2)}');
  // }
  // problemaUm();

  // void problemaDois() {
  //   double pontosIniciais = 100;

  //   print("Você tem $pontosIniciais pontos.");
  //   print("Quantos pontos você gostaria de resgatar?");
    
  //   double pontosRetirados = double.parse(stdin.readLineSync()!);

  //   double pontosRestantes = pontosIniciais - pontosRetirados;

  //   print("Você resgatou $pontosRetirados pontos. Pontos restantes: $pontosRestantes.");
  // }
  // problemaDois();

  // // Desafio de cupons
  // print('Olá! Seja bem-vindo(a) ao mercado No Precinho.\nDigite o valor gasto para resgatar cupons:');
  // double gastos = double.parse(stdin.readLineSync()!);

  // double cupons = 0;

  // while(gastos >= 50) {
  //   gastos -= 50;
  //   cupons += 1;
  // }

  // print('Você tem $cupons cupons.');
}