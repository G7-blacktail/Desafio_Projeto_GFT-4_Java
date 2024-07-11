package com.abstractfactory.template.model.loja.gustavo.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.jpa.entity.ProdutoEntity;

public interface ProdutoJpaRepository extends JpaRepository <ProdutoEntity, Long>{
    List<ProdutoEntity> findByTipo(String tipo);
    List<ProdutoEntity> findByMarca(String marca);
}
