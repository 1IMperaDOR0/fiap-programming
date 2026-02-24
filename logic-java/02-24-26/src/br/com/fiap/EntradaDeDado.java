package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, resultado = 0;

        Scanner scan; // Declarando um objeto
        scan = new Scanner(System.in); // Instanciando o objeto
        // Scannet scan = new Scanner(System.in);

        try {
            // scan = new Scanner(System.in); -> Instanciando o objeto dentro do try, para evitar o close()
            System.out.println("Digite dois números inteiros: ");
            n1 = scan.nextInt();
            n2 = scan.nextInt();
            resultado = n1 + n2;
            System.out.println("O primeiro número digitado foi: " + n1 + "\nO segundo número digitado foi: " + n2 + "\nA soma dos dois números é: " + resultado);
            scan.close(); // Fechando o objeto
        } catch (Exception e) {
            System.out.println("Formato inválido. Digite um número inteiro.");
        }
    }
}