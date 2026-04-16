package br.com.fiap.main;

import br.com.fiap.bean.Adicao;

import javax.swing.*;

public class MainAdicao {
    public static void main(String[] args) {
        Adicao add = new Adicao();
        String mensagem;
        String escolha = "s";

        while(escolha.equalsIgnoreCase("s")) {
            try {
                String opcao = JOptionPane.showInputDialog("Bem-vindo a Calculadora de Adição!\nPor favor, escolha umas das opções abaixo para fazer o cálculo:\n    1. Números reais\n    2. Números inteiros");
                switch (opcao) {
                    case "1":
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                        add.setNumInteiro1(n1);
                        add.setNumInteiro2(n2);
                        mensagem = String.format("Os números digitados foram: %d e %d\nO resultado da soma é %d", n1, n2, add.somar(add.getNumInteiro1(), add.getNumInteiro2()));
                        break;
                    case "2":
                        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                        add.setNumReal1(n3);
                        add.setNumReal2(n4);
                        mensagem = String.format("Os números digitados foram: %.2f e %.2f\nO resultado da soma é %.2f", n3, n4, add.somar(add.getNumReal1(), add.getNumReal2()));
                        break;
                    default:
                        throw new Exception("Opção inválida!");
                }
                JOptionPane.showMessageDialog(null, mensagem);
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado!");
    }
}
