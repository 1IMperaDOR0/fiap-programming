package br.com.fiap.bean;

import java.time.LocalDate;

public class Garcom extends Funcionario {
    private float gorjeta;

    public Garcom() {};

    public Garcom(String nome, LocalDate dataNascimento, float valorHoraTrabalho, float gorjeta) {
        super(nome, dataNascimento, valorHoraTrabalho);
        this.gorjeta = gorjeta;
    }

    public float getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(float gorjeta) {
        this.gorjeta = gorjeta;
    }

    @Override
    public float calcularSalario() {
        return ((super.getValorHoraTrabalho()*40)*4+gorjeta);
    }
}
