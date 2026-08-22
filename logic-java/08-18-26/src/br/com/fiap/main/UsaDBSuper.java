package br.com.fiap.main;

import br.com.fiap.bean.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

public class UsaDBSuper {
    public static void main(String[] args) {
        String aux, nome, path;
        int opcao;
        DragonBallSuper personagem;

        do {
            try {
                aux = JOptionPane.showInputDialog(
                    "Escolha:\n" +
                    "1. Cadastrar\n" +
                    "2. Consultar"
                );

                opcao = Integer.parseInt(aux);

                path = JOptionPane.showInputDialog(
                    "Digite o caminho da pasta:"
                );

                personagem = new DragonBallSuper();

                switch (opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog(
                            "Digite o nome:"
                        );

                        int ki = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite o Ki:")
                        );

                        int tecnicas = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite as técnicas:")
                        );

                        int velocidade = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite a velocidade:")
                        );

                        int transformacoes = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite as transformações:")
                        );

                        personagem.setNome(nome);
                        personagem.setKi(ki);
                        personagem.setTecnicas(tecnicas);
                        personagem.setVelocidade(velocidade);
                        personagem.setTransformacoes(transformacoes);

                        JOptionPane.showMessageDialog(
                            null,
                            personagem.gravar(path)
                        );
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog(
                            "Digite o nome do personagem:"
                        );

                        personagem.setNome(nome);
                        personagem = personagem.ler(path);

                        if (personagem == null) {
                            JOptionPane.showMessageDialog(
                                null,
                                "Caminho e/ou nome informado inexistente!"
                            );
                        } else {
                            JOptionPane.showMessageDialog(
                                null,
                                "Exibindo dados:\n" +
                                "Caminho: " + path + "\n" +
                                "Arquivo: " + path + "/" +
                                personagem.getNome() + ".txt\n" +
                                "Nome: " + personagem.getNome() + "\n" +
                                "Ki: " + personagem.getKi() + "\n" +
                                "Técnicas: " + personagem.getTecnicas() + "\n" +
                                "Velocidade: " + personagem.getVelocidade() + "\n" +
                                "Transformações: " + personagem.getTransformacoes()
                            );
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(
                            null,
                            "Escolha incorreta!"
                        );
                }
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                    null,
                    "Erro de conversão!\n" + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            } catch (IOException e) {

                JOptionPane.showMessageDialog(
                    null,
                    "Erro ao acessar o arquivo!\n" + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            } catch (Exception e) {

                JOptionPane.showMessageDialog(
                    null,
                    "Erro: " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } while (
                JOptionPane.showConfirmDialog(
                    null,
                    "Deseja continuar?",
                    "Atenção",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                ) == 0
        );
        JOptionPane.showMessageDialog(
            null,
            "Programa finalizado."
        );
    }
}
