package br.com.fiap.main;

import br.com.fiap.bean.Eventos;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        Eventos ingresso = new Eventos();

        String aux;

        try {
            aux = javax.swing.JOptionPane.showInputDialog("Digite as despesa relacionado a bebidas:");
            ingresso.despesaComBebida = Double.parseDouble(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Digite as despesa relacionado a comidas:");
            ingresso.despesaComComida = Double.parseDouble(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Digite as despesa relacionado a equipe:");
            ingresso.despesaComEquipe = Double.parseDouble(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Digite o valor do Show:");
            ingresso.valorDoShow = Double.parseDouble(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Digite a margem de lucro:");
            ingresso.margemDeLucro = Float.parseFloat(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Digite a quantidade de convidados:");
            ingresso.quantidadeDeConvidados = Integer.parseInt(aux);
            String mensagem = String.format("O valor do ingresso é de R$ %.2f", ingresso.calcularValorDoIngresso());
            javax.swing.JOptionPane.showMessageDialog(null, mensagem);
            ingresso.despesaComBebida = Double.parseDouble(aux);
        } catch(Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Formato inválido!");
        }
    }
}
