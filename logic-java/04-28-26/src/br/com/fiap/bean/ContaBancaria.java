package br.com.fiap.bean;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria() {}

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float sacar(float valor) {
        if(valor > 0) {
            if(saldo >= valor) {
                saldo -= valor;
            }
        }
        return saldo;
    }

    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }
}
