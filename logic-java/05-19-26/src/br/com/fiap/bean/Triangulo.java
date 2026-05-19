package br.com.fiap.bean;

public class Triangulo extends Quadrado{
    private float altura;

    public Triangulo() {
    }

    public Triangulo(float lado, float altura) {
        super.setLado(lado);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return super.getLado() * altura;
    }
}
