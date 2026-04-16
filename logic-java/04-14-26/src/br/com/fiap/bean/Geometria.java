package br.com.fiap.bean;

import javax.swing.*;

public class Geometria {
    private float lado;
    private float altura;
    private double raio;

    public Geometria() {}

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calcularArea(float lado) {
        setLado(lado);
        float area = this.lado * this.lado;
        JOptionPane.showMessageDialog(null, String.format("Área do Quadrado: %.2f", area));
    }

    public void calcularArea(float lado, float altura) {
        setLado(lado);
        setAltura(altura);
        float area = this.lado * this.altura;
        JOptionPane.showMessageDialog(null, String.format("Área do Retângulo: %.2f", area));
    }

    public void calcularArea(double raio) {
        setRaio(raio);
        double area = Math.PI * Math.pow(this.raio, 2);
        JOptionPane.showMessageDialog(null, String.format("Área do Quadrado: %.2f", area));
    }
}
