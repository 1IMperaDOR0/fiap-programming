package br.com.fiap;

import javax.swing.*;

public class Exercicio_3_1 {
    public static void main(String[] args) {
        String aux;
        double B, b, h, areaTrapezio;

        try {
            aux = JOptionPane.showInputDialog("Digite a base maior do trapézio:");
            B = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a base menor do trapézio:");
            b = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a altura do trapézio:");
            h = Double.parseDouble(aux);
            areaTrapezio = ((B + b) * h)/2;
            JOptionPane.showMessageDialog(null, "A área do trapézio é " + areaTrapezio);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato inválido! Precisa ser um número.");
        }
    }
}
