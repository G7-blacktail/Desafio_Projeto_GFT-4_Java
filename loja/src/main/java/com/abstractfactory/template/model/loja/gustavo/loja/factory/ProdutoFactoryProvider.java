package com.abstractfactory.template.model.loja.gustavo.loja.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.abstractfactory.template.model.loja.gustavo.loja.service.factories.AppleProdutoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.service.factories.SamsungProdutoFactory;

public class ProdutoFactoryProvider {

    @Autowired
    private AppleProdutoFactory appleFactory;

    @Autowired
    private SamsungProdutoFactory samsungFactory;

    public ProdutoFactory getFactory(String marca) {
        if (marca.equals("Apple")) {
            return appleFactory;
        } else if (marca.equals("Samsung")) {
            return samsungFactory;
        } else {
            throw new UnsupportedOperationException("Marca não suportada");
        }
    }
}
