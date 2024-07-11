package com.abstractfactory.template.model.loja.gustavo.loja.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_eletronico")
public class EletronicoEntity extends ProdutoEntity {

    @Column(name = "tp_marca")
    private String marca;

    @Column(name = "tp_modelo")
    private String model;

    @Column(name = "ds_descricao")
    private String descricaoTecnica;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescricaoTecnica() {
        return descricaoTecnica;
    }

    public void setDescricaoTecnica(String descricaoTecnica) {
        this.descricaoTecnica = descricaoTecnica;
    }

}