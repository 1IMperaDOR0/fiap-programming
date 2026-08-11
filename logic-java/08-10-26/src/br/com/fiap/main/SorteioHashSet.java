package br.com.fiap.main;

import javax.swing.*;
import java.util.*;

public class SorteioHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numerosSOrteados = new HashSet<Integer>();
        Random random = new Random();
        do {
            JOptionPane.showMessageDialog(null,"COnfira a seguir o resultadado da loteria da sorte premiada!", "Loteria",JOptionPane.INFORMATION_MESSAGE);
            while (numerosSOrteados.size()<6){
                int numero = random.nextInt(59) +1;
                numerosSOrteados.add(numero);
            }
            ArrayList<Integer> resultadoDoSorteio = new ArrayList<Integer>(numerosSOrteados);
            Collections.sort(resultadoDoSorteio);
            JOptionPane.showMessageDialog(null,"Os numeros sorteados são:\n" + resultadoDoSorteio);
            numerosSOrteados.clear();
        } while (JOptionPane.showConfirmDialog(null,"Deseja contnuar?", "atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)== 0);
        JOptionPane.showMessageDialog(null,"Fim do programa!","Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
