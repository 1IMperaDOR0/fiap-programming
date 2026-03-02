package br.com.fiap;

public class UsaRadio {
    public static void main(String[] args) {
        // Declaração e intanciação do objeto
        System.out.println("Rádio 1");
        Radio radio1 = new Radio();
        radio1.estacao = 89.1f;
        radio1.volume = 5;
        System.out.println("Volume: " + radio1.volume + "\nEstação: " + radio1.estacao + " MHz");
        radio1.trocarEstacao(92.5f);
        radio1.aumentarVolume();
        radio1.aumentarVolume();
        System.out.println("Volume: " + radio1.volume + "\nEstação: " + radio1.estacao + " MHz");

        System.out.println("\nRádio 2");
        Radio radio2 = new Radio();
        radio2.estacao = 89.1f;
        radio2.volume = 8;
        radio2.aumentarVolume();
        radio2.aumentarVolume();
        System.out.println("Volume: " + radio2.volume + "\nEstação: " + radio2.estacao + " MHz");

    }
}