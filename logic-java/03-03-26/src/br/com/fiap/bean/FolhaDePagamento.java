package br.com.fiap.bean;

public class FolhaDePagamento {
    public double salarioBruto, descontoINSS, valorPlanoDeSaude;
    public int numeroDeDependentes;

    public double calcularSalarioLiquido() {
        valorPlanoDeSaude *= (numeroDeDependentes+1);
        double descontos = (salarioBruto*(descontoINSS/100)) + valorPlanoDeSaude;
        salarioBruto -= descontos;
        return salarioBruto;
    }
}
