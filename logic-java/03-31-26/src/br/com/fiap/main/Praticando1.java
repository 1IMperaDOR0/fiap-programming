package br.com.fiap.main;

import java.util.Scanner;

public class Praticando1 {
    public static void main(String[] args) {
        Scanner scan;

        String frase, fraseMaiscula, palavraVelha, palavraNova, fraseNova;
        int qtdeChar;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite uma frase:");
            frase = scan.nextLine();
            qtdeChar = frase.length();
            fraseMaiscula = frase.toUpperCase();
            System.out.printf("Frase: %s\nQuantidade de caracteres: %d\nFrase Maiúscula: %s\n", frase, qtdeChar, fraseMaiscula);
            System.out.println("Digite uma palavra da frase que você deseja substituir e em seguida a palavra de substituição:");
            palavraVelha = scan.next();
            palavraNova = scan.next();
            fraseNova = frase.replace(palavraVelha, palavraNova);
            System.out.printf("Frase nova: %s\n", fraseNova);
            System.out.printf("Frase: %s\nQuantidade de caracteres: %d\nFrase Maiúscula: %s\n", fraseNova, fraseNova.length(), fraseNova.toUpperCase());
        } catch (Exception e) {
            System.out.println("Formato inválido!");
            throw new RuntimeException(e);
        }
    }
}
