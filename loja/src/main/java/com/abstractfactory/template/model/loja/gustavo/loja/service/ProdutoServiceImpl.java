package com.abstractfactory.template.model.loja.gustavo.loja.service;

import java.util.List;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.repository.ProdutoJpaRepository;

public class ProdutoServiceImpl implements ProdutoService {

    private ProdutoJpaRepository produtoJpaRepository;

    public ProdutoServiceImpl(ProdutoJpaRepository produtoJpaRepository) {
        this.produtoJpaRepository = produtoJpaRepository;
    }

    @Override
    public void criarProduto(Produto produto) {
        this.produtoJpaRepository.save(produto);
    }

    @Override
    public List<Produto> consultarProdutos() {
        return this.produtoJpaRepository.findAll();
    }

    @Override
    public Produto consultarProdutoPorId(Long id) {
        return this.produtoJpaRepository.findById(id).orElse(null); 
    }

    @Override
    public List<Produto> consultarProdutosPorTipo(String tipo) {
        return this.produtoJpaRepository.findByTipo(tipo);
    }

    @Override
    public List<Produto> consultarProdutosPorMarca(String marca) {
        return this.produtoJpaRepository.findByMarca(marca);
    }

    @Override
    public void deletarProduto(Long id) {
        this.produtoJpaRepository.deleteById(id);
    }

}
