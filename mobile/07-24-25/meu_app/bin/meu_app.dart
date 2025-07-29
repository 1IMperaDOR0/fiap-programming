import 'dart:io';

void main(List<String> arguments) {
  // Exercício 1
  void getNumeros() {
    print("Digite uma quantidade de números para imprimir:");
    String? quantidade = stdin.readLineSync();

    if(quantidade == null || quantidade == "") {
      print("Quantidade inválida!");
      getNumeros();
    } else {
      int qtd = int.parse(quantidade);
      for(var i = 1; i <= qtd; i++) {
        print(i);
      }
    }
  }

  getNumeros();

  // Exercício 2
  List<String> nomes = <String>["Carlos", "Julio", "Renato"];

  void getNomes() {
    print("Adicione um nome a lista:");
    String? nome = stdin.readLineSync();

    if(nome == null || nome == "") {
      print("Nome inválido.");
      getNomes();
    } else {
      nomes.add(nome);
      for(var i = 0; i < nomes.length; i++) {
        print("Nome: ${nomes[i]}");
      }
    }
  }

  getNomes();

  // Exercício 3
  String texto = "Parou! Este código não continua.";
  String i = '';
  int index = 0;

  while(i != '!') {
    print(texto[index]);
    i = texto[index];
    index++;
  }
}
