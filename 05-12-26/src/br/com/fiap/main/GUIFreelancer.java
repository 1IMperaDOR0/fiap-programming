package br.com.fiap.main;

import br.com.fiap.bean.Freelancer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFreelancer extends JPanel {
    // atributos
    private JLabel lbNome, lbValorHora, lbCNPJ, lbImagem;
    private JTextArea taResultados;
    private JTextField tfNome, tfValorHora, tfCNPJ;
    private JButton btCalcularSalario;
    private ImageIcon imagem1;


    public GUIFreelancer() {
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes() {
        setLayout(null);
        setBackground(Color.orange);
        lbNome = new JLabel("Nome Completo:", JLabel.RIGHT);
        lbValorHora = new JLabel("Hora de Trabalho:", JLabel.RIGHT);
        lbCNPJ = new JLabel("CNPJ:", JLabel.RIGHT);
        tfNome = new JTextField();
        tfValorHora = new JTextField();
        tfCNPJ = new JTextField();
        taResultados = new JTextArea("Cálculo do Salário", 5, 250);
        taResultados.setFont(new Font("Verdana", Font.BOLD, 14));
        taResultados.setForeground(Color.blue);
        taResultados.setBackground(getBackground());
        taResultados.setEditable(false);
        imagem1 = new ImageIcon(getClass().getResource("images/freelancer.png"));
        lbImagem = new JLabel(imagem1);
        btCalcularSalario = new JButton("Calcular Salário");
        //           (x, y) incial, (x, y) final
        lbNome.setBounds(10, 30, 120, 25);
        tfNome.setBounds(140, 30, 120, 25);
        lbValorHora.setBounds(10, 65, 120, 25);
        tfValorHora.setBounds(140, 65, 120, 25);
        lbCNPJ.setBounds(10, 100, 120, 25);
        tfCNPJ.setBounds(140, 100, 120, 25);
        btCalcularSalario.setBounds(30, 250, 140, 30);
        lbImagem.setBounds(280, 30, 128, 128);
        taResultados.setBounds(280, 180, 250, 100);
        add(lbNome);
        add(tfNome);
        add(lbValorHora);
        add(tfValorHora);
        add(lbCNPJ);
        add(tfCNPJ);
        add(btCalcularSalario);
        add(lbImagem);
        add(taResultados);
    }
    private void definirEventos() {
        btCalcularSalario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (tfNome.getText().isBlank() || tfValorHora.getText().isBlank()
                            || tfCNPJ.getText().isBlank()) {
                        throw new Exception("Preencha todos os campos!");
                    } else {
                        Freelancer freela = new Freelancer();
                        freela.setNome(tfNome.getText());
                        freela.setValorHoraTrabalho(Float.parseFloat(tfValorHora.getText()));
                        freela.setCNPJ(Long.parseLong(tfCNPJ.getText()));
                        String resultados = "Cálculo do Salário"
                                + "\nNome: " + freela.getNome()
                                + "\nSalário R$ " + freela.calcularSalario();
                        taResultados.setText(resultados);
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage(),
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
