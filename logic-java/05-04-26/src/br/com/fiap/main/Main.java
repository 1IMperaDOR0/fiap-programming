package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Garcom;
import br.com.fiap.bean.Gerente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuar, opcao, nome;
        LocalDate dataNascimento;
        int valorHoraTrabalho;
        float gorjeta, bonus;

        continuar = "s";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while(continuar.equals("s")) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Digite uma das opções abaixo:\n1. Funcionario\n2. Garçom\n3. Gerente");
                opcao = scan.nextLine();
                System.out.println("Digite seu nome:");
                nome = scan.nextLine();
                System.out.println("Digite a sua data de nascimento (ex.:01/01/1900):");
                dataNascimento = LocalDate.parse(scan.nextLine(), dtf);
                System.out.println("Digite o valor ganho por hora trabalhada:");
                valorHoraTrabalho = scan.nextInt();
                switch(opcao) {
                    case "1":
                        Funcionario funcionario = new Funcionario();
                        funcionario.setNome(nome);
                        funcionario.setDataNascimento(dataNascimento);
                        funcionario.setValorHoraTrabalho(valorHoraTrabalho);
                        System.out.printf("\nCategoria: Funcionário\nNome: %s\nIdade: %d anos\nSalário: R$ %.2f\n\n", funcionario.getNome(), funcionario.calcularIdade(), funcionario.calcularSalario());
                        break;
                    case "2":
                        System.out.println("Quanto você recebeu de gorjeta?");
                        gorjeta = scan.nextFloat();
                        Garcom garcom = new Garcom();
                        garcom.setNome(nome);
                        garcom.setDataNascimento(dataNascimento);
                        garcom.setValorHoraTrabalho(valorHoraTrabalho);
                        garcom.setGorjeta(gorjeta);
                        System.out.printf("\nCategoria: Garçom\nNome: %s\nIdade: %d anos\nSalário: R$ %.2f\n\n", garcom.getNome(), garcom.calcularIdade(), garcom.calcularSalario());
                        break;
                    case "3":
                        System.out.println("Quanto você recebeu de bônus?");
                        bonus = scan.nextFloat();
                        Gerente gerente = new Gerente();
                        gerente.setNome(nome);
                        gerente.setDataNascimento(dataNascimento);
                        gerente.setValorHoraTrabalho(valorHoraTrabalho);
                        gerente.setBonus(bonus);
                        System.out.printf("\nCategoria: Gerente\nNome: %s\nIdade: %d anos\nSalário: R$ %.2f\n\n", gerente.getNome(), gerente.calcularIdade(), gerente.calcularSalario());
                        break;
                    default:
                        throw new Exception("Opção inválida!");
                }
                System.out.println("Deseja continuar?");
                continuar = scan.nextLine();
            } catch(Exception e) {
                System.out.printf("Erro: %s\n", e.getMessage());
            }
        }
        System.out.println("Programa finalizado. Até mais!");
    }
}
