package com.example.bicicletario.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sistema de controle de bicicletário")
                        .version("1.0")
                        .description("Modelo da disciplina. Documentação relacionada ao sistema de controle de bicicletário. Toda a API está documentada neste arquivo de definição."));
    }
}
