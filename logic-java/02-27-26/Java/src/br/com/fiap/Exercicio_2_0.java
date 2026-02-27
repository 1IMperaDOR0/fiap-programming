package br.com.fiap;

import java.util.Scanner;

public class Exercicio_2_0 {
    public static void main(String[] args) {
        Scanner scan;
        double b, h, areaTriangulo;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite a base e depois a altura do triângulo");
            b = scan.nextDouble();
            h = scan.nextDouble();
            areaTriangulo = (b * h)/2;
            System.out.println("A área do triêngulo é " + areaTriangulo);
        } catch (Exception e) {
            System.out.println("Formato inválido! Precisa ser um número.");
        }
    }
}
