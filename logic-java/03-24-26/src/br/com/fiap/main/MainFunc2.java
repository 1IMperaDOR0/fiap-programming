package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import java.time.LocalDate;
import java.util.Scanner;

public class MainFunc2 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Astrogildo", 20);
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o seu nome, o valor que você ganha por hora e quantas horas você trabalha na semana:");
            funcionario.setNome(scan.nextLine());
            funcionario.setValorHoraTrabalho(scan.nextFloat());
            float salario = funcionario.calcularSalario(scan.nextInt());

            LocalDate dataAtual = LocalDate.now();

            System.out.printf("FUNCIONÁRIO\nNome: %s\nSalário: %.2f\nData: %d/%d/%d", funcionario.getNome(), salario, dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), dataAtual.getYear());
        } catch(Exception e) {
            System.out.println("Formato inválido");
        }
    }
}
