package br.com.fiap.view.gui;

import br.com.fiap.controller.CarroController;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUICarro extends JPanel {
    private JLabel lbPlaca, lbCor, lbDescricao, lbImagem;
    private JTextField tfPlaca, tfDescricao;
    private JButton btPesquisa, btNovo, btAtualiza, btApaga, btCancelar;
    private JList<String> liCor;
    private ImageIcon imagem1;
    private JScrollPane sp;

    public GUICarro() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setBackground(Color.orange);

        lbPlaca = new JLabel("Placa:", JLabel.RIGHT);
        lbCor = new JLabel("Cor:", JLabel.RIGHT);
        lbDescricao = new JLabel("Descricao:", JLabel.RIGHT);
        tfPlaca = new JTextField();

        String[] cores = {"amarelo", "azul", "branco", "vermelho"};
        liCor = new JList<>(cores);
        sp = new JScrollPane(liCor);
        imagem1 = new ImageIcon();
        lbImagem = new JLabel(imagem1);

        tfDescricao = new JTextField();

        btPesquisa = new JButton(new ImageIcon(getClass().getResource("images/search_icon.png")));
        btNovo = new JButton(new ImageIcon(getClass().getResource("images/new_icon.png")));
        btAtualiza = new JButton(new ImageIcon(getClass().getResource("images/update_icon.png")));
        btApaga = new JButton(new ImageIcon(getClass().getResource("images/delete_icon.png")));
        btCancelar = new JButton(new ImageIcon(getClass().getResource("images/exit_icon.png")));

        lbPlaca.setBounds(10, 30, 80, 25);
        tfPlaca.setBounds(100, 30, 120, 25);
        lbCor.setBounds(310, 30, 80, 25);
        sp.setBounds(310, 65, 80, 80);
        lbImagem.setBounds(400, 30, 128, 128);
        lbDescricao.setBounds(10, 120, 80, 25);
        tfDescricao.setBounds(100, 120, 200, 25);

        btPesquisa.setBounds(50, 250, 60, 40);
        btNovo.setBounds(120, 250, 60, 40);
        btAtualiza.setBounds(190, 250, 60, 40);
        btApaga.setBounds(260, 250, 60, 40);
        btCancelar.setBounds(330, 250, 60, 40);

        add(lbPlaca);
        add(tfPlaca);
        add(lbCor);
        add(sp);
        add(lbImagem);
        add(lbDescricao);
        add(tfDescricao);
        add(btPesquisa);
        add(btNovo);
        add(btAtualiza);
        add(btApaga);
        add(btCancelar);
    }

    private void definirEventos() {
        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        liCor.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!liCor.isSelectionEmpty()) {
                    imagem1 = new ImageIcon(getClass().getResource("colors/" + liCor.getSelectedValue() + ".png"));
                    lbImagem.setIcon(imagem1);
                }
            }
        });

        btApaga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarroController carroController = new CarroController();
                try {
                    if (tfPlaca.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha a placa");
                        tfPlaca.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, carroController.excluirCarro(tfPlaca.getText()));
                        tfPlaca.setText("");
                        tfDescricao.setText("");
                        lbImagem.setIcon(null);
                        liCor.clearSelection();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage());
                }
            }
        });

        btAtualiza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarroController carroController = new CarroController();
                try {
                    if (tfPlaca.getText().equals("") || liCor.isSelectionEmpty() || tfDescricao.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                    } else {
                        String cor = liCor.getSelectedValue();
                        JOptionPane.showMessageDialog(null, carroController.alterarCarro(tfPlaca.getText(), cor, tfDescricao.getText()));
                        tfPlaca.setText("");
                        tfDescricao.setText("");
                        lbImagem.setIcon(null);
                        liCor.clearSelection();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage());
                }
            }
        });

        btNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarroController carroController = new CarroController();
                try {
                    if (tfPlaca.getText().equals("") || liCor.isSelectionEmpty() || tfDescricao.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                    } else {
                        String cor = liCor.getSelectedValue();
                        JOptionPane.showMessageDialog(null, carroController.inserirCarro(tfPlaca.getText(), cor, tfDescricao.getText()));
                        tfPlaca.setText("");
                        tfDescricao.setText("");
                        lbImagem.setIcon(null);
                        liCor.clearSelection();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage());
                }
            }
        });

        btPesquisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarroController carroController = new CarroController();
                try {
                    if (tfPlaca.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha a placa");
                        tfPlaca.requestFocus();
                    } else {
                        String carro = carroController.listarUmCarro(tfPlaca.getText());
                        Pattern pattern = Pattern.compile("Cor: (.*)");
                        Matcher matcher = pattern.matcher(carro);
                        String cor;
                        if (matcher.find()) {
                            cor = matcher.group(1).trim();
                        } else {
                            cor = null;
                        }

                        ImageIcon icone = new ImageIcon();
                        if (cor != null) {
                            if (cor.equals("amarelo")) {
                                icone = new ImageIcon(getClass().getResource("colors/amarelo.png"));
                            } else if (cor.equals("azul")) {
                                icone = new ImageIcon(getClass().getResource("colors/azul.png"));
                            } else if (cor.equals("branco")) {
                                icone = new ImageIcon(getClass().getResource("colors/branco.png"));
                            } else if (cor.equals("vermelho")) {
                                icone = new ImageIcon(getClass().getResource("colors/vermelho.png"));
                            } else {
                                icone = null;
                            }
                        }
                        JOptionPane.showMessageDialog(null, carro, "Carro", JOptionPane.INFORMATION_MESSAGE, icone);
                        tfPlaca.setText("");
                        tfDescricao.setText("");
                        lbImagem.setIcon(null);
                        liCor.clearSelection();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage());
                }
            }
        });
    }
}
