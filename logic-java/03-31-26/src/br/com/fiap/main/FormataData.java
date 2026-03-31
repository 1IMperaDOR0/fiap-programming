package br.com.fiap.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormataData {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate fimDosTempos = LocalDate.parse("2012-12-21");

        // Obtendo o período de tempo entre as duas datas
        Period periodo = Period.between(fimDosTempos, dataAtual);

        // Printando o período
        System.out.printf("Desde o fim dos tempos, se passaram: %d anos, %d meses e %d dias\n", periodo.getYears(), periodo.getMonths(), periodo.getDays());

        // Formatando para o padrão brasileiro
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("Data formato br: %s", fimDosTempos.format(dtf));
    }
}
