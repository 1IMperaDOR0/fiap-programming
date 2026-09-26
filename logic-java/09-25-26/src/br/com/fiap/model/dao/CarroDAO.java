package br.com.fiap.model.dao;

import br.com.fiap.model.dto.Carro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarroDAO implements IDAO {
    private Connection con;
    private Carro carro;

    public CarroDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    @Override
    public String inserir(Object object) {
        carro = (Carro) object;
        String sql = "insert into ddd_carro(placa, cor, descricao) values(?, ?, ?)";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    @Override
    public String alterar(Object object) {
        carro = (Carro) object;
        String sql = "update ddd_carro set cor = ?, descricao = ? where placa = ?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    @Override
    public String excluir(Object object) {
        carro = (Carro) object;
        String sql = "delete from ddd_carro where placa = ?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setString(1, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    @Override
    public String listarUm(Object object) {
        carro = (Carro) object;
        String sql = "select * from ddd_carro where placa = ?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setString(1, carro.getPlaca());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return "Placa: " + carro.getPlaca() + "\nCor: " + rs.getString("cor") + "\nDescrição: " + rs.getString("descricao");
                } else {
                    return "Registro não encontrado!";
                }
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }
}
