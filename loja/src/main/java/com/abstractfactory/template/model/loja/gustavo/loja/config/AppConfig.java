package com.abstractfactory.template.model.loja.gustavo.loja.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abstractfactory.template.model.loja.gustavo.loja.service.factories.AppleProdutoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.service.factories.SamsungProdutoFactory;


@Configuration
public class AppConfig {
    @Bean
    public AppleProdutoFactory appleProdutoFactory() {
        return new AppleProdutoFactory();
    }
    
    @Bean
    public SamsungProdutoFactory samsungProdutoFactory() {
        return new SamsungProdutoFactory();
    }
}
