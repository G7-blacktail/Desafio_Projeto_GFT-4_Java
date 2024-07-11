package com.abstractfactory.template.model.loja.gustavo.loja.controller;

import com.abstractfactory.template.model.loja.gustavo.loja.service.ProdutoService;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.jpa.entity.ProdutoEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        super();
        this.produtoService = produtoService;
    }

    @PostMapping
    public void criarProduto(@RequestBody ProdutoEntity produto) {
        produtoService.criarProduto(produto);
    }

    @GetMapping
    public List<ProdutoEntity> consultarProdutos() {
        return produtoService.consultarProdutos();
    }

    @GetMapping("/{id}")
    public Produto consultarProdutoPorId(@PathVariable Long id) {
        return produtoService.consultarProdutoPorId(id);
    }

    @GetMapping("/tipo/{tipo}")
    public List<ProdutoEntity> consultarProdutosPorTipo(@PathVariable String tipo) {
        return produtoService.consultarProdutosPorTipo(tipo);
    }

    @GetMapping("/marca/{marca}")
    public List<ProdutoEntity> consultarProdutosPorMarca(@PathVariable String marca) {
        return produtoService.consultarProdutosPorMarca(marca);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
    }
}
