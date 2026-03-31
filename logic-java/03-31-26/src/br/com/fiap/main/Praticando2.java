package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Praticando2 {
    public static void main(String[] args) {
        LocalDate dataInicial, dataFinal;
        String aux, mensagem;

        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            aux = javax.swing.JOptionPane.showInputDialog("Digite uma data inicial:");
            dataInicial = LocalDate.parse(aux, dtf);
            aux = javax.swing.JOptionPane.showInputDialog("Digite uma data final:");
            dataFinal = LocalDate.parse(aux, dtf);
            Period periodo = Period.between(dataInicial, dataFinal);
            mensagem = String.format("Data inicial: %s\nData final: %s\nEntre as datas fornecidas, existem %d ano(s), %d mês(es) e %d dia(s)!", dataInicial.format(dtf), dataFinal.format(dtf), periodo.getYears(), periodo.getMonths(), periodo.getDays());
            javax.swing.JOptionPane.showMessageDialog(null, mensagem);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Formato inválido!");
            throw new RuntimeException(e);
        }
    }
}
