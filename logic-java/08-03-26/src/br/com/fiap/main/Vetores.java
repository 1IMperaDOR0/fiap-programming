package br.com.fiap.main;

public class Vetores {
    public static void main(String[] args) {
        String[] carros;
        carros = new String[4];

        System.out.println(carros.length);
        System.out.println(carros);
        for(int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }
        for(String e: carros) {
            System.out.println(e);
        }
    }
}
