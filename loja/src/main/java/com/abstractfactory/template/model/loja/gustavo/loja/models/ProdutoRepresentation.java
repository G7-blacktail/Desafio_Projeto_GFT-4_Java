package com.abstractfactory.template.model.loja.gustavo.loja.models;

import com.abstractfactory.template.model.loja.gustavo.loja.interfaces.Produto;

public class ProdutoRepresentation implements Produto {
        private String nome;
        private String marca;
        private String tipo;
        private double valor;
        private String descricao;
        private Long id;
    
        
        public ProdutoRepresentation(String nome, String marca, String tipo, double valor, String descricao) {
            this.nome = nome;
            this.marca = marca;
            this.tipo = tipo;
            this.valor = valor;
            this.descricao = descricao;
        }

        public ProdutoRepresentation() {}
        
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        @Override
        public String getNome() {
            return nome;
        }
    
        @Override
        public String getMarca() {
            return marca;
        }
    
        @Override
        public String getTipo() {
            return tipo;
        }
    
        @Override
        public double getValor() {
            return valor;
        }
    
        @Override
        public String getDescricao() {
            return descricao;
        }

        public void setNome(String nome2) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setNome'");
        }

        public void setPreco(Object setPreco) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setPreco'");
        }
    }