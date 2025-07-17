import 'dart:io';

void main(List<String> arguments) {
  // Aplicando o conceito de recursividade
  int fatorial(int n) {
      if (n == 0) {
          return 1; // Caso base: fatorial de 0 é definido como 1
      } else {
          return n * fatorial(n - 1); // Chamada recursiva: multiplica n por fatorial(n - 1)
      }
  }

  int resultado = fatorial(5); // Armazena o resultado do fatorial de 5
  print(resultado); // Exibe o valor do fatorial: 120 (5 * 4 * 3 * 2 * 1)

  // Exercício 1
  List<String> categorias = <String>["eletronicos", "alimentos", "vestuario", "livros"];
  String categoria = "";
  String? entrada_1 = "";

  void getCategoria() {
    print("Digite a categoria do produto ${categorias.toString()}");
    entrada_1 = stdin.readLineSync();
    if(entrada_1 != null && entrada_1 != "") {
      if(categorias.contains(entrada_1)) {
        categoria = entrada_1!;
        switch(categoria) {
          case "eletronicos":
          print("Categoria válida: $categoria.");

          case "alimentos":
          print("Categoria válida: $categoria.");

          case "vestuario":
          print("Categoria válida: $categoria.");

          case "livros":
          print("Categoria válida: $categoria.");

          break;
        }
      } else {
        print("Categoria inválida.");
        getCategoria();
      }
    } else {
        print("Categoria inválida.");
        getCategoria();
    }
  }

  getCategoria();

  // Exercício 2
  List<String> arquivos = <String>["pdf", "jpg", "png", "docx"];
  String arquivo = "";
  String? entrada_2 = "";

  void getArquivo() {
    print("Digite o tipo do seu arquivo para validação. São aceitos apenas arquivos com extensões ${arquivos.toString()}.");
    entrada_2 = stdin.readLineSync();
    if(entrada_2 != null && entrada_2 != "") {
      if(arquivos.contains(entrada_2)) {
        arquivo = entrada_2!;
        switch(arquivo) {
          case "pdf":
          print("Arquivo $arquivo foi aceito.");
          
          case "jpg":
          print("Arquivo $arquivo foi aceito.");

          case "png":
          print("Arquivo $arquivo foi aceito.");

          case "dock":
          print("Arquivo $arquivo foi aceito.");

          break;
        }
      } else {
          print("Arquivo inválido.");
          getArquivo();
      }
    } else {
      print("Arquivo inválido.");
      getArquivo();
    }
  }

  getArquivo();

  // Exercício 3
  // Função que retorna o mês correspondente
  String obterMes(numero) {
    switch(numero) {
      case 1:
        return 'Janeiro';
      case 2:
        return 'Fevereiro';
      case 3:
        return 'Março';
      case 4:
        return 'Abril';
      case 5:
        return 'Maio';
      case 6:
        return 'Junho';
      case 7:
        return 'Julho';
      case 8:
        return 'Agosto';
      case 9:
        return 'Setembro';
      case 10:
        return 'Outubro';
      case 11:
        return 'Novembro';
      case 12:
        return 'Dezembro';
      default:
        return 'Número inválido. Por favor, insira um número de 1 a 12.';
    }
  }

  void getNum() {
    print('Digite um número de 1 a 12 para saber o mês correspondente:');
    String? input = stdin.readLineSync();
    if(input != null && input != "") {
      // Null safety e conversão de entrada
      int numero = int.parse(input);
      String mes = obterMes(numero);
      print(mes);
      
      if(mes == "Número inválido. Por favor, insira um número de 1 a 12.") {
        getNum();
      }
    }
  }

  getNum();

  // Exercício 4
  List<String> operacoes = <String>["deposito", "retirada", "transferencia", "pagamento"];
  String? operacao = "";
  double deposito = 0;
  double retirada = 0;
  double transferencia = 0;
  double pagamento = 0;

  void getValor() {
    print("Digite o valor da operação:");
    String? numero = stdin.readLineSync();

    if(numero != null && numero != "") {
      double valor = double.parse(numero);
      if(valor > 0) {
        switch(operacao) {
          case "deposito":
            deposito += valor;
            print("Operação escolhida: $operacao, Valor: R\$ ${deposito.toStringAsFixed(2)}.");
          case "retirada":
            retirada += valor;
            print("Operação escolhida: $operacao, Valor: R\$ ${retirada.toStringAsFixed(2)}.");
          case "transferencia":
            transferencia += valor;
            print("Operação escolhida: $operacao, Valor: R\$ ${transferencia.toStringAsFixed(2)}.");
          case "pagamento":
            pagamento += valor;
            print("Operação escolhida: $operacao, Valor: R\$ ${pagamento.toStringAsFixed(2)}.");
        }
      } else {
        print("Valor inválido! Tente novamente.");
        getValor();
      }
    } else {
      print("Valor inválido! Tente novamente.");
      getValor();
    }
  }

  void getOperacao() {
    print("Digite uma operação ${operacoes.toString()}");
    operacao = stdin.readLineSync();

    if(operacao != null && operacao != "") {
      if(operacoes.contains(operacao)) {
        getValor();
      } else {
        print("Operação inválida! Tente novamente.");
        getOperacao();
      }
    } else {
      print("Operação inválida! Tente novamente.");
      getOperacao();
    }
  }

  getOperacao();

  // Exercício 5
  List<String> metodos = <String>["cartao", "boleto", "paypal", "pix"];

  void getMetodo() {
    print("Digite um método de pagamento ${metodos.toString()}");
    String? metodo = stdin.readLineSync();

    if(metodo != null && metodo != "") {
      if(metodos.contains(metodo)) {
        print("O método de pagamento selecionado foi $metodo.");
      } else {
        print("Método inválido! Tente novamente.");
        getMetodo();
      }
    } else {
      getMetodo();
    }
  }

  getMetodo();
}