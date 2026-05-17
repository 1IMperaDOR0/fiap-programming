package br.com.fiap.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPrincipal extends JFrame {
    // atributos (Boa prática de programação: mn - menu, mi - item de menu)
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnFuncionario;
    private JMenuItem miSair, miFreelancer, miVendedor, miVigiaNoturno;

    // construtores
    public GUIPrincipal() {
        inicializarComponetes();
        definirEventos();
    }

    // métodos da classe
    private void inicializarComponetes() {
        setTitle("Janela Principal");
        setBounds(0, 0, 600, 400); // define o tamanho da janela em pixels, a janela começa do (0, 0) e vai até (600, 400)
        // Lembrando que o ponto (0, 0) no computador é o canto superior esquerdo
        contentPane = getContentPane();

        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A'); // tecla de atalho Alt + A
        mnFuncionario = new JMenu("Funcionário");
        mnFuncionario.setMnemonic('F');
        miSair = new JMenuItem("Sair", new ImageIcon(
                getClass().getResource("images/exit_icon.png")));
        miFreelancer = new JMenuItem("Freelancer");
        miVendedor = new JMenuItem("Vendedor");
        miVigiaNoturno = new JMenuItem("Vigia Noturno");

        setJMenuBar(mnBarra);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnFuncionario);
        mnArquivo.add(miSair);
        mnFuncionario.add(miFreelancer);
        mnFuncionario.add(miVendedor);
        mnFuncionario.add(miVigiaNoturno);
    }

    private void definirEventos() {
        miSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        miFreelancer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIFreelancer freela = new GUIFreelancer();
                contentPane.removeAll();
                contentPane.add(freela);
                contentPane.validate();
                GUIVigiaNoturno vigia = new GUIVigiaNoturno();
                contentPane.removeAll();
                contentPane.add(vigia);
                contentPane.validate();
            }
        });
    }

    public static void main(String[] args) {
        GUIPrincipal frame = new GUIPrincipal(); // cria um objeto GUIPrincipal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para garantir que o X funcione
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize(); // pego as dimensões da tela do meu pc
        frame.setLocation((tela.width - frame.getSize().width) / 2,
                (tela.height - frame.getSize().height) / 2); // deixar a janela principal no centro da tela
        frame.setVisible(true);
    }
}
