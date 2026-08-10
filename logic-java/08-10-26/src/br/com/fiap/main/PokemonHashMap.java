package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> pokeDex = new HashMap<String, ArrayList<String>>();
        do {
            try {
                String type, pokeName;
                ArrayList<String> pokeNames = new ArrayList<>();
                do {
                    type = JOptionPane.showInputDialog("Digite a tipagem do Pokemon (Fogo, Grama, Agua, Inseto, Terra, Pedra, Aço, Fada, Dragão, Psiquico, Sombrio, Veneno, Normal, Lutador, Eletrico, Gelo, Fantasma ou Voador) ou digite \"fim\" para encerrar:").toUpperCase();
                    if(!type.equals("FIM")) {
                        pokeName = JOptionPane.showInputDialog("Digite o nome completo do Pokemon deste tipo:");
                        if(pokeDex.containsKey(pokeName)) {
                            JOptionPane.showMessageDialog(null, "Este Pokemon já foi cadastrado!");
                        } else {
                            pokeNames.add(pokeName);
                            pokeDex.put(type, pokeNames);
                        }
                    }
                } while(!type.equals("FIM"));
                String escolha = JOptionPane.showInputDialog("Digite a tipagem de um Pokemon a sua escolha:").toUpperCase();
                if(pokeDex.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "Os Pokemons deste tipo são: " + pokeDex.get(escolha), "Nome do pokemon", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Pokemon não cadastrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Programa finalizado!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
