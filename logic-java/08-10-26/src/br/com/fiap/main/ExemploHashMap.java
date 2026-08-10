package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String, String>();
        do {
            try {
                String sigla, estado;
                do {
                    sigla = JOptionPane.showInputDialog("Digite a UF (Unidade Federal) ou digite \"fim\" para encerrar:").toUpperCase();
                    if(!sigla.equals("FIM")) {
                        estado = JOptionPane.showInputDialog("Digite o nome completo do estado informado anteriormente:");
                        if(mapa.containsKey(sigla)) {
                            JOptionPane.showMessageDialog(null, "Este estado já foi cadastrado!");
                        } else {
                            mapa.put(sigla, estado);
                        }
                    }

                } while(!sigla.equals("FIM"));
                String escolha = JOptionPane.showInputDialog("Digite a UF de um estado a sua escolha:").toUpperCase();
                if(mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "O nome completo deste estado é: " + mapa.get(escolha), "Nome do Estado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Estado não cadastrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Programa finalizado!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
