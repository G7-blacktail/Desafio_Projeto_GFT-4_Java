package com.abstractfactory.template.model.loja.gustavo.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.EletronicoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    // private final EletronicoFactory tvFactory;
    // private final EletronicoFactory laptopFactory;

    // @Autowired
    // public ProdutoController(EletronicoFactory tvFactory, EletronicoFactory laptopFactory) {
    //     this.tvFactory = tvFactory;
    //     this.laptopFactory = laptopFactory;
    // }

    // @GetMapping("/tv")
    // public String getTvDescricao() {
    //     Produto tv = tvFactory.criarProduto("TV");
    //     return tv.getDescricao();
    // }

    // @GetMapping("/laptop")
    // public String getLaptopDescricao() {
    //     Produto laptop = laptopFactory.criarProduto("Laptop");
    //     return laptop.getDescricao();
    // }

    private final EletronicoFactory fabricaApple;
    private final EletronicoFactory  fabricaSamsung;

    public ProdutoController(EletronicoFactory  fabricaApple, EletronicoFactory  fabricaSamsung) {
        this.fabricaApple = fabricaApple;
        this.fabricaSamsung = fabricaSamsung;
    }

    @GetMapping("/apple/celular")
    public ResponseEntity<Produto> getAppleCelular() {
        Produto celular = fabricaApple.criarCelular();
        return ResponseEntity.ok(celular);
    }

    @GetMapping("/samsung/tablet")
    public ResponseEntity<Produto> getSamsungTablet() {
        Produto tablet = fabricaSamsung.criarTablet();
        return ResponseEntity.ok(tablet);
    }
}
