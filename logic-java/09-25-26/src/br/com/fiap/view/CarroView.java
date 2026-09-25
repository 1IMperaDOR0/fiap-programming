package br.com.fiap.view;

import br.com.fiap.controller.CarroController;
import br.com.fiap.model.dto.Carro;
import javax.swing.JOptionPane;
import java.util.List;

public class CarroViewPane {
    public static void main(String[] args) {
        CarroController controller = new CarroController();
        int opcao = 0;

        do {
            String menu = "--- SISTEMA DE GERENCIAMENTO DE CARROS ---\n\n"
                    + "[1] Cadastrar Novo Carro\n"
                    + "[2] Listar Todos os Carros\n"
                    + "[3] Pesquisar por Placa\n"
                    + "[4] Sair\n\n"
                    + "Escolha uma opção:";

            String entrada = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) break; // Tratamento para o botão "Cancelar"

            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (opcao) {
                case 1:
                    String marca = JOptionPane.showInputDialog("Digite a Marca:");
                    String modelo = JOptionPane.showInputDialog("Digite o Modelo:");
                    String placa = JOptionPane.showInputDialog("Digite a Placa:");

                    String anoStr = JOptionPane.showInputDialog("Digite o Ano:");
                    int ano = Integer.parseInt(anoStr);

                    controller.cadastrarCarro(marca, modelo, placa, ano);
                    JOptionPane.showMessageDialog(null, "Processo de cadastro enviado ao banco.");
                    break;

                case 2:
                    List<Carro> carros = controller.listarTodosOsCarros();
                    StringBuilder listaCompleta = new StringBuilder("--- Carros Cadastrados ---\n\n");

                    if (carros.isEmpty()) {
                        listaCompleta.append("Nenhum carro encontrado na base Oracle.");
                    } else {
                        for (Carro c : carros) {
                            listaCompleta.append(c.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listaCompleta.toString(), "Lista de Veículos", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                    String placaBusca = JOptionPane.showInputDialog("Digite a placa que deseja buscar:");
                    if (placaBusca != null && !placaBusca.trim().isEmpty()) {
                        Carro encontrado = controller.buscarCarroPorPlaca(placaBusca);
                        if (encontrado != null) {
                            JOptionPane.showMessageDialog(null, "Veículo Encontrado:\n\n" + encontrado, "Resultado da Busca", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhum veículo encontrado com a placa " + placaBusca, "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcao != 4);
    }
}
