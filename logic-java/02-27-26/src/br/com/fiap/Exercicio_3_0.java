package br.com.fiap;

import java.util.Scanner;

public class Exercicio_3_0 {
    public static void main(String[] args) {
        Scanner scan;
        final double PI = 3.14159;
        double areaCirculo, raio;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o raio do círculo:");
            raio = scan.nextInt();
            areaCirculo = raio*raio*PI;
            System.out.println("A área do círculo é " + areaCirculo);
        } catch (Exception e) {
            System.out.println("Formato inválido. Digite um número inteiro.");
        }
    }
}
