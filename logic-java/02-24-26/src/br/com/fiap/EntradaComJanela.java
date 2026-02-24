package br.com.fiap;

import javax.swing.*;

public class EntradaComJanela {
    public static void main(String[] args) {
        int n1, n2, resultado;
        String aux;

        try {
            aux = javax.swing.JOptionPane.showInputDialog("Digite o primeiro número:");
            n1 = Integer.parseInt(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Digite o segundo número:");
            n2 = Integer.parseInt(aux);
            resultado = n1 + n2;
            javax.swing.JOptionPane.showMessageDialog(null, "O primeiro número digitado foi: " + n1 + "\nO segundo número digitado foi: " + n2 + "\nA soma dos dois números é: " + resultado);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Formato inválido. Digite um número inteiro.");
        }
    }
        
}
