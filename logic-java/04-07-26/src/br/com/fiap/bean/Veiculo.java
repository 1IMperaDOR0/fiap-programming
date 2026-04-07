package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Veiculo {
    private String modelo;
    private LocalDate dataCompra;
    private double valorCompra;

    public Veiculo() {}

    public Veiculo(String modelo, LocalDate dataCompra, double valorCompra) {
        this.modelo = modelo;
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int calcularIdadeVeiculo() {
        Period idadeVeiculo = Period.between(dataCompra, LocalDate.now());
        if(idadeVeiculo.getYears() > 9) {
            String mensagem = String.format("A idade do veículo modelo %s exede 9 anos.", modelo);
            JOptionPane.showMessageDialog(null, mensagem);
            System.exit(0);
        }
        return idadeVeiculo.getYears();
    }

    public double calcularValorAtual() {
        double valorAtual = valorCompra;
        valorAtual -= ((0.1 * valorAtual) * calcularIdadeVeiculo());
        return valorAtual;
    }
}
