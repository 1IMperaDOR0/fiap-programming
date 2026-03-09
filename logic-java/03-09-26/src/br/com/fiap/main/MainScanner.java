package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scan;
        FolhaDePagamento folha = new FolhaDePagamento();

        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o seu salário: ");
            salarioBruto = scan.nextDouble();
            folha.salarioBruto = salarioBruto;
            System.out.println("Digite o desconto do INSS: ");
            descontoINSS = scan.nextDouble();
            folha.descontoINSS = descontoINSS;
            System.out.println("Digite a quantidade de dependentes: ");
            numeroDeDependentes = scan.nextInt();
            folha.numeroDeDependentes = numeroDeDependentes;
            System.out.println("Digite o valor do plano de saúde: ");
            valorPlanoDeSaude = scan.nextDouble();
            folha.valorPlanoDeSaude = valorPlanoDeSaude;
            System.out.printf("\nSalário Bruto: R$ %.2f\nDesconto INSS: %.2f %%\nDependentes: %d\nPlano de Saúde: %.2f\nSalário Líquido: %.2f\n", salarioBruto, descontoINSS, numeroDeDependentes, valorPlanoDeSaude, folha.calcularSalarioLiquido());
        } catch(Exception e) {
            System.out.println("Formato inválido!");
        }

    }
}
