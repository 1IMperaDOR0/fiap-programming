package br.com.fiap.bean;

public class VigiaNoturno extends Funcionario {
    private float adicionalNoturno;

    public VigiaNoturno() {}

    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno) {
        super.setNome(nome);
        super.setValorHoraTrabalho(valorHoraTrabalho);
        this.adicionalNoturno = adicionalNoturno;
    }

    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public float calcularSalario() {
        return ((super.getValorHoraTrabalho()*40)*(4+adicionalNoturno));
    }
}