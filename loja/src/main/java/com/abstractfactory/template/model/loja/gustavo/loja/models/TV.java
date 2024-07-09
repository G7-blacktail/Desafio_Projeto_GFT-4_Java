package com.abstractfactory.template.model.loja.gustavo.loja.models;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

public class TV implements Produto {

    @Override
    public String getDescricao() {
        return "TV de 55 polegadas";
    }
}
