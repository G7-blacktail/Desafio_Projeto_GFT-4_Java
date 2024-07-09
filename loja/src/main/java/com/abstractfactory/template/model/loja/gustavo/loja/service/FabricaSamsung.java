package com.abstractfactory.template.model.loja.gustavo.loja.service;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.EletronicoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Celular;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Laptop;
import com.abstractfactory.template.model.loja.gustavo.loja.models.TV;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Tablet;

public class FabricaSamsung implements EletronicoFactory{

    public Produto criarCelular() {
        return new Celular();
    }

    public Produto criarTablet() {
        return new Tablet();
    }

        public Produto criarTV() {
        return new TV();
    }

    public Produto criarLaptop() {
        return new Laptop();
    }
}
