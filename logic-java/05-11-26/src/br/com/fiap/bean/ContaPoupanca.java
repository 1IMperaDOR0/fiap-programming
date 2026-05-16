package br.com.fiap.bean;

public class ContaPoupanca implements ContaBancaria {
    private int numConta;
    private float saldo;

    public ContaPoupanca() {}

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
        if(saldo >= valor) {
            saldo -= valor;
            return saldo;
        }
        return 0;
    }

    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }
}
