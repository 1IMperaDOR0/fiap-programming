import 'dart:io';

void main() {
  // Exercício 1
  Receita macarrao = Receita("Macarrão ao pesto", 20);
  Receita lasanha = Receita("Lasanha 4 queijos", 32);
  Receita burrata = Receita("Burrata com pesto", 28);

  List<Receita> receitas = <Receita>[macarrao, lasanha, burrata];

  for(Receita receita in receitas) {
    print("Receita: ${receita.nome} | Preço: R\$ ${receita.preco.toStringAsFixed(2)}.");
  }

  // Exercício 2
  ItemEstoque smartphone = ItemEstoque("Smartphone", 100, 1000.00);
  ItemEstoque notebook = ItemEstoque("Notebook", 50, 2000.00);

  List<ItemEstoque> itens = <ItemEstoque>[smartphone, notebook];

  for(ItemEstoque item in itens) {
    print("Produto: ${item.nome}, Quantidade em estoque: ${item.qtd}, Preço: R\$ ${item.preco.toStringAsFixed(2)}");
  }

  // Exercícios 3 e 4
  ItemEstoque monitor = ItemEstoque("Monitor", 75, 700.00);
  ItemEstoque mouse = ItemEstoque("Mouse", 250, 20.00);
  ItemEstoque gabinete = ItemEstoque("Gabinete", 100, 200.00);
  ItemEstoque ssd = ItemEstoque("SSD", 500, 500.00);

  itens.add(monitor);
  itens.add(mouse);
  itens.add(gabinete);
  itens.add(ssd);

  getProduto(itens);
}

class Receita {
  String nome;
  double preco;

  Receita(this.nome, this.preco);
}

class ItemEstoque {
  String nome;
  int qtd;
  double preco;

  ItemEstoque(this.nome, this.qtd, this.preco);
}

void getProduto(List<ItemEstoque> itens) {
    print("Escolha, digitando o número correspondente de um produto, para prosseguir:");
    for(var i = 0; i < itens.length; i++) {
      print("${i + 1}. ${itens[i].nome}");
    }
    String? produto = stdin.readLineSync();

    if(produto == null || produto == "") {
      print("A entrada não pode ser vazia.");
      getProduto(itens);
      return;
    } 
    
    int? indice = int.tryParse(produto);

    if (indice == null || indice < 1 || indice > itens.length) {
      print("Número inválido. Tente novamente.");
      getProduto(itens);
      return;
    }

    ItemEstoque itemEscolhido = itens[indice - 1];
    getOpcao(itemEscolhido);
  }

void getOpcao(escolha) {
  print("Escolha, digitando o número correspondente a opção, para adicionar ou remover do estoque ou alterar preco:\n1. Adicionar\n2. Remover\n3. Alterar");
  String? opcao = stdin.readLineSync();

  if(opcao == null || opcao == "") {
    print("A entrada não pode ser vazia.");
    getOpcao(escolha);
  } else {
    switch(opcao) {
      case '1':
        print("Digite a quantidade para adicionar ao estoque do produto ${escolha.nome}:");
        String? add = stdin.readLineSync();
        
        if(add == null || add == "") {
          print("A entrada não pode ser vazia.");
          getOpcao(escolha);
        } else {
          int valor = int.parse(add);
          escolha.qtd += valor;
          print("Produto: ${escolha.nome}, Quantidade em estoque (atualizado): ${escolha.qtd}, Preço: R\$ ${escolha.preco.toStringAsFixed(2)}");
        }
        break;
      
      case '2':
        print("Digite a quantidade para remover do estoque do produto ${escolha.nome}:");
        String? remove = stdin.readLineSync();
        
        if(remove == null || remove == "") {
          print("A entrada não pode ser vazia.");
          getOpcao(escolha);
        } else if(int.parse(remove) > escolha.qtd) {
          print("Limite extrapolado. Tente novamente.");
          getOpcao(escolha);
        } else {
          int valor = int.parse(remove);
          escolha.qtd -= valor;
          print("Produto: ${escolha.nome}, Quantidade em estoque (atualizado): ${escolha.qtd}, Preço: R\$ ${escolha.preco.toStringAsFixed(2)}");
        }
        break;

        case '3':
        print("Digite o novo preço do produto ${escolha.nome}:");
        String? newPreco = stdin.readLineSync();
        
        if(newPreco == null || newPreco == "") {
          print("A entrada não pode ser vazia.");
          getOpcao(escolha);
        } else {
          double valor = double.parse(newPreco);
          escolha.preco = valor;
          print("Produto: ${escolha.nome}, Quantidade em estoque: ${escolha.qtd}, Preço (atualizado): R\$ ${escolha.preco.toStringAsFixed(2)}");
        }
        break;
    }
  }
}