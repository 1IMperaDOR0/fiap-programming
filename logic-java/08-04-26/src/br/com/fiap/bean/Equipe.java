package br.com.fiap.bean;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Equipe {
    private String nome;
    private ArrayList<String> integrantes;

    public Equipe() {}

    public Equipe(String nome, ArrayList<String> integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<String> integrantes) {
        this.integrantes = integrantes;
    }

    public void listarEquipe() {
        String exibe = String.format("Nome da Equipe: %s\n", nome);
        Collections.sort(integrantes);
        int cont = 1;
        for(String e: integrantes) {
            exibe += String.format("Integrante %d: %s\n", cont, e);
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe, "Listagem da Equipe", JOptionPane.INFORMATION_MESSAGE);
    }
}
