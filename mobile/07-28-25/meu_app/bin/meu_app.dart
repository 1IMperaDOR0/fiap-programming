import 'dart:io';

void main() {
  // ASCII Art de boas-vindas
  print(r'''
  ================================
  ||  SISTEMA DE NOTAS ESCOLAR  ||
  ================================
  ''');

  List<String> alunos = [];
  List<List<double>> notasDosAlunos = [];

  bool executando = true;

  while (executando) {
    print('\nEscolha uma opção:');
    print('1 - Registrar um aluno e suas notas');
    print('2 - Ver lista de alunos e suas médias');
    print('3 - Sair do programa');
    stdout.write('-> ');
    String? opcao = stdin.readLineSync();

    switch (opcao) {
      case '1':
        registrarAluno(alunos, notasDosAlunos);
        break;
      case '2':
        exibirAlunosEMedias(alunos, notasDosAlunos);
        break;
      case '3':
        print('\nEncerrando o sistema. Até mais!');
        executando = false;
        break;
      default:
        print('Opção inválida. Tente novamente.');
    }
  }
}

// Função para registrar aluno e suas notas
void registrarAluno(List<String> alunos, List<List<double>> notasDosAlunos) {
  stdout.write('\nDigite o nome do aluno:\n-> ');
  String? nome = stdin.readLineSync();

  if (nome == null || nome.trim().isEmpty) {
    print('Nome inválido! Operação cancelada.');
    return;
  }

  alunos.add(nome);
  List<double> notas = [];

  while (true) {
    stdout.write('Digite uma nota para $nome (ou "fim" para terminar):\n-> ');
    String? entrada = stdin.readLineSync();

    if (entrada == null || entrada.toLowerCase() == 'fim') {
      break;
    }

    try {
      double nota = double.parse(entrada);
      notas.add(nota);
    } catch (_) {
      print('Nota inválida. Tente novamente.');
    }
  }

  notasDosAlunos.add(notas);
  print('Aluno $nome registrado com ${notas.length} nota(s).');
}

// Função para calcular média
double calcularMedia(List<double> notas) {
  if (notas.isEmpty) return 0.0;

  double soma = 0;
  for (var nota in notas) {
    soma += nota;
  }

  return soma / notas.length;
}

// Função para exibir alunos e médias
void exibirAlunosEMedias(List<String> alunos, List<List<double>> notasDosAlunos) {
  print('\n===== LISTA DE ALUNOS =====');
  for (int i = 0; i < alunos.length; i++) {
    double media = calcularMedia(notasDosAlunos[i]);
    print('${i + 1}. ${alunos[i]} - Média: ${media.toStringAsFixed(2)}');
  }

  if (alunos.isEmpty) {
    print('Nenhum aluno registrado ainda.');
  }
}