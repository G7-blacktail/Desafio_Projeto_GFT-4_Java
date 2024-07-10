package com.abstractfactory.template.model.loja.gustavo.loja.service.factories;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.ProdutoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Celular;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Laptop;
import com.abstractfactory.template.model.loja.gustavo.loja.models.TV;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Tablet;

public class SamsungProdutoFactory implements ProdutoFactory{

    @Override
    public Produto criarProduto(String tipo, String marca) {
        if (tipo.equals("celular")) {
            return new Celular("S24", marca, tipo, 4400.0, "Um iSmartphone Samsung");
        } else if (tipo.equals("tablet")) {
            return new Tablet("Galaxy TAB", marca, tipo, 600.0, "Um tablet da Samsung");
        } else if (tipo.equals("Laptop")) {
            return new Laptop("Galaxy Book", marca, tipo, 2995.0, "Um computador da Samsung");
        } else if (tipo.equals("TV")) {
            return new TV("Samsung crystal", marca, tipo, 2400.0, "Uma TV da Samsung");
        } else {
            throw new UnsupportedOperationException("Tipo de produto não suportado");
        }
    }
}
