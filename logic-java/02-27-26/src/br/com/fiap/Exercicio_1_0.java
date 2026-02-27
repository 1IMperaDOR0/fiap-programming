package br.com.fiap;

import java.util.Scanner;

public class Exercicio_1_0 {
    public static void main(String[] args) {
        Scanner scan;
        double nota1, nota2, nota3, nota4, media;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite 4 notas:");
            nota1 = scan.nextDouble();
            nota2 = scan.nextDouble();
            nota3 = scan.nextDouble();
            nota4 = scan.nextDouble();
            media = (nota1 + nota2 + nota3 + nota4)/4;
            System.out.println("A média das notas foi " + media);
        } catch(Exception e) {
            System.out.println("Formato inválido. Digite um número inteiro.");
        }
    }

}