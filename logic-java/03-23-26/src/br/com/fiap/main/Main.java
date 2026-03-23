package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        ArCondicionado arCondicionado = new ArCondicionado();

        int temperatura;
        String opcao, modo;

        try {
            scan = new Scanner(System.in);

            System.out.println("Digite a temperatura (min = 15 e max = 26) e o modo (Ventilar, Aquecer e Resfriar) que você deseja:");
            temperatura = scan.nextInt();
            modo = scan.next();
            arCondicionado.setTemperatura(temperatura);
            arCondicionado.setModo(modo);
            System.out.printf("Temperatura: %d\nModo: %s\n", arCondicionado.getTemperatura(), arCondicionado.getModo());

            System.out.println("Digite uma das opções abaixo:\n1. Mudar modo\n2. Aumentar temperatura\n3. Diminuir temperatura");
            opcao = scan.next();
            if(opcao.equals("1")) {
                System.out.println("Digite o modo que você deseja (Ventilar, Aquecer e Resfriar):");
                modo = scan.next();
                arCondicionado.setModo(modo);
            } else if(opcao.equals("2")) {
                arCondicionado.aumentarTemperatura();
                System.out.println("Temperatura aumentada.");
            } else if(opcao.equals("3")) {
                arCondicionado.diminuirTemperatura();
                System.out.println("Temperatura diminuída.");
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.printf("Temperatura: %d\nModo: %s\n", arCondicionado.getTemperatura(), arCondicionado.getModo());
        } catch (Exception e) {
            System.out.println("Formato inválido!");
        }
    }
}
