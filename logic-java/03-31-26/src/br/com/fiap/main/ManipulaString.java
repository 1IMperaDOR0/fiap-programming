package br.com.fiap.main;

public class ManipulaString {
    public static void main(String[] args) {
        String frase1 = "O rato roeu a roupa do rei de Roma.";
        System.out.println(frase1);
        int qtdeChar = frase1.length();
        System.out.printf("Quantidade de caracteres: %d\n", qtdeChar);
        System.out.println(frase1.toUpperCase());
        System.out.println(frase1.toLowerCase());
        String palavra = frase1.substring(30, 34);
        System.out.println(palavra);
        String frase2 = frase1.replace("O rato", "A traça");
        System.out.println(frase2);
    }
}
