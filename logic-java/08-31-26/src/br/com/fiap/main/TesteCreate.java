package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteCreate {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        CarroDAO carroDAO = new CarroDAO(con);

        Carro carro1 = new Carro();
        carro1.setPlaca("JKK1900");
        carro1.setCor("Amarelo");
        carro1.setDescricao("Nissan Kicks Batido");
        System.out.println(carroDAO.inserir(carro1));

        Carro carro2 = new Carro();
        carro2.setPlaca("ABC1234");
        carro2.setCor("Preto");
        carro2.setDescricao("Toyota Corolla");
        System.out.println(carroDAO.inserir(carro2));

        Carro carro3 = new Carro();
        carro3.setPlaca("DEF5678");
        carro3.setCor("Branco");
        carro3.setDescricao("Honda Civic");
        System.out.println(carroDAO.inserir(carro3));

        Carro carro4 = new Carro();
        carro4.setPlaca("GHI9012");
        carro4.setCor("Azul");
        carro4.setDescricao("Volkswagen T-Cross");
        System.out.println(carroDAO.inserir(carro4));

        ConnectionFactory.fecharConexao(con);
    }
}