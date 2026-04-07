package br.com.fiap.main;

import br.com.fiap.bean.Veiculo;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainVeiculo {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Veiculo veiculo = new Veiculo();

        try {
            String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo:");
            LocalDate dataCompra = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de compra do veículo (ex.: dd-mm-aaaa):"), dtf);
            double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que você comprou o veículo:"));

            veiculo.setModelo(modelo);
            veiculo.setDataCompra(dataCompra);
            veiculo.setValorCompra(valorCompra);

            String mensagem = String.format("Modelo: %s\nData de Compra: %s\nIdade do veículo: %d anos\nValor Atual Estimado: R$ %.2f", veiculo.getModelo(), veiculo.getDataCompra().format(dtf), veiculo.calcularIdadeVeiculo(), veiculo.calcularValorAtual());
            JOptionPane.showMessageDialog(null, mensagem);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Formato inválido!");
        }
    }
}
