package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private float valorHoraTrabalho;

    public Funcionario() {};

    public Funcionario(String nome, LocalDate dataNascimento, float valorHoraTrabalho) {
        this.nome = nome;
        setDataNascimento(dataNascimento);
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        try {
            LocalDate inicio = LocalDate.parse("1900-01-01");
            if(dataNascimento.isAfter(inicio) && dataNascimento.isBefore(LocalDate.now())) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Data de nascimento inválida!");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public float calcularSalario() {
        return ((valorHoraTrabalho*40)*4);
    }

    public int calcularIdade() {
        Period idade = Period.between(dataNascimento, LocalDate.now());
        return idade.getYears();
    }
}
