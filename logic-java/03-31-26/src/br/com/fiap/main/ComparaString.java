package br.com.fiap.main;

import java.util.Scanner;

public class ComparaString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String senha;

        System.out.println("Digite sua senha:");
        senha = scan.next();

        System.out.println("Teste 1");
        if(senha.equals("P4ss0rD")) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado!");
        }

        System.out.println("Teste 2");
        if(senha.equalsIgnoreCase("P4ss0rD")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso não-autorizado!");
        }
    }
}
