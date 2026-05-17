package br.com.fiap.bean;

import javax.swing.*;

public class ContaEspecial implements ContaBancaria {
    private int numConta;
    private float saldo;
    private float limite;

    public ContaEspecial() {}

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

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public float sacar(float valor) {
        try {
            if(saldo+limite >= valor) {
                saldo -= valor;
            } else {
                throw new Exception("Saldo insuficiente!");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return saldo;
    }

    @Override
    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }
}
