package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Pessoa p1;
        String nome, dataNascimento;
        LocalDate minhaData;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            nome = JOptionPane.showInputDialog("Digite o seu nome:");
            dataNascimento = JOptionPane.showInputDialog("Digite a sua data de nascimento:");

            // Formatando a String com o formato brasileiro (ex.: "21/10/2000)"
            // String novaData = dataNascimento.substring(6, 10) + "-";    // 2000-
            // novaData += dataNascimento.substring(3, 5) + "-";           // 2000-10-
            // novaData += dataNascimento.substring(0, 2);                 // 2000-10-21
            // minhaData = LocalDate.parse(novaData);
            minhaData = LocalDate.parse(dataNascimento, dtf);

            // p1 = new Pessoa();
            // p1.setNome(nome);
            // p1.setDataNascimento(LocalDate.parse(dataNascimento));
            p1 = new Pessoa(nome, minhaData);

            JOptionPane.showMessageDialog(null, String.format("Nome: %s\nData de Nascimento (USA): %s\nData de Nascimento (BR): %s\nIdade: %d anos", p1.getNome(), p1.getDataNascimento(), p1.getDataNascimento().format(dtf), p1.calcularIdade()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
