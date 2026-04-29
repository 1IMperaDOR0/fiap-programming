package br.com.fiap.bean;

public class Funcionario {
    private String nome;
    private float valorHoraTrabalho;

    public Funcionario() {}

    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
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

    public float calcularSalario() {
        return valorHoraTrabalho*40*4;
    }
}
