package service;

import model.Autor;
import model.Emprestimo;
import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros =  new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();
    private int proximoEmprestimoId = 1;

    public void adicionarAutor(Autor autor){
        autores.add(autor);
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivrosDisponiveis(){
        System.out.println("\n*****  -  Livros Disponíveis -  *****");
        boolean nenhumDisponivel = true;

        if (livros.isEmpty()){
            System.out.println("Nenhum livro cadastrado na biblioteca.");
            return;
        }

        for(Livro livro : livros){
            String status = livro.isDisponivel() ? "DISPONÍVEL" : "INDISPONIVEL";
            if (livro.isDisponivel()){
                System.out.println("ID: " + livro.getId() + " | Título: " + livro.getNome() + " | Autor: " + livro.getAutor().getNome() + " | Status: " + status);
                nenhumDisponivel = false;
            } else {
                System.out.println("ID: " + livro.getId() + " | Título: " + livro.getNome() + " | Autor: " + livro.getAutor().getNome() + " | Status: " + status);
            }
        }

        if (nenhumDisponivel){
            System.out.println("Nenhum livro disponível no momento.");
        }
    }

    public Livro buscarLivroPorId(int id) {
        for (Livro livro : livros){
            if (livro.getId() == id){
                return livro;
            }
        }
        return null;
    }

    public void realizarEmprestimo(int livroId, String nomeCliente){
        Livro livro = buscarLivroPorId(livroId);

        if (livro == null){
            System.out.println("Erro: Livro com ID " + livroId + " não encontrado.");
            return;
        }

        if (!livro.isDisponivel()){
            System.out.println("Erro: O livro \"" + livro.getNome() + "\" não está disponível para empréstimo.");
            return;
        }

//        executando o empréstimo
        livro.emprestar();
        Emprestimo novoEmprestimo = new Emprestimo(proximoEmprestimoId++, livro, nomeCliente);
        this.emprestimos.add(novoEmprestimo);

        System.out.println("\nSucesso! O livro \"" + livro.getNome() + "\" foi emprestado para " + nomeCliente + ".");
    }
}
