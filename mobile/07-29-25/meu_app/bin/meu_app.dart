void main() {
  Conta contaLucas = Conta("Lucas", 4554);
  Conta contaPaulo = Conta("Paulo", 3036);

  List<Conta> contas = <Conta>[contaLucas, contaPaulo];

  String string = "Guilherme";
  double number = double.parse("1518");
  
  Conta contaGuilherme = Conta(string, number);

  contas.add(contaGuilherme);

  for(Conta conta in contas) {
    print("");
    print("Titular: ${conta.titular}\nSaldo: R\$ ${conta.saldo.toStringAsFixed(2)}");
  }
  contaLucas.saldo = double.parse("3036");
  contaPaulo.saldo = 1518;

  for(Conta conta in contas) {
    print("");
    print("Titular: ${conta.titular}\nSaldo: R\$ ${conta.saldo.toStringAsFixed(2)}");
  }
}

class Conta {
  String titular;
  double saldo;

  Conta(this.titular, this.saldo);
}