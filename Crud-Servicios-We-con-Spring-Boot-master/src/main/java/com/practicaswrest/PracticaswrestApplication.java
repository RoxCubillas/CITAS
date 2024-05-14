package com.practicaswrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PracticaswrestApplication {

    public static void main(String[] args) {
        System.setProperty("server.port", "8096");
        SpringApplication.run(PracticaswrestApplication.class, args);
    }
    
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Permitir todas las solicitudes cruzadas
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitir métodos HTTP
                .allowedHeaders("*"); // Permitir todas las cabeceras
    }
}


