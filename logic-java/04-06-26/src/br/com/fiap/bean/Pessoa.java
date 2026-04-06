package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa() {}

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        try {
            LocalDate inicio = LocalDate.parse("1899-12-31");
            LocalDate fim = LocalDate.now();
            if(dataNascimento.isAfter(inicio) && dataNascimento.isBefore(fim)) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Data de nascimento inválida!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            // TODO - voltar aqui depois
            // voltei
            System.exit(0);
        }
    }

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);
        return idade.getYears();
    }
}
