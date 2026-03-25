package br.com.fiap.bean;

public class Funcionario {
    private String nome;
    private float valorHoraTrabalho;

    public  Funcionario() {};

    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        setValorHoraTrabalho(valorHoraTrabalho);
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
        try {
            if(valorHoraTrabalho > 0) {
                this.valorHoraTrabalho = valorHoraTrabalho;
            } else {
                this.valorHoraTrabalho = 0;
                throw new RuntimeException("Valor inválido! (min > 0)");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public float calcularSalario(float qtdeHorasTrabalhadasSemana) {
        return qtdeHorasTrabalhadasSemana * valorHoraTrabalho * 4;
    }
}
