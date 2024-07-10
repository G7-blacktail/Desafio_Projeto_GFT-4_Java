package com.abstractfactory.template.model.loja.gustavo.loja.models;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

public class Tablet implements Produto {
    
    private String nome;

    private String marca;

    private String tipo;

    private double valor;

    private String descricao;

    public Tablet(String nome, String marca, String tipo, double valor, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Tablet() {
        //TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
