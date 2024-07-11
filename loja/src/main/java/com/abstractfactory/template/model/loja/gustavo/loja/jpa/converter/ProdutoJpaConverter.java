package com.abstractfactory.template.model.loja.gustavo.loja.jpa.converter;

import com.abstractfactory.template.model.loja.gustavo.loja.jpa.entity.ProdutoEntity;
import com.abstractfactory.template.model.loja.gustavo.loja.models.ProdutoRepresentation;

public class ProdutoJpaConverter {

    public ProdutoEntity convert(ProdutoRepresentation rep) {
    ProdutoEntity obj = new ProdutoEntity();
    obj.setId(rep.getId());
    obj.setNome(rep.getNome());
    obj.setPreco(rep.getValor());

    return obj;
    }

    public ProdutoRepresentation convertBack(ProdutoEntity obj) {
        ProdutoRepresentation rep = new ProdutoRepresentation();
        rep.setId(obj.getId());
        rep.setNome(obj.getNome());
        return rep;
    }
}
