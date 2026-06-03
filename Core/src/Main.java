import model.Autor;
import model.Livro;
import service.Biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

//        carga inicial dos dados
        Autor autor1 = new Autor(1, "Robert C. Martin", LocalDate.of(1952, 12, 5));
        Autor autor2 = new Autor(2, "Martin Fowler", LocalDate.of(1963, 12, 18));
        Autor autor3 = new Autor(3, "Eric Evans", LocalDate.of(1965, 1, 1));
        Autor autor4 = new Autor(4, "Joshua Bloch", LocalDate.of(1961, 4, 28));
        Autor autor5 = new Autor(5, "Andrew Hunt", LocalDate.of(1964, 5, 10));
        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);
        biblioteca.adicionarAutor(autor3);
        biblioteca.adicionarAutor(autor4);
        biblioteca.adicionarAutor(autor5);

        biblioteca.adicionarLivro(new Livro(101, "Clean Code", autor1));
        biblioteca.adicionarLivro(new Livro(102, "Refactoring", autor2));
        biblioteca.adicionarLivro(new Livro(103, "Domain-Driven Design", autor3));
        biblioteca.adicionarLivro(new Livro(104, "Effective Java", autor4));
        biblioteca.adicionarLivro(new Livro(105, "The Pragmatic Programmer", autor5));

        System.out.println("*****  -  Bem-vindo à Biblioteca -  *****");
        String opcao;

        do {
            System.out.println("\nDeseja ver a lista de livros disponíveis? (SIM/NÃO):");
            opcao = scanner.nextLine().trim().toUpperCase();

            if (opcao.equals("SIM")) {
                biblioteca.listarLivrosDisponiveis();

                System.out.println("\nDigite o ID do livro que deseja emprestar (ou 0 para cancelar): ");
                int idLivro = Integer.parseInt(scanner.nextLine().trim());

                if (idLivro == 0) {
                    System.out.println("Operação cancelada.");
                    continue;
                }

                System.out.println("Informe o seu nome: ");
                String nomeCliente = scanner.nextLine().trim();

                biblioteca.realizarEmprestimo(idLivro, nomeCliente);

            } else if (opcao.equals("NAO") || (opcao.equals("NÃO"))) {
                break;
            } else {
                System.out.println("Opção inválida. Por favor, digite SIM ou NÃO.");
            }
        } while (opcao.equals("SIM"));

        System.out.println("\nObrigado por utilizar meu sistema. Até mais! =)");
        scanner.close();
    }

}