package br.com.fiap;

import javax.swing.*;

public class Exercicio_1_1 {
    public static void main(String[] args) {
        String aux;
        double nota1, nota2, nota3, nota4;

        try {
            aux = JOptionPane.showInputDialog("Digite uma nota:");
            nota1 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite outra nota:");
            nota2 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite outra nota:");
            nota3 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite outra nota:");
            nota4 = Double.parseDouble(aux);

            double media = (nota1 + nota2 + nota3 + nota4)/4;
            JOptionPane.showMessageDialog(null, media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato inválido! Digite um número válido.");
        }
    }
}
