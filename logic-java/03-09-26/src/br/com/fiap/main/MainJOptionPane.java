package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        FolhaDePagamento folha;

        String aux;

        try {
            folha = new FolhaDePagamento();
            aux = javax.swing.JOptionPane.showInputDialog("Digite o seu salário bruto:");
            folha.salarioBruto = Double.parseDouble(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Digite o desconto do INSS:");
            folha.descontoINSS = Double.parseDouble(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Digite o número de dependentes:");
            folha.numeroDeDependentes = Integer.parseInt(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Digite o valor do plano de saúde:");
            folha.valorPlanoDeSaude = Double.parseDouble(aux);
            javax.swing.JOptionPane.showMessageDialog(null, folha.calcularSalarioLiquido());
        } catch(Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Formato inválido!");
        }
    }
}
