package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainGestante {
    public static void main(String[] args) {
        Gestante gravida;
        String nome, data, dataBR;
        LocalDate dataDaGestacao;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            nome = JOptionPane.showInputDialog("Digite seu nome");
            data = JOptionPane.showInputDialog("Digite inicio da gestacao (dd/MM/yyyy)");

            dataDaGestacao = LocalDate.parse(data, dtf);
            gravida = new Gestante(nome, dataDaGestacao);

            JOptionPane.showMessageDialog(null, gravida.getDataDaGestacao());

            dataBR = gravida.getDataDaGestacao().format(dtf);

            JOptionPane.showMessageDialog(
                    null,
                    String.format(
                            "Exibindo informacoes\nNome: %s \nData da gestacao: %s \nTempo de gestacao: %d mes(es)",
                            gravida.getNome(),
                            dataBR,
                            gravida.tempoDeGestacao()
                    )
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}