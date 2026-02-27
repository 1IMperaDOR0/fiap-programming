package br.com.fiap;

import javax.swing.*;

public class Exercicio_1_1 {
    public static void main(String[] args) {
        String aux;
        double b, h, areaRetangulo;

        try {
            aux = JOptionPane.showInputDialog("Digite a base do retângulo:");
            b = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a altura do retângulo:");
            h = Double.parseDouble(aux);
            areaRetangulo = b * h;
            JOptionPane.showMessageDialog(null, "A área do retângulo é: " + areaRetangulo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato inválido. Precisa ser um número.");
        }
    }
}
