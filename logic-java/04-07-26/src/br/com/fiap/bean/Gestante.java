package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    private String nome;
    private LocalDate dataDaGestacao;

    public Gestante() {}

    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
        setDataDaGestacao(dataDaGestacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }

    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        try {
            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(dataDaGestacao, dataAtual);
            if(periodo.getMonths() <= 9 && periodo.getYears() == 0) {
                this.dataDaGestacao = dataDaGestacao;
            } else {
                throw new Exception("Data inválida!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public int tempoDeGestacao() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataDaGestacao, dataAtual);
        return periodo.getMonths();
    }
}
