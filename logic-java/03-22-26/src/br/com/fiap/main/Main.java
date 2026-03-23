package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        Televisor televisor = new Televisor();

        int canal, volume;
        String opcao;

        try {
            scan = new Scanner(System.in);

            System.out.println("Digite um canal e um volume:");
            canal = scan.nextInt();
            volume = scan.nextInt();
            televisor.setCanal(canal);
            televisor.setVolume(volume);
            System.out.printf("Canal: %d\nVolume: %d\n", televisor.getCanal(), televisor.getVolume());

            System.out.println("Qual operação você deseja fazer?\n1. Definir outro canal\n2. Definir outro volume\n3. Aumentar volume\n4. Diminuir volume");
            opcao = scan.next();
            if(opcao.equals("1")) {
                System.out.println("Digite o canal que você quer:");
                canal = scan.nextInt();
                televisor.setCanal(canal);
            } else if(opcao.equals("2")) {
                System.out.println("Digite o volume que você quer:");
                volume = scan.nextInt();
                televisor.setVolume(volume);
            } else if(opcao.equals("3")) {
                System.out.println("Volume aumentado.");
                televisor.aumentarVolume();
            } else if(opcao.equals("4")) {
                System.out.println("Volume diminuído.");
                televisor.diminuirVolume();
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.printf("Canal: %d\nVolume: %d\n", televisor.getCanal(), televisor.getVolume());
        } catch(Exception e) {
            System.out.println("Formato inválido!");
        }
    }
}
