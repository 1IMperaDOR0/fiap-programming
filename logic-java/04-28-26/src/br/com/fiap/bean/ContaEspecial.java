package br.com.fiap.bean;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial() {}

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float sacar(float valor) {
        if(valor > 0) {
            float resultado = super.getSaldo() - valor;
            if (resultado >= -limite) {
                super.setSaldo(resultado);
            }
        }
        return super.getSaldo();
    }
}
