package br.com.fiap;

import javax.swing.*;

public class Exercicio_4_1 {
    public static void main(String[] args) {
        String aux;
        double a, b, c, delta, x1, x2;

        try {
            aux = JOptionPane.showInputDialog("Digite o a:");
            a = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite o b:");
            b = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite o c:");
            c = Double.parseDouble(aux);
            delta = Math.pow(b, 2) - (4 * a * c);
            delta = Math.sqrt(delta);
            x1 = (-b + delta)/(2 * a);
            x2 = (-b - delta)/(2 * a);
            JOptionPane.showMessageDialog(null, "O x1 é " + x1);
            JOptionPane.showMessageDialog(null, "O x2 é " + x2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato inválido! Precisa ser um número.");
        }
    }
}
