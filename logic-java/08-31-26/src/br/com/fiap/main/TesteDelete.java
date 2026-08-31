package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteDelete {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        CarroDAO carroDAO = new CarroDAO(con);
        carro.setPlaca("JKK1900");
        System.out.println(carroDAO.excluir(carro));
        ConnectionFactory.fecharConexao(con);
    }
}
