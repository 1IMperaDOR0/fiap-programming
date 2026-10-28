package br.com.fiap.produtos.service;

import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto create(Produto produto) {
        produto.setId(null);                              // garante INSERT, nunca UPDATE
        produto.setAtivo(validarAtivo(produto.getAtivo()));
        return produtoRepository.save(produto);
    }

    // PUT: substitui todos os campos
    public Optional<Produto> update(Long id, Produto dados) {
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(dados.getNome());
            produto.setPreco(dados.getPreco());
            produto.setQuantidadeEstoque(dados.getQuantidadeEstoque());
            produto.setAtivo(validarAtivo(dados.getAtivo()));
            return produtoRepository.save(produto);
        });
    }

    // PATCH: altera só o campo "ativo"
    public Optional<Produto> updateAtivo(Long id, Character ativo) {
        return produtoRepository.findById(id).map(produto -> {
            produto.setAtivo(validarAtivo(ativo));
            return produtoRepository.save(produto);
        });
    }

    public boolean delete(Long id) {
        if (!produtoRepository.existsById(id)) {
            return false;
        }
        produtoRepository.deleteById(id);
        return true;
    }

    // Regra de negócio: ativo só aceita Y ou N (maiúsculo ou minúsculo)
    private Character validarAtivo(Character ativo) {
        if (ativo == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ativo deve ser Y ou N");
        }
        char valor = Character.toUpperCase(ativo);
        if (valor != 'Y' && valor != 'N') {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ativo deve ser Y ou N");
        }
        return valor;
    }
}