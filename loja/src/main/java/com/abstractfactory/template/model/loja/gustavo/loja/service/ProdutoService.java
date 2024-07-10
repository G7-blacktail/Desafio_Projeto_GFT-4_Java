package com.abstractfactory.template.model.loja.gustavo.loja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

@Service
public interface ProdutoService {
    void criarProduto(Produto produto);
    List<Produto> consultarProdutos();
    Produto consultarProdutoPorId(Long id);
    List<Produto> consultarProdutosPorTipo(String tipo);
    List<Produto> consultarProdutosPorMarca(String marca);
    void deletarProduto(Long id);
}
