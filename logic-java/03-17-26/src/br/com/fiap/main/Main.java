package br.com.fiap.main;

import br.com.fiap.bean.Radio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        Radio radio = new Radio();

        int volume;
        float estacao;

        try {
            // Leitura das informações
            scan = new Scanner(System.in);
            System.out.println("Digite um volume:");
            volume = scan.nextInt();
            System.out.println("Digite uma estação:");
            estacao = scan.nextFloat();

            // Atribuição dos valores para o objeto
            radio.setVolume(volume);
            radio.setEstacao(estacao);

            // Aumentadno o volume (3x)
            radio.aumentarVolume();
            radio.aumentarVolume();
            radio.aumentarVolume();

            // Exibindo as informações
            System.out.printf("Volume: %d\nEstação: %.1f", radio.getVolume(), radio.getEstacao());
        } catch(Exception e) {
            System.out.println("Formato incorreto!");
        }
    }
}
