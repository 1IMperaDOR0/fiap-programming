package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;
import br.com.fiap.bean.Televisor;
import br.com.fiap.bean.ArCondicionado;

public class Main {
    public static void main(String[] args) {
        // Conceitos de import e formas de formats
        Televisor tv = new Televisor();

        tv.volume = 7;
        tv.canal = 7;
        tv.trocarCanal(4);
        tv.diminuirVolume();
        tv.diminuirVolume();

        System.out.printf("Canal: %d\nVolume: %d\n\n", tv.canal, tv.volume);

        ArCondicionado arCondicionado = new ArCondicionado();

        arCondicionado.temperatura = 25;
        arCondicionado.modo = "Ventilar";
        arCondicionado.diminuirTemperatura();
        arCondicionado.diminuirTemperatura();
        arCondicionado.trocarModo("Resfriar");

        String mensagem = String.format("Temperatura: %d°C\nModo: %s\n\n", arCondicionado.temperatura, arCondicionado.modo);

        System.out.println(mensagem);

        // Praticando
        FolhaDePagamento pagamento = new FolhaDePagamento();

        pagamento.salarioBruto = 70000;
        pagamento.numeroDeDependentes = 5;
        pagamento.descontoINSS = 11;
        pagamento.valorPlanoDeSaude = 800;

        double salarioLiquido = pagamento.calcularSalarioLiquido();

        System.out.printf("O seu salário líquido é R$ %.2f", salarioLiquido);
    }
}
