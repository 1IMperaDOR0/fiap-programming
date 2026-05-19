package br.com.fiap.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class GUIPrincipal extends JFrame{
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo;
    private JMenu mnGeometria;
    private JMenuItem miSair;
    private JMenuItem miAreas;

    public GUIPrincipal() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Janela Principal");
        setBounds(0,0,600,400);
        contentPane = getContentPane();

        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnGeometria = new JMenu("Geometria");
        mnGeometria.setMnemonic('G');
        miAreas = new JMenuItem("Áreas");
        miSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("images/exit_icon.png")));

        setJMenuBar(mnBarra);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnGeometria);
        mnArquivo.add(miSair);
        mnGeometria.add(miAreas);
    }

    private void definirEventos() {
        miSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        miAreas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIAreas areas = new GUIAreas();
                contentPane.removeAll();
                contentPane.add(areas);
                contentPane.validate();
            }
        });
    }

    public static void main(String[] args) {
        GUIPrincipal frame = new GUIPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2);
        frame.setVisible(true);
    }
}
