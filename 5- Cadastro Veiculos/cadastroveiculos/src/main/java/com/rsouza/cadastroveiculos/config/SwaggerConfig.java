package com.rsouza.cadastroveiculos.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rsouza.cadastroveiculos.controller"))
                .paths(PathSelectors.regex("/veiculos.*"))
                .build()
                .apiInfo(getApiInfo());
    }

    public ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("Cadastro de Veículos")
                .description("Api para CRUD de veículos ")
                .contact(new Contact("Rodrigo de Souza Antunes", "https://github.com/RodrigoSouzaDev", "rsouzadev@gmail.com"))
                .version("1.0.0")
                .build();
    }
}
