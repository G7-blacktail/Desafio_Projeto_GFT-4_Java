package com.abstractfactory.template.model.loja.gustavo.loja.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.ProdutoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.service.factories.AppleProdutoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.service.factories.SamsungProdutoFactory;


@Configuration
public class AppConfig {
    // @Bean
    // public EletronicoFactory tvFactory() {
    //     return new TVFactory();
    // }

    // @Bean
    // public EletronicoFactory laptopFactory() {
    //     return new LaptopFactory();
    // }

    @Bean
    public ProdutoFactory fabricaApple() {
        return new AppleProdutoFactory();
    }
    
    @Bean
    public ProdutoFactory fabricaSamsung() {
        return new SamsungProdutoFactory();
    }
}
