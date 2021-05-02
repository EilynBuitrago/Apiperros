package com.umanizales.apiperros;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2

public class SwaggerConfig {

    @Bean
    public Docket apiPaseoPerroDocket(){
        return new Docket( DocumentationType.SWAGGER_2)
                .groupName("PaseoPerros")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.umanizales.apipaseoperros.controller"))
                .paths(PathSelectors.any()).build()
                .apiInfo(getApiInfo());
    }

    //Agregar metodo información o documentación de mi api
    private ApiInfo getApiInfo(){
        return new ApiInfo(
                "API Paseo Perros Lista SE",
                "Api que permite gestionar todo el backend a listas SE y DE ",
                "1.0",
                "http://www.umanizales.com/",
        new Contact("Eilyn Buitrago","http://www.umanizales.com/","edbuitrago88116@umanizales.edu.co"),
                "LISENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }






}
