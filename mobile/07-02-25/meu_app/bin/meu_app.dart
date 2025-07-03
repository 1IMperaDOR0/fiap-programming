import 'dart:io';

void main() {
  // Exercício 1
  double idade = 0;

  print('Digite sua idade:');
  String? entrada = stdin.readLineSync();

  if(entrada != null && entrada != "") {
    idade = double.parse(entrada);
    if(idade > 17) {
      print('Pode dirigir!');
    } else {
      print('Não pode dirigir!');
    }
  } else {
    print('Não foi encontrado nenhum valor.');
  }

  // Exrecício 2
  String mes = '0';

  print("Digite um número de 1 a 12, que eu direi o mês:");
  entrada = stdin.readLineSync();


  if(entrada != null && entrada != "") {
    mes = entrada;
    switch(mes) {
      case '1':
      print('Janeiro');

      case '2':
      print('Fevereiro');

      case '3':
      print('Março');

      case '4':
      print('Abril');

      case '5':
      print('Maio');

      case '6':
      print('Junho');

      case '7':
      print('Julho');

      case '8':
      print('Agosto');

      case '9':
      print('Setembro');

      case '10':
      print('Outubro');

      case '11':
      print('Novembro');

      case '12':
      print('Dezembro');

      break;
    }
  } else {
    print('Não foi encontrado nenhum valor.');
  }

  // Exercício 3
  double saldo = 1000.0; // Saldo inicial em reais

  print('Boas-vindas ao seu banco digital!');
  print('Seu saldo atual é de: R\$${saldo.toStringAsFixed(2)}.');

  print('Digite o valor do Pix que deseja realizar:');
  double valorPix = double.parse(stdin.readLineSync()!);


  if (valorPix > saldo) {
    print("Saldo insuficiente.");
  } else {
    double restante = saldo - valorPix;
    print("O saldo restante é R\$${restante.toStringAsFixed(2)}.");
  }

  // Exercício 4
  print("Informe sua idade:");
  entrada = stdin.readLineSync();

  if(entrada != null && entrada != "") {
    idade = double.parse(entrada);
    String pais = "";

    print("Informe o país que você se encontra (digite o número correspondente):\n1. Brasil\n2. Estados Unidos\n3. Japão");
    entrada = stdin.readLineSync();

    if(entrada != null && entrada != "") {
      pais = entrada;
      
      switch(pais) {
        case '1':
        if(idade > 17) {
          print("Pode dirigir!");
        } else {
          print('Não pode dirigir!');
        }

        case '2':
        if(idade > 15) {
          print("Pode dirigir!");
        } else {
          print('Não pode dirigir!');
        }

        case '3':
        if(idade > 19) {
          print("Pode dirigir!");
        } else {
          print('Não pode dirigir!');
        }

        break;
      }
    } else {
      print('Nenhum valor foi encontrado.');
    }
  } else {
    print('Nenhum valor foi encontrado.');
  }
}
