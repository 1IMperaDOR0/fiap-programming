package br.com.fiap.bean;

public class Retangulo extends Quadrado {
    private float altura;

    public Retangulo() {
    }

    public Retangulo(float altura, float lado) {
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
    public float calcularArea(){
        return super.getLado() * altura/2;
    }
}
