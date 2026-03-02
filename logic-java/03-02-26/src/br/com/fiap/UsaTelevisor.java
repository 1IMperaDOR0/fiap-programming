package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {
        System.out.println("Televisor 1");
        Televisor televisor1 = new Televisor();
        televisor1.canal = 10;
        televisor1.volume = 4;
        System.out.println("Canal: " + televisor1.canal + "\nVolume: " + televisor1.volume);
        televisor1.aumentarVolume();
        televisor1.aumentarVolume();
        televisor1.trocarCanal(21);
        System.out.println("Canal: " + televisor1.canal + "\nVolume: " + televisor1.volume);
        televisor1.diminuirVolume();
        System.out.println("Canal: " + televisor1.canal + "\nVolume: " + televisor1.volume);
    }
}
