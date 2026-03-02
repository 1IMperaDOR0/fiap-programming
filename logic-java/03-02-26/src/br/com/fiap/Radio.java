package br.com.fiap;

public class Radio {
    // Atributos (uma boa prática de programação é começar pelos atributos e depois pelos métodos)
    public int volume;
    public float estacao;

    // Métodos
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarEstacao(float frequencia) {
        estacao = frequencia;
    }
}
