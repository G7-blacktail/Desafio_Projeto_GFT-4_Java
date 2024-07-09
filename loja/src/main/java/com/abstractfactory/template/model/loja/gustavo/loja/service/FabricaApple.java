package com.abstractfactory.template.model.loja.gustavo.loja.service;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.EletronicoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Celular;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Laptop;
import com.abstractfactory.template.model.loja.gustavo.loja.models.TV;
import com.abstractfactory.template.model.loja.gustavo.loja.models.Tablet;

public class FabricaApple implements EletronicoFactory{

    public Produto criarCelular(String nome, String marca, String tipo, double valor, String descricao) {
        return new Celular(nome, marca, tipo, valor, descricao);
    }

    public Produto criarTablet(String nome, String marca, String tipo, double valor, String descricao) {
        return new Celular(nome, marca, tipo, valor, descricao);
    }

    public Produto criarTV(String nome, String marca, String tipo, double valor, String descricao) {
        return new Celular(nome, marca, tipo, valor, descricao);
    }

    public Produto criarLaptop(String nome, String marca, String tipo, double valor, String descricao) {
        return new Celular(nome, marca, tipo, valor, descricao);
    }
    
}
