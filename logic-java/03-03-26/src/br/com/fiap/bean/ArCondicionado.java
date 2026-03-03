package br.com.fiap.bean;

public class ArCondicionado {
    public int temperatura;
    public String modo;

    public void aumentarTemperatura() {
        temperatura++;
    }

    public void diminuirTemperatura() {
        temperatura--;
    }

    public void trocarModo(String novoModo) {
        modo = novoModo;
    }
}
