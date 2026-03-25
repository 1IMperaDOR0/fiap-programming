package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.time.LocalDate;
import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        // Versão 1
        // Pessoa pessoa1 = new Pessoa();
        // Pessoa pessoa2 = new Pessoa("Berisvaldo", 1980);

        // pessoa1.setNome("Astrogildo");
        // pessoa1.setAnoNascimento(1998);
        // int idadePessoa1 = pessoa1.calcularIdade(2026);

        // System.out.printf("PESSOA 1\nNome: %s\nIdade: %d anos\n\nPESSOA 2\nNome: %s\nIdade: %d anos", pessoa1.getNome(), idadePessoa1, pessoa2.getNome(), pessoa2.calcularIdade(2026));

        // Versão 2 e 3
        Pessoa pessoa1;
        Scanner scan;
        // String nome;
        // int anoNascimento;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e ano de nascimento:");

            // nome = scan.nextLine();
            // anoNascimento = scan.nextInt();
            // pessoa1 = new Pessoa(nome, anoNascimento);
            // int idadePessoa1 = pessoa1.calcularIdade(2026);
            // System.out.printf("PESSOA 1\nNome: %s\nIdade: %d anos", pessoa1.getNome(), idadePessoa1);

            LocalDate anoAtual = LocalDate.now();

            pessoa1 = new Pessoa(scan.nextLine(), scan.nextInt());
            System.out.printf("PESSOA 1\nNome: %s\nIdade: %d anos", pessoa1.getNome(), pessoa1.calcularIdade(anoAtual.getYear()));
        } catch(Exception e) {
            System.out.println("Nome e/ou ano de nascimento inválido(s)!");
        }
    }
}