package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Emprestimo {
    private int id;
    private Livro livro;
    private String nomeCliente;
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucao;

    public Emprestimo(int id,  Livro livro, String nomeCliente) {
        this.id = id;
        this.livro = livro;
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = LocalDateTime.now();
        this.dataDevolucao = null; // ainda não devolvido
    }

}
