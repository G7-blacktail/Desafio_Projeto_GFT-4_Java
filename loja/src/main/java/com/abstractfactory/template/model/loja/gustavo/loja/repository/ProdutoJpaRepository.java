package com.abstractfactory.template.model.loja.gustavo.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.models.ProdutoRepresentation;

public interface ProdutoJpaRepository extends JpaRepository <ProdutoRepresentation, Long>{
    List<Produto> findByTipo(String tipo);
    List<Produto> findByMarca(String marca);
}
