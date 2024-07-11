package com.abstractfactory.template.model.loja.gustavo.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.ProdutoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.factory.ProdutoFactoryProvider;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.jpa.entity.ProdutoEntity;
import com.abstractfactory.template.model.loja.gustavo.loja.repository.ProdutoJpaRepository;
import com.abstractfactory.template.model.loja.gustavo.loja.jpa.converter.ProdutoJpaConverter;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoFactoryProvider factoryProvider;

    @Autowired
    private ProdutoJpaRepository produtoJpaRepository;

    @Autowired
    private ProdutoJpaConverter ProdutoJpaConverter;

    public ProdutoServiceImpl(ProdutoJpaRepository produtoJpaRepository, ProdutoFactoryProvider factoryProvider, ProdutoJpaConverter produtoJpaConverter) {
        this.produtoJpaRepository = produtoJpaRepository;
        this.factoryProvider = factoryProvider;
        this.ProdutoJpaConverter = produtoJpaConverter;
    }

    @Override
    public void criarProduto(ProdutoEntity produto) {
        ProdutoFactory factory = factoryProvider.getFactory(produto.getMarca());
        ProdutoEntity produtoEntity = (ProdutoEntity) factory.criarProduto(produto.getTipo(), produto.getMarca());
        this.produtoJpaRepository.save(produtoEntity);
    }

    @Override
    public List<ProdutoEntity> consultarProdutos() {
        return this.produtoJpaRepository.findAll();
    }

    @Override
    public ProdutoEntity consultarProdutoPorId(Long id) {
        return this.produtoJpaRepository.findById(id).orElse(null); 
    }

    @Override
    public List<ProdutoEntity> consultarProdutosPorTipo(String tipo) {
        return this.produtoJpaRepository.findByTipo(tipo);
    }

    @Override
    public List<ProdutoEntity> consultarProdutosPorMarca(String marca) {
        return this.produtoJpaRepository.findByMarca(marca);
    }

    @Override
    public void deletarProduto(Long id) {
        this.produtoJpaRepository.deleteById(id);
    }

}
