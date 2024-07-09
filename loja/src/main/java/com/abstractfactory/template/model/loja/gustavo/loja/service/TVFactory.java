package com.abstractfactory.template.model.loja.gustavo.loja.service;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.EletronicoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.models.TV;

public class TVFactory implements EletronicoFactory {

    @Override
    public Produto criarProduto(String tipo) {
        
        return new TV();
    }
}
