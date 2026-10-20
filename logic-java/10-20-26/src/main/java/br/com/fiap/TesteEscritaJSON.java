package br.com.fiap;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

class Produto {
    private int id;
    private String produto;
    private double preco;

    public Produto() {}

    public Produto(int id, String produto, double preco) {
        this.id = id;
        this.produto = produto;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class TesteEscritaJSON {
    public static void main(String[] args) {
        // 1. Criamos o nosso objeto
        Produto produto = new Produto(1, "Notebook Dell", 4500.00);

        // 2. Instanciamos o Gson com formatação bonita (Pretty Printing)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // 3. Bloco try-catch para manipular a criação do arquivo (I/O)
        try (FileWriter writer = new FileWriter("C:\\temp\\produto.json")) {

            // Transforma o objeto em JSON e escreve no arquivo
            gson.toJson(produto, writer);
            System.out.println("Arquivo JSON criado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}