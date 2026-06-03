package model;

import java.time.LocalDateTime;

public class Livro {
    private int id;
    private String nome;
    private Autor autor;
    private boolean disponivel;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;

    public Livro(int id, String nome, Autor autor) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.disponivel = true;
        this.dataCadastro = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }

//    métodos de negócio
    public void emprestar(){
        this.disponivel = false;
        this.dataAtualizacao = LocalDateTime.now();
    }

//    Getters e Setters

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
