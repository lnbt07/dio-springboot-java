package com.dio.UtilizandoBeans;

import jdk.jfr.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        System.out.println(livro);

        livro.setNome("Acotar");
        livro.setCodigo("AC1457S");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Sarah J Maas");
        livro.setAutorLivro(autor);
        livro.exibirLivro();

        ((AbstractApplicationContext) factory).close();
    }
}
