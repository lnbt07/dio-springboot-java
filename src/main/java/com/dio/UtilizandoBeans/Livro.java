package com.dio.UtilizandoBeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {
    private String nome;
    private String codigo;

    @Autowired
    public AutorLivro getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

    private AutorLivro autorLivro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibirLivro() {
        System.out.println(this.getNome() + " - "+ this.getCodigo());
        autorLivro.exibirAutor();
    }
}
