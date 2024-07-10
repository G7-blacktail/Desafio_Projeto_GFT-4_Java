package com.abstractfactory.template.model.loja.gustavo.loja.factory;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

public interface ProdutoFactory {
    Produto criarProduto(String tipo, String marca);
}