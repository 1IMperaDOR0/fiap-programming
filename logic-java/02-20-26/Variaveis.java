public class Variaveis {
    public static void main(String[] args) {
        // Testando variáveis
        char sexo_m = 'M', sexo_f = 'F';
        byte idade = 20;
        short codigo = 10000;
        long qtd_brasileiros = 216635748L; // O L indica que o número é um long
        int qtd_alunos = 50, qtd_classes = 11;
        float media = 12.5f; // O f indica que o número é um float
        double dolar = 5.15;
        boolean alternativa = false;
        String animal = "Leão";

        System.out.println("Sexo: " + sexo_m + " Idade: " + idade + " Código: " + codigo);
        System.out.println("Média: " + media + " Turmas: " + qtd_classes + " Alunos: " + qtd_alunos);
        System.out.println("Habitantes: " + qtd_brasileiros + " Cotação do Dolar: " + dolar);
        System.out.println("ALternativa: " + alternativa);
        System.out.println("Animal: " + animal);
    }
}