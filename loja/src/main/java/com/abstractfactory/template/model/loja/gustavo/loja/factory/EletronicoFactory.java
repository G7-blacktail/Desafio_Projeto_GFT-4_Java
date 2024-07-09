package com.abstractfactory.template.model.loja.gustavo.loja.factory;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

public interface EletronicoFactory {
    // Produto criarProduto(String tipo);

    Produto criarCelular();
    Produto criarTablet();
    Produto criarLaptop();
    Produto criarTV();
}
