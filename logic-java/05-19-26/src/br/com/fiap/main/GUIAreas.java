package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIAreas extends JPanel {
    private JLabel lbLado;
    private JLabel lbAltura;
    private JLabel lbImagem;
    private JTextArea taResultados;
    private JTextField tfLado;
    private JTextField tfAltura;
    private JButton btQuadrado;
    private JButton btRetangulo;
    private JButton btTriangulo;
    private ImageIcon imagem1;

    public GUIAreas() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setBackground(new Color(64,64,64));
        lbLado = new JLabel("Lado:",JLabel.RIGHT);
        lbAltura = new JLabel("Altura:",JLabel.RIGHT);
        lbLado.setForeground(Color.WHITE);
        lbAltura.setForeground(Color.WHITE);
        lbLado.setFont(new Font("Verdana", Font.BOLD, 14));
        lbAltura.setFont(new Font("Verdana", Font.BOLD, 14));
        tfLado = new JTextField();
        tfAltura = new JTextField();
        taResultados = new JTextArea("Calculo da Área", 5, 250);
        taResultados.setFont(new Font("Verdana", Font.BOLD, 14));
        taResultados.setForeground(Color.blue);
        taResultados.setBackground(Color.orange);
        taResultados.setEditable(false);
        imagem1 = new ImageIcon(getClass().getResource("images/question.png"));
        lbImagem = new JLabel(imagem1);
        btQuadrado = new JButton("Quadrado");
        btRetangulo = new JButton("Retangulo");
        btTriangulo = new JButton("Triangulo");
        lbLado.setBounds(10, 30, 120, 25);
        tfLado.setBounds(140, 30, 120, 25);
        lbAltura.setBounds(10, 65, 120, 25);
        tfAltura.setBounds(140, 65, 120, 25);
        btQuadrado.setBounds(30, 300, 140, 30);
        btRetangulo.setBounds(220, 300, 140, 30);
        btTriangulo.setBounds(408, 300, 140, 30);
        lbImagem.setBounds(280, 30, 128, 128);
        taResultados.setBounds(280, 180, 250, 100);
        add(lbLado);
        add(tfLado);
        add(lbAltura);
        add(tfAltura);
        add(btQuadrado);
        add(btRetangulo);
        add(btTriangulo);
        add(lbImagem);
        add(taResultados);
    }

    private void definirEventos() {
        btQuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (tfLado.getText().isBlank()) {
                        throw new Exception("Preencha todos os campos!");
                    } else {
                        lbImagem.setIcon(new ImageIcon(getClass().getResource("images/quadrado.png")));
                        Quadrado quadrado = new Quadrado();
                        quadrado.setLado(Float.parseFloat(tfLado.getText()));
                        String resultados = "Cálculo da Área"
                                + "\nLado: " + quadrado.getLado()
                                + "\nÁrea: " + quadrado.calcularArea();
                        taResultados.setForeground(Color.blue);
                        taResultados.setText(resultados);
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage(),
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btRetangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (tfLado.getText().isBlank() || tfAltura.getText().isBlank()) {
                        throw new Exception("Preencha todos os campos!");
                    } else {
                        lbImagem.setIcon(new ImageIcon(getClass().getResource("images/retangulo.png")));
                        Retangulo retangulo = new Retangulo();
                        retangulo.setLado(Float.parseFloat(tfLado.getText()));
                        retangulo.setAltura(Float.parseFloat(tfAltura.getText()));
                        String resultados = "Cálculo da Área"
                                + "\nLado: " + retangulo.getLado()
                                + "\nAltura: " + retangulo.getAltura()
                                + "\nÁrea: " + retangulo.calcularArea();
                        taResultados.setForeground(Color.magenta);
                        taResultados.setText(resultados);
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage(),
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btTriangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (tfLado.getText().isBlank() || tfAltura.getText().isBlank()) {
                        throw new Exception("Preencha todos os campos!");
                    } else {
                        lbImagem.setIcon(new ImageIcon(getClass().getResource("images/triangulo.png")));
                        Triangulo triangulo = new Triangulo();
                        triangulo.setLado(Float.parseFloat(tfLado.getText()));
                        triangulo.setAltura(Float.parseFloat(tfAltura.getText()));
                        String resultados = "Cálculo da Área"
                                + "\nLado: " + triangulo.getLado()
                                + "\nAltura: " + triangulo.getAltura()
                                + "\nÁrea: " + triangulo.calcularArea();
                        taResultados.setForeground(Color.red);
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
