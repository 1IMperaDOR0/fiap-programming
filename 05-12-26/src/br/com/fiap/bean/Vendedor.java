package br.com.fiap.bean;
/**
 * Classe para objetos do tipo Vendedor
 * essa classe implementa a interface Funcionario
 * @author Henrique
 * @version 1.0
 */
public class Vendedor implements Funcionario{
    private String nome;
    private float valorHoraTrabalho;
    private float comissao;

    public Vendedor() {}

    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        super();
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    /**
     * Método calcularSalario que retorna o valor do salário
     * deste tipo de funcionário (Vendedor)
     * @author Henrique
     * @return float - retorna o valor do salário
     */
    public float calcularSalario() {
        float salario = ((valorHoraTrabalho * 40) * 4) * (1 + comissao / 100);
        return salario;
    }
}
