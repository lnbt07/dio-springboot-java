package com.dio.UtilizandoBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Livro getLivro(){
        return new Livro();
    }

    @Bean
    public AutorLivro getAutorLivro(){
        return new Autor();
    }

    //em xml seria
    //<bean id="livro" class="com.dio.UtilizandoBeans.Livro">
}
