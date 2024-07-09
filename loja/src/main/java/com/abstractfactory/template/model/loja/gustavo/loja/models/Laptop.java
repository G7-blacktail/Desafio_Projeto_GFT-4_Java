package com.abstractfactory.template.model.loja.gustavo.loja.models;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

public class Laptop implements Produto {
    
    @Override
    public String getDescricao() {
        return "Laptop com 16GB de RAM";
    }
}
