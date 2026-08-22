package br.com.fiap.bean;

import java.io.*;

/*
    Classe para objetos do tipo DragonBallSuper
    @author Lucas Sena
    @version 1.0
*/
public class DragonBallSuper implements IDBSuper {
    private String nome;
    private int ki;
    private int tecnicas;
    private int velocidade;
    private int transformacoes;

    public DragonBallSuper() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(int tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTransformacoes() {
        return transformacoes;
    }

    public void setTransformacoes(int transformacoes) {
        this.transformacoes = transformacoes;
    }

    @Override
    /*
        Método ler que permite ler o path informado
        @author Lucas Sena
        @param path - caminho do arquivo para ser lido
        @return DragonBallSuper - Objeto da classe DragonBallSuper
     */
    public DragonBallSuper ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader((path + "/" + nome + ".txt"))
        );
        nome = br.readLine();
        ki = Integer.parseInt(br.readLine());
        tecnicas = Integer.parseInt(br.readLine());
        velocidade = Integer.parseInt(br.readLine());
        transformacoes = Integer.parseInt(br.readLine());
        br.close();
        return this;
    }

    /*
        Método gravar que permite gravar o conteúdo do path informado
        @author Lucas Sena
        @param path - caminho do arquivo para ser gravado
        @return String - Texto para ser gravado no arquivo
     */
    public String gravar(String path) {
        try {
            File dir = new File(path);
            if(!dir.exists()) {
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + nome + ".txt");
            pw.println(nome);
            pw.println(ki);
            pw.println(tecnicas);
            pw.println(velocidade);
            pw.println(transformacoes);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso!";
        } catch(IOException e) {
            return "Falha ao gravar arquivo: " + e.getMessage();
        }
    }
}
