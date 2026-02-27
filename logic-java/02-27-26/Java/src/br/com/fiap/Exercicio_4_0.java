package br.com.fiap;

import java.util.Scanner;

public class Exercicio_4_0 {
    public static void main(String[] args) {
        Scanner scan;
        double a, b, c, delta, x1, x2;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o a, seguido do b, seguido do c: ");
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();
            delta = Math.pow(b, 2) - (4 * a * c);
            delta = Math.sqrt(delta);
            x1 = (-b + delta)/2 * a;
            x2 = (-b - delta)/2 * a;
            System.out.println("O x1 é " + x1);
            System.out.println("O x2 é " + x2);
        } catch (Exception e) {
            System.out.println("Formato inválido! Precisa ser um número.");
        }
    }
}
