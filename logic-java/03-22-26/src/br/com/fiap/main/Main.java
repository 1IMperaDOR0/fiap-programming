package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        Televisor televisor = new Televisor();

        int opcao, canal, volume;

        try {
            scan = new Scanner(System.in);

            canal = 2;
            volume = 2;
            televisor.setCanal(canal);
            televisor.setVolume(volume);
            System.out.printf("Canal: %d\nVolume: %d\n", televisor.getCanal(), televisor.getVolume());

            System.out.println("Qual operação você deseja fazer?\n1. Definir outro canal\n2. Definir outro volume\n3. Aumentar volume\n4. Diminuir volume");
            opcao = scan.nextInt();
            if(opcao == 1) {
                System.out.println("Digite o canal que você quer:");
                canal = scan.nextInt();
                televisor.setCanal(canal);
            } else if(opcao == 2) {
                System.out.println("Digite o volume que você quer:");
                volume = scan.nextInt();
                televisor.setVolume(volume);
            } else if(opcao == 3) {
                televisor.aumentarVolume();
            } else if(opcao == 4) {
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
