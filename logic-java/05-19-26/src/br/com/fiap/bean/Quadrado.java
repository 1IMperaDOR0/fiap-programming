package br.com.fiap.bean;

public class Quadrado {
    private float lado;

    public Quadrado(){}

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float calcularArea(){
        return lado*lado;
    }
}
