package br.com.fiap;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class TesteLeituraJSON {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("C:\\temp\\produto.json")) {
            // Lê o arquivo JSON e converte de volta para a classe Produto
            Produto produtoLido = gson.fromJson(reader, Produto.class);

            System.out.println("Produto recuperado do arquivo: " + produtoLido.toString());

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
