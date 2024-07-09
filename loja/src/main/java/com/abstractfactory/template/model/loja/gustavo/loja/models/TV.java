package com.abstractfactory.template.model.loja.gustavo.loja.models;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

public class TV implements Produto {

    private String nome;

    private String marca;

    private String tipo;

    private double valor;

    private String descricao;

    public TV(String nome, String marca, String tipo, double valor, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
    }

    // @Override
    // public String getDescricao() {
    //     return "TV de 55 polegadas";
    // }

    // @Override
    // public void exibirDetalhes() {
    //     System.out.println("TV de 55 polegadas");
    // }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return double return the valor
     */
    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
