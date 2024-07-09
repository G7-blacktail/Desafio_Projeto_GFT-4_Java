package com.abstractfactory.template.model.loja.gustavo.loja.service;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.EletronicoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Celular;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Laptop;
import com.abstractfactory.template.model.loja.gustavo.loja.models.TV;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Tablet;

public class FabricaApple implements EletronicoFactory{

    public Produto criarCelular() {
        return new Celular("iPhone 13", "Apple", "Smartphone", 6999.99, "Último modelo de iPhone");
    }

    public Produto criarTablet() {
        return new Tablet("iPad Pro", "Apple", "Tablet", 4499.99, "iPad de última geração");
    }

    public Produto criarTV() {
        return new TV();
    }

    public Produto criarLaptop() {
        return new Laptop();
    }
    
}
