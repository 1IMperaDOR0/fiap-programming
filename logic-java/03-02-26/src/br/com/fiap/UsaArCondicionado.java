package br.com.fiap;

public class UsaArCondicionado {
    public static void main(String[] args) {
        System.out.println("Ar-condicionado 1");
        ArCondicionado arCondicionado1 = new ArCondicionado();
        arCondicionado1.modo = "Quente";
        arCondicionado1.temperatura = 30;
        System.out.println("Temperatura: " + arCondicionado1.temperatura + "\nModo: " + arCondicionado1.modo);
        arCondicionado1.aumentarTemperatura();
        arCondicionado1.aumentarTemperatura();
        System.out.println("Temperatura: " + arCondicionado1.temperatura + "\nModo: " + arCondicionado1.modo);
        arCondicionado1.trocarModo("Frio");
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        System.out.println("Temperatura: " + arCondicionado1.temperatura + "\nModo: " + arCondicionado1.modo);
    }
}
