package com.abstractfactory.template.model.loja.gustavo.loja.service;

import java.util.List;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.jpa.entity.ProdutoEntity;

public interface ProdutoService {
    void criarProduto(ProdutoEntity produto);
    List<ProdutoEntity> consultarProdutos();
    ProdutoEntity consultarProdutoPorId(Long id);
    List<ProdutoEntity> consultarProdutosPorTipo(String tipo);
    List<ProdutoEntity> consultarProdutosPorMarca(String marca);
    void deletarProduto(Long id);
}
