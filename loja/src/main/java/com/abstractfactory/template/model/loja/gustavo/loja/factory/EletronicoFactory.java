package com.abstractfactory.template.model.loja.gustavo.loja.factory;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

public interface EletronicoFactory {
    // Produto criarProduto(String tipo);

    Produto criarCelular(String nome, String marca, String tipo, double valor, String descricao);
    Produto criarTablet(String nome, String marca, String tipo, double valor, String descricao);
    Produto criarLaptop(String nome, String marca, String tipo, double valor, String descricao);
    Produto criarTV(String nome, String marca, String tipo, double valor, String descricao);
}
