package br.com.fiap.main;

import br.com.fiap.bean.Freelancer;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        String aux, nome, exibe;
        float salario, valorHora;
        int resposta = 0;
        while (resposta == 0) {
            try {
                aux = JOptionPane.showInputDialog("Qual o tipo de funcionario?"
                        + "\n(1) Freelancer \n(2) Vigia noturno \n(3) Vendedor");
                int opcao = Integer.parseInt(aux);
                nome = JOptionPane.showInputDialog("Digite seu nome");
                aux = JOptionPane.showInputDialog("Digite valor da hora de trabalho");
                valorHora = Float.parseFloat(aux);
                switch (opcao) {
                    case 1:
                        aux = JOptionPane.showInputDialog("Digite seu CNPJ:");
                        long cnpj = Long.parseLong(aux);
                        Freelancer freela = new Freelancer(nome, valorHora, cnpj);
                        salario = freela.calcularSalario();
                        exibe = "Exibindo os dados: \nNome: " + freela.getNome()
                                + "\nSalario: R$ " + salario;
                        break;
                    case 2:
                        aux = JOptionPane.showInputDialog("Qual valor do adicional noturno mensal?");
                        float adicional = Float.parseFloat(aux);
                        VigiaNoturno vigia = new VigiaNoturno(nome, valorHora, adicional);
                        salario = vigia.calcularSalario();
                        exibe = "Exibindo os dados: \nNome: " + vigia.getNome()
                                + "\nSalario: R$ " + salario;
                        break;
                    case 3:
                        aux = JOptionPane.showInputDialog("Qual a porcetagem da comissao?");
                        float comissao = Float.parseFloat(aux);
                        Vendedor vend = new Vendedor(nome, valorHora, comissao);
                        salario = vend.calcularSalario();
                        exibe = "Exibindo os dados: \nNome: " + vend.getNome()
                                + "\nSalario: R$ " + salario;
                        break;
                    default:
                        throw new Exception("Escolha incorreta!");
                }
                JOptionPane.showMessageDialog(null, exibe, "Resultados", JOptionPane.INFORMATION_MESSAGE);
                resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
                        "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Programa encerrado. Volte sempre!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}