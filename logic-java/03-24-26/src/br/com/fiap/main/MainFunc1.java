package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import java.time.LocalDate;

public class MainFunc1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Astrogildo");
        funcionario.setValorHoraTrabalho(20);

        LocalDate dataAtual = LocalDate.now();

        System.out.printf("FUNCIONÁRIO\nNome: %s\nSalário: %.2f\nData: %d/%d/%d", funcionario.getNome(), funcionario.calcularSalario(44), dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), dataAtual.getYear());
    }
}
