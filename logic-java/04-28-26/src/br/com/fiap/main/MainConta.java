package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.bean.ContaEspecial;
import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;
import java.time.LocalDate;

public class MainConta {
    public static void main(String[] args) {
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            try {
                String tipo = JOptionPane.showInputDialog(
                        "Qual tipo de conta você possui?\n" +
                                "1. Conta Bancária\n" +
                                "2. Conta Poupança\n" +
                                "3. Conta Especial"
                );
                String nome = JOptionPane.showInputDialog("Digite seu nome:");
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
                float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo inicial:"));
                float deposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para depósito:"));
                float saque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para saque:"));
                switch(tipo) {
                    case "1":
                        ContaBancaria conta = new ContaBancaria();
                        conta.setCliente(nome);
                        conta.setNumConta(numero);
                        conta.setSaldo(saldo);
                        conta.depositar(deposito);
                        conta.sacar(saque);
                        JOptionPane.showMessageDialog(
                                null,
                                "Cliente: " + conta.getCliente() +
                                        "\nConta: " + conta.getNumConta() +
                                        "\nSaldo atual: R$ " + conta.getSaldo()
                        );
                        break;
                    case "2":
                        ContaPoupanca poupanca = new ContaPoupanca();
                        poupanca.setCliente(nome);
                        poupanca.setNumConta(numero);
                        poupanca.setSaldo(saldo);
                        int diaRendimento = Integer.parseInt(
                                JOptionPane.showInputDialog("Digite o dia de rendimento:")
                        );
                        poupanca.setDiaDeRendimento(diaRendimento);
                        poupanca.depositar(deposito);
                        poupanca.sacar(saque);
                        int diaAtual = LocalDate.now().getDayOfMonth();

                        if (diaAtual >= poupanca.getDiaDeRendimento()) {
                            float taxa = Float.parseFloat(
                                    JOptionPane.showInputDialog("Digite a taxa de rendimento:")
                            );
                            float novoSaldo = poupanca.novoSaldo(taxa);

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Rendimento aplicado!\nNovo saldo: R$ " + novoSaldo
                            );
                        } else {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Ainda não é dia de rendimento."
                            );
                        }
                        JOptionPane.showMessageDialog(
                                null,
                                "Cliente: " + poupanca.getCliente() +
                                        "\nConta: " + poupanca.getNumConta() +
                                        "\nSaldo atual: R$ " + poupanca.getSaldo() +
                                        "\nDia de rendimento: " + poupanca.getDiaDeRendimento()
                        );
                        break;
                    case "3":
                        ContaEspecial especial = new ContaEspecial();
                        especial.setCliente(nome);
                        especial.setNumConta(numero);
                        especial.setSaldo(saldo);
                        float limite = Float.parseFloat(
                                JOptionPane.showInputDialog("Digite o limite da conta:")
                        );
                        especial.setLimite(limite);
                        especial.depositar(deposito);
                        especial.sacar(saque);
                        JOptionPane.showMessageDialog(
                                null,
                                "Cliente: " + especial.getCliente() +
                                        "\nConta: " + especial.getNumConta() +
                                        "\nSaldo atual: R$ " + especial.getSaldo() +
                                        "\nLimite: R$ " + especial.getLimite()
                        );
                        break;
                    default:
                        throw new Exception("Opção inválida!");
                }
                continuar = JOptionPane.showInputDialog("Deseja continuar? (s/n)");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado. Até a próxima!");
    }
}