package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;
import java.util.ArrayList;

public class MainSuperHeroi {
    public static void main(String[] args) {
        String  continuar = "s", poder = "s", fraqueza = "s", nome, identidade;

        while(continuar.equalsIgnoreCase("s")) {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do super-herói:");
                identidade = JOptionPane.showInputDialog(String.format("Qual é a identidade secreta do super-herói %s", nome));
                ArrayList<String> poderes = new ArrayList<>();
                do {
                    poder = JOptionPane.showInputDialog(String.format("Digite um poder do super-herói %s ou digite \"fim\" para prosseguir:", nome));
                    if(!poder.equalsIgnoreCase("fim")) {
                        poderes.add(poder);
                    }
                } while(!poder.equalsIgnoreCase("fim"));
                ArrayList<String> fraquezas = new ArrayList<>();
                do {
                    fraqueza = JOptionPane.showInputDialog(String.format("Digite uma fraqueza do super-herói %s ou digite \"fim\" para prosseguir:", nome));
                    if(!fraqueza.equalsIgnoreCase("fim")) {
                        fraquezas.add(fraqueza);
                    }
                } while(!fraqueza.equalsIgnoreCase("fim"));
                SuperHeroi heroi = new SuperHeroi(nome, identidade, poderes, fraquezas);
                heroi.listarHeroi();
                continuar = JOptionPane.showInputDialog("Você quer continuar? (s/n)");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado. Até mais!");
    }
}
