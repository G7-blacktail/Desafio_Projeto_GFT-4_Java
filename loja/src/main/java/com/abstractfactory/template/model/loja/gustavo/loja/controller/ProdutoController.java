package com.abstractfactory.template.model.loja.gustavo.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.EletronicoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;
import com.abstractfactory.template.model.loja.gustavo.loja.repository.CelularJpaRepository;

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
    private final EletronicoFactory fabricaSamsung;  

    private CelularJpaRepository celularJpaRepository;

    public ProdutoController(EletronicoFactory fabricaApple, EletronicoFactory fabricaSamsung) {
        this.fabricaApple = fabricaApple;
        this.fabricaSamsung = fabricaSamsung;
    }

    @PostMapping("/apple/celular")
    public ResponseEntity<Produto> criarAppleCelular(@RequestBody Produto request) {
        Produto celular = fabricaApple.criarCelular(request.getNome(), request.getMarca(), request.getTipo(), request.getValor(), request.getDescricao());
        // Lógica para salvar o celular no banco de dados
        return ResponseEntity.ok(celular);
    }

    @PostMapping("/samsung/tablet")
    public ResponseEntity<Produto> criarSamsungTablet(@RequestBody Produto request) {
        Produto tablet = fabricaSamsung.criarTablet(request.getNome(), request.getMarca(), request.getTipo(), request.getValor(), request.getDescricao());
        // Lógica para salvar o tablet no banco de dados
        return ResponseEntity.ok(tablet);
    }

    @GetMapping("/apple/celulares")
    public ResponseEntity<List<Produto>> listarCelularesApple() {
        List<Produto> listaDeCelulares = this.celularJpaRepository.findAll();
        return ResponseEntity.ok(listaDeCelulares);
    }

    @GetMapping("/samsung/tablets")
    public ResponseEntity<List<Produto>> listarTabletsSamsung() {
        List<Produto> listaDeTablets = this.celularJpaRepository.findAll();
        return ResponseEntity.ok(listaDeTablets);
    }
}
