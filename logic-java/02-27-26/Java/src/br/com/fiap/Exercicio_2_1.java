package br.com.fiap;

import javax.swing.*;

public class Exercicio_2_1 {
    public static void main(String[] args) {
        String aux;
        double b, h, areaTriangulo;

        try {
            aux = JOptionPane.showInputDialog("Digite a base do triângulo:");
            b = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite a altura do triângulo:");
            h = Double.parseDouble(aux);
            areaTriangulo = (b * h)/2;
            JOptionPane.showMessageDialog(null, "A área do triângulo é " + areaTriangulo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato inválido! Precisa ser um número.");
        }
    }
}
