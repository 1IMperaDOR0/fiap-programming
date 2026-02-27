package br.com.fiap;

import javax.swing.*;

public class Exercicio_2_1 {
    public static void main(String[] args) {
        String aux;
        int anoAtual, anoNascimento, idade;

        try {
            aux = JOptionPane.showInputDialog("Digite o ano atual:");
            anoAtual = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Digite o seu ano de nascimento:");
            anoNascimento = Integer.parseInt(aux);
            idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Formato inválido! Digite um número válido.");
        }
    }
}
