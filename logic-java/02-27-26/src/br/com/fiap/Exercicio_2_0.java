package br.com.fiap;

import java.util.Scanner;

public class Exercicio_2_0 {
    public static void main(String[] args) {
        Scanner scan;
        int anoAtual, anoNascimento, idade;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o ano atual:");
            anoAtual = scan.nextInt();
            System.out.println("Digite o seu ano de nascimento:");
            anoNascimento = scan.nextInt();
            idade = anoAtual - anoNascimento;
            System.out.println("Você tem " + idade + " anos");
        } catch (Exception e) {
            System.out.println("Formato inválido. Digite um número inteiro.");
        }
    }
}
