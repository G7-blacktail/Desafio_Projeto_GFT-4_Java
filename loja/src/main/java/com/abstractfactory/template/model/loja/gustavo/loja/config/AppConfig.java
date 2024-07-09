package com.abstractfactory.template.model.loja.gustavo.loja.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abstractfactory.template.model.loja.gustavo.loja.factory.EletronicoFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.service.LaptopFactory;
import com.abstractfactory.template.model.loja.gustavo.loja.service.TVFactory;

@Configuration
public class AppConfig {
    @Bean
    public EletronicoFactory tvFactory() {
        return new TVFactory();
    }

    @Bean
    public EletronicoFactory laptopFactory() {
        return new LaptopFactory();
    }
}
