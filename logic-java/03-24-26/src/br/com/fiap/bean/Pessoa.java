package br.com.fiap.bean;

import java.time.LocalDate;

public class Pessoa {
    // Atributos
    private String nome;
    private int anoNascimento;

    // Construtores
    public Pessoa() {}

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        // this.anoNascimento = anoNascimento;
        setAnoNascimento(anoNascimento);
    }

    // Métodos getters/setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        LocalDate anoAtual = LocalDate.now();
        try {
            if(anoNascimento >= 1900 && anoNascimento <= anoAtual.getYear()) {
                this.anoNascimento = anoNascimento;
            } else {
                throw new RuntimeException("Ano de nascimento inválido! (min = 1900 e max = ano atual");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Métodos da classe
    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }
}
