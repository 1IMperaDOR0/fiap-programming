package br.com.fiap.produtos.controller;

import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos", produces = "application/json")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    // GET /produtos
    @GetMapping
    public List<Produto> getAll() {
        return produtoService.findAll();
    }

    // GET /produtos/1  -> 200 ou 404
    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable("id") Long id) {
        return ResponseEntity.of(produtoService.findById(id));
    }

    // POST /produtos  -> 201 Created
    @PostMapping
    public ResponseEntity<Produto> create(@Valid @RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.create(produto));
    }

    // PUT /produtos/1  -> substitui o produto inteiro (200 ou 404)
    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable("id") Long id, @Valid @RequestBody Produto produto) {
        return ResponseEntity.of(produtoService.update(id, produto));
    }

    // PATCH /produtos/1  -> altera só o "ativo" (200 ou 404)
    @PatchMapping("/{id}")
    public ResponseEntity<Produto> updateAtivo(@PathVariable("id") Long id, @RequestBody Produto produto) {
        return ResponseEntity.of(produtoService.updateAtivo(id, produto.getAtivo()));
    }

    // DELETE /produtos/1  -> 204 No Content ou 404
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        return produtoService.delete(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}