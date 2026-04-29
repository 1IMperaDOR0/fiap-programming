package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        String continuar = "s";
        String mensagem = "";
        String nome;
        float valorHoraTrabalho, salario;

        while (continuar.equalsIgnoreCase("s")) {
            try {
                String tipoFuncionario = JOptionPane.showInputDialog(
                        "Qual tipo de funcionário você quer calcular o salário?\n" +
                                "1. Funcionário\n" +
                                "2. Vendedor\n" +
                                "3. Vigia Noturno"
                );
                nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
                valorHoraTrabalho = Float.parseFloat(
                        JOptionPane.showInputDialog("Digite o valor que o funcionário recebe por hora:")
                );
                switch (tipoFuncionario) {
                    case "1":
                        Funcionario funcionario = new Funcionario();
                        funcionario.setNome(nome);
                        funcionario.setValorHoraTrabalho(valorHoraTrabalho);
                        salario = funcionario.calcularSalario();
                        mensagem = String.format("Nome: %s\nSalário: %.2f", nome, salario);
                        break;
                    case "2":
                        Vendedor vendedor = new Vendedor();
                        float comissao = Float.parseFloat(
                                JOptionPane.showInputDialog("Digite o valor da comissão:")
                        );
                        vendedor.setNome(nome);
                        vendedor.setValorHoraTrabalho(valorHoraTrabalho);
                        vendedor.setComissao(comissao);
                        salario = vendedor.calcularSalario();
                        mensagem = String.format("Nome: %s\nSalário: %.2f", nome, salario);
                        break;
                    case "3":
                        VigiaNoturno vigia = new VigiaNoturno();
                        float adicional = Float.parseFloat(
                                JOptionPane.showInputDialog("Digite o valor adicional noturno:")
                        );
                        vigia.setNome(nome);
                        vigia.setValorHoraTrabalho(valorHoraTrabalho);
                        vigia.setAdicionalNoturno(adicional);
                        salario = vigia.calcularSalario();
                        mensagem = String.format("Nome: %s\nSalário: %.2f", nome, salario);
                        break;
                    default:
                        throw new Exception("Opção inválida!");
                }
                JOptionPane.showMessageDialog(null, mensagem);
                continuar = JOptionPane.showInputDialog("Deseja continuar? (s/n)");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado. Volte sempre!");
    }
}