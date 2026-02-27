package br.com.fiap;

import java.util.Scanner;

public class Exercicio_3_0 {
    public static void main(String[] args) {
        Scanner scan;
        double B, b, h, areaTrapezio;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite a base maior do trapézio, depois a menor e por fim a altura:");
            B = scan.nextDouble();
            b = scan.nextDouble();
            h = scan.nextDouble();
            areaTrapezio = ((B + b) * h)/2;
            System.out.println("A área do trapézio é " + areaTrapezio);
        } catch (Exception e) {
            System.out.println("Formato inválido! Precisa ser um número.");
        }
    }
}
