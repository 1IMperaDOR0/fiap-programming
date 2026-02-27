package br.com.fiap;

import javax.swing.*;

public class Exercicio_3_1 {
    public static void main(String[] args) {
        String aux;
        double areaCirculo, raio;
        boolean sucesso = false;

        while(!sucesso) {
            try {
                aux = JOptionPane.showInputDialog("Digite o raio do círculo:");
                raio = Double.parseDouble(aux);
                areaCirculo = Math.pow(raio, 2) * Math.PI;
                JOptionPane.showMessageDialog(null, "A área do círculo é " + areaCirculo);
                sucesso = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Formato inválido! Digite um número válido.");
            }
        }
    }
}
