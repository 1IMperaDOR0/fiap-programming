package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;

public class MainEquipe {
    public static void main(String[] args) {
        String continuar = "s";

        Equipe equipe = new Equipe();

        while(continuar.equalsIgnoreCase("s")) {
            try {
                String aux = JOptionPane.showInputDialog("Digite o nome da equipe:");
                String nome = aux;
                equipe.setNome(nome);
                aux = JOptionPane.showInputDialog(String.format("Quantos integrantes tem na sua equipe %s", equipe.getNome()));
                int qtd = Integer.parseInt(aux);
                String[] integrantes = new String[qtd];
                for(int i = 0; i < integrantes.length; i++) {
                    integrantes[i] = JOptionPane.showInputDialog(String.format("Digite o nome do integrante %d:", i+1));
                }
                equipe.setIntegrantes(integrantes);
                aux = JOptionPane.showInputDialog(String.format("Deseja listar a sua equipe %s?", equipe.getNome()));
                if(aux.equalsIgnoreCase("sim")) {
                    equipe.listarEquipe();
                }
                continuar = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            JOptionPane.showMessageDialog(null, "Programa finalizado. Até +!");
        }
    }
}
