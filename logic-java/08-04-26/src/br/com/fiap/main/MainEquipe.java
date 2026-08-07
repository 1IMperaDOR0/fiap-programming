package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;
import java.util.ArrayList;

public class MainEquipe {
    public static void main(String[] args) {
        Equipe grupo;
        String aux, nome;

        do {
            nome = JOptionPane.showInputDialog("Digite o nome da Equipe:");
            ArrayList<String> integrantes = new ArrayList<>();
            do {
                aux = JOptionPane.showInputDialog("Digite o integrante desta Equipe ou digite \"fim\" para encerrar:");
                if(!aux.equalsIgnoreCase("fim")) {
                    integrantes.add(aux);
                }
            } while(!aux.equalsIgnoreCase("fim"));
            grupo = new Equipe(nome, integrantes);
            grupo.listarEquipe();
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    }
}
