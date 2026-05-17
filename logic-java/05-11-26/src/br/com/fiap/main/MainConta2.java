package br.com.fiap.main;

import br.com.fiap.bean.ContaEspecial;

import javax.swing.*;

public class MainConta2 {
    public static void main(String[] args) {
        String aux, continuar = "s";
        int numConta, opcao;
        float saldo, valor;

        while(continuar.equalsIgnoreCase("s")) {
            try {
                aux = JOptionPane.showInputDialog("Digite o número da conta:");
                numConta = Integer.parseInt(aux);
                aux = JOptionPane.showInputDialog("Digite o saldo da conta:");
                saldo = Float.parseFloat(aux);

                ContaEspecial especial = new ContaEspecial();
                especial.setNumConta(numConta);
                especial.setSaldo(saldo);

                aux = JOptionPane.showInputDialog("Qual operação você deseja?\n1. Saque\n2. Depósito");
                opcao = Integer.parseInt(aux);
                switch(opcao) {
                    case 1:
                        aux = JOptionPane.showInputDialog("Qual o valor do saque?");
                        valor = Float.parseFloat(aux);
                        especial.sacar(valor);
                        JOptionPane.showMessageDialog(null, String.format("DADOS DA CONTA:\nNúmero: %d\nSaldo atual: %.2f", especial.getNumConta(), especial.getSaldo()));
                        break;
                    case 2:
                        aux = JOptionPane.showInputDialog("Qual o valor do depósito?");
                        valor = Float.parseFloat(aux);
                        especial.depositar(valor);
                        JOptionPane.showMessageDialog(null, String.format("DADOS DA CONTA:\nNúmero: %d\nSaldo atual: %.2f", especial.getNumConta(), especial.getSaldo()));
                        break;
                    default:
                        throw new Exception("Opção inválida!");
                }

                continuar = JOptionPane.showInputDialog("Deseja continuar? (s/n)");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Programa encerrado. Até mais!");
    }
}
