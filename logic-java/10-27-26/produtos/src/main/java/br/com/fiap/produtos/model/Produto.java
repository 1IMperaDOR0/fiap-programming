package br.com.fiap.produtos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUTOS")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotBlank(message = "nome é obrigatório")
    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @NotNull(message = "preco é obrigatório")
    @PositiveOrZero(message = "preco não pode ser negativo")
    @Column(name = "PRECO", nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;

    @NotNull(message = "quantidadeEstoque é obrigatória")
    @PositiveOrZero(message = "quantidadeEstoque não pode ser negativa")
    @Column(name = "QUANTIDADE_ESTOQUE", nullable = false)
    private Integer quantidadeEstoque;

    @NotNull(message = "ativo é obrigatório (Y ou N)")
    @Column(name = "ATIVO", nullable = false, length = 1)
    private Character ativo;   // 'Y' = ativo, 'N' = inativo

    public Produto() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }

    public Integer getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(Integer quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

    public Character getAtivo() { return ativo; }
    public void setAtivo(Character ativo) { this.ativo = ativo; }
}