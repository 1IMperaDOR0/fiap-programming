package br.com.fiap.main;

import br.com.fiap.bean.Eventos;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scan;
        Eventos ingresso;

        double despesaComBebida, despesaComComida, despesaComEquipe, valorShow;
        float margemDeLucro;
        int quantidadeDeConvidados;

        try {
            scan = new Scanner(System.in);
            ingresso = new Eventos();
            System.out.println("Digite as despesa relacionado a bebidas:");
            despesaComBebida = scan.nextDouble();
            ingresso.despesaComBebida = despesaComBebida;
            System.out.println("Digite as despesa relacionado a comidas:");
            despesaComComida = scan.nextDouble();
            ingresso.despesaComComida = despesaComComida;
            System.out.println("Digite as despesa relacionado a equipe:");
            despesaComEquipe = scan.nextDouble();
            ingresso.despesaComEquipe = despesaComEquipe;
            System.out.println("Digite o valor do Show:");
            valorShow = scan.nextDouble();
            ingresso.valorDoShow = valorShow;
            System.out.println("Digite a margem de lucro:");
            margemDeLucro = scan.nextFloat();
            ingresso.margemDeLucro = margemDeLucro;
            System.out.println("Digite a quantidade de convidados:");
            quantidadeDeConvidados = scan.nextInt();
            ingresso.quantidadeDeConvidados = quantidadeDeConvidados;
            System.out.printf("O valor do ingresso é de R$ %.2f", ingresso.calcularValorDoIngresso());
        } catch (Exception e) {
            System.out.println("Formato inválido!");
        }
    }
}
