package com.abstractfactory.template.model.loja.gustavo.loja.service.factories;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.ProdutoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Celular;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Laptop;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Tablet;
import com.abstractfactory.template.model.loja.gustavo.loja.models.TV;

public class AppleProdutoFactory implements ProdutoFactory{

    @Override
    public Produto criarProduto(String tipo, String marca) {
        if (tipo.equals("celular")) {
            return new Celular("", marca, tipo, 100.0, "Um iPhone da Apple");
        } else if (tipo.equals("tablet")) {
            return new Tablet("IPad", marca, tipo, 600.0, "Um tablet da Apple");
        } else if (tipo.equals("Laptop")) {
            return new Laptop("MacBook", marca, tipo, 8000.0, "Um computador da Apple");
        } else if (tipo.equals("TV")) {
            return new TV("Apple TV 4k", marca, tipo, 800.0, "Uma TV da Apple");
        } else {
            throw new UnsupportedOperationException("Tipo de produto não suportado");
        }
    }
    
}
