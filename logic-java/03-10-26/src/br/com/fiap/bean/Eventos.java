package br.com.fiap.bean;

public class Eventos {
    public double despesaComBebida;
    public double despesaComComida;
    public double despesaComEquipe;
    public int quantidadeDeConvidados;
    public double valorDoShow;
    public float margemDeLucro;

    public double calcularValorDoIngresso() {
        double custoTotal = despesaComBebida + despesaComComida + despesaComEquipe + valorDoShow;
        double custoPorConvidado = custoTotal/quantidadeDeConvidados;
        return custoPorConvidado*(1+(margemDeLucro/100));
    }
}
