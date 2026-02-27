package br.com.fiap;

import java.util.Scanner;

public class Exercicio_1_0 {
    public static void main(String[] args) {
        Scanner scan;
        double b, h, areaRetangulo;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite a base e depois a altura do retângulo:");
            b = scan.nextDouble();
            h = scan.nextDouble();
            areaRetangulo = h*b;
            System.out.println("A área do retângulo é " + areaRetangulo);
        } catch (Exception e) {
            System.out.println(("Formato inválido! Precisa ser um número."));
        }
    }
}
