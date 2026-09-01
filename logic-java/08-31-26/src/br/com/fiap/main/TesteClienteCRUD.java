package br.com.fiap.main;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteClienteCRUD {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        ClienteDAO clienteDAO = new ClienteDAO(con);

        Cliente cliente1 = new Cliente();
        cliente1.setIdCliente(1234);
        cliente1.setNomeCliente("Astrogildo");
        cliente1.setPlaca("JKK1900");
        System.out.println(clienteDAO.inserir(cliente1));

        Cliente cliente2 = new Cliente();
        cliente2.setIdCliente(1235);
        cliente2.setNomeCliente("Sakura");
        cliente2.setPlaca("ABC1234");
        System.out.println(clienteDAO.inserir(cliente2));

        Cliente cliente3 = new Cliente();
        cliente3.setIdCliente(1236);
        cliente3.setNomeCliente("Sena");
        cliente3.setPlaca("DEF5678");
        System.out.println(clienteDAO.inserir(cliente3));

        Cliente cliente4 = new Cliente();
        cliente4.setIdCliente(1237);
        cliente4.setNomeCliente("Gomes");
        cliente4.setPlaca("GHI9012");
        System.out.println(clienteDAO.inserir(cliente4));

        cliente1.setIdCliente(1233);
        cliente1.setNomeCliente("Neves");
        cliente1.setPlaca("JKK1900");
        System.out.println(clienteDAO.alterar(cliente1));

        cliente1.setPlaca("JKK1900");
        System.out.println(clienteDAO.excluir(cliente1));

        cliente1.setIdCliente(1234);
        cliente1.setNomeCliente("Astrogildo");
        cliente1.setPlaca("JKK1900");
        System.out.println(clienteDAO.inserir(cliente1));

        ArrayList<Cliente> resultado = clienteDAO.listarTodos();
        if (resultado != null) {
            for (Cliente cliente : resultado) {
                System.out.println("\nID Cliente: " + cliente.getIdCliente());
                System.out.println("Nome do Cliente: " + cliente.getNomeCliente());
                System.out.println("Placa: " + cliente.getPlaca() + "\n");
            }
        } else {
            System.out.println("Tabela não encontrada ou vazia!\n");
        }

        ConnectionFactory.fecharConexao(con);
    }
}