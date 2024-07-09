package com.abstractfactory.template.model.loja.gustavo.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

public interface CelularJpaRepository extends JpaRepository <Produto, String>{

    List<Produto> findByCelularApple();

    List<Produto> findByCelularSamsung();

    List<Produto> findByNome(String nome);

    List<Produto> findByTipo(String tipo);
    
}
