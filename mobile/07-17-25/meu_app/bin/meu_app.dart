import 'dart:io';

void main(List<String> arguments) {
  List<String> notas = <String>[];

  menu(notas);
}

String getComando() {
  print("Digite um comando:\n1. Adicionar nota;\n2. Listar notas;\n3. Sair.");

  String? comando = "";

  comando = stdin.readLineSync();

  return comando!;
}

List <String> adicionaNota(List<String> notas) {
  print("Escreva uma nota:");
  String? nota = "";

  nota = stdin.readLineSync();

  if(nota == null || nota == "") {
    print("Não é possível escrever uma nota vazia.");
    adicionaNota(notas);
  }

  notas.add(nota!);

  return notas;
}

void listarNotas(List<String> notas) {
  print("Suas notas:");
  for(var i = 0; i < notas.length; i++) {
    print("${i + 1}. ${notas[i]}");
  }
}

void menu(List<String> notas) {
  print("");
  asciiArt();
  print("");
  String comando = getComando();
  print("");

  switch(comando) {
    case '1':
      adicionaNota(notas);
      menu(notas);
      break;

    case '2':
      listarNotas(notas);
      menu(notas);
      break;

    case '3':
      print("Saindo...");
      break;
    
    default:
      print("Comando inválido.");
      menu(notas);
      break;
  }
}

// https://patorjk.com/software/taag/#p=display&c=echo&f=Alpha&t=Notas
void asciiArt() {
  print("           _____                   _______               _____                    _____                    _____           ");
  print("          /|    |                 /::|    |             /|    |                  /|    |                  /|    |          ");
  print("         /::|____|               /::::|    |           /::|    |                /::|    |                /::|    |         ");
  print("        /::::|   |              /::::::|    |          |:::|    |              /::::|    |              /::::|    |        ");
  print("       /:::::|   |             /::::::::|    |          |:::|    |            /::::::|    |            /::::::|    |       ");
  print("      /::::::|   |            /:::/--|:::|    |          |:::|    |          /:::/|:::|    |          /:::/|:::|    |      ");
  print("     /:::/|::|   |           /:::/    |:::|    |          |:::|    |        /:::/__|:::|    |        /:::/__|:::|    |     ");
  print("    /:::/ |::|   |          /:::/    / |:::|    |         /::::|    |      /::::|   |:::|    |       |:::|   |:::|    |    ");
  print("   /:::/  |::|   | _____   /:::/____/   |:::|    |       /::::::|    |    /::::::|   |:::|    |    ___|:::|   |:::|    |   ");
  print("  /:::/   |::|   |/|    | |:::|    |     |:::|____|     /:::/|:::|    |  /:::/|:::|   |:::|    |  /|   |:::|   |:::|    |  ");
  print(" /:: /    |::|   /::|____||:::|____|     |:::|    |    /:::/  |:::|____|/:::/  |:::|   |:::|____|/::|   |:::|   |:::|____| ");
  print(" |::/    /|::|  /:::/    / |:::|    |   /:::/    /    /:::/    |::/    /|::/    |:::|  /:::/    /|:::|   |:::|   |::/    / ");
  print("  |/____/ |::| /:::/    /   |:::|    | /:::/    /    /:::/    / |/____/  |/____/ |:::|/:::/    /  |:::|   |:::|   |/____/  ");
  print("          |::|/:::/    /     |:::|    /:::/    /    /:::/    /                    |::::::/    /    |:::|   |:::|    |      ");
  print("          |::::::/    /       |:::|__/:::/    /    /:::/    /                      |::::/    /      |:::|   |:::|____|     ");
  print("          |:::::/    /         |::::::::/    /     |::/    /                       /:::/    /        |:::|  /:::/    /     ");
  print("          |::::/    /           |::::::/    /       |/____/                       /:::/    /          |:::|/:::/    /      ");
  print("          /:::/    /             |::::/    /                                     /:::/    /            |::::::/    /       ");
  print("         /:::/    /               |::/    /                                     /:::/    /              |::::/    /        ");
  print("         |::/    /                 --____/                                      |::/    /                |::/    /         ");
  print("          |/____/                                                                |/____/                  |/____/          ");
  print("                                                                                                                           ");
}