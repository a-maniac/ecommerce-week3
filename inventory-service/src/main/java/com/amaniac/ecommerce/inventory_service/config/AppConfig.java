package com.amaniac.ecommerce.inventory_service.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
