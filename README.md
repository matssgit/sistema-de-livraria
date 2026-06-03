# 📚 Sistema de Livraria

Projeto desenvolvido em Java com o objetivo de simular o gerenciamento básico de empréstimos de livros em uma biblioteca através de uma aplicação de console.

---

## 🎯 Objetivo

O sistema permite visualizar os livros disponíveis para empréstimo e registrar empréstimos de forma simples, aplicando conceitos fundamentais da Programação Orientada a Objetos (POO), manipulação de listas, encapsulamento, relacionamentos entre classes e interação com o usuário.

Este projeto foi desenvolvido como prática de estudos em Java e tem como foco consolidar conhecimentos essenciais para o desenvolvimento backend.

---

## 🚀 Funcionalidades

* Listagem de livros disponíveis para empréstimo
* Consulta de livros por ID
* Registro de empréstimos
* Controle de disponibilidade dos livros
* Associação entre livros e autores
* Registro do cliente responsável pelo empréstimo
* Armazenamento dos empréstimos realizados em memória
* Interface de interação via terminal (console)

---

## 🏗️ Arquitetura do Projeto

O projeto foi organizado seguindo o princípio de separação de responsabilidades.

### Classes Principais

### Autor

Representa o autor de um livro.

**Atributos:**

* id
* nome
* dataNascimento

### Livro

Representa um livro disponível na biblioteca.

**Atributos:**

* id
* titulo
* autor
* disponivel
* dataCadastro
* dataAtualizacao

### Emprestimo

Representa o empréstimo de um livro para um cliente.

**Atributos:**

* id
* livro
* nomeCliente
* dataEmprestimo
* dataDevolucao

### Biblioteca

Responsável pelo gerenciamento dos dados da aplicação.

**Responsabilidades:**

* Armazenar livros
* Armazenar autores
* Armazenar empréstimos
* Listar livros disponíveis
* Buscar livros por ID
* Realizar empréstimos

### Main

Classe responsável pelo ponto de entrada da aplicação e pela interação direta com o usuário através do console.

---

## 📂 Estrutura de Pastas

```text
src/
├── model/
│   ├── Autor.java
│   ├── Livro.java
│   └── Emprestimo.java
│
├── service/
│   └── Biblioteca.java
│
└── Main.java
```

---

## 🛠️ Tecnologias Utilizadas

* Java 21
* Programação Orientada a Objetos (POO)
* Collections Framework (List / ArrayList)
* LocalDate
* Scanner
* IntelliJ IDEA

---

## 💡 Conceitos Aplicados

Durante o desenvolvimento deste projeto foram praticados conceitos importantes do ecossistema Java:

* Encapsulamento
* Classes e Objetos
* Métodos Construtores
* Relacionamento entre Objetos
* Composição
* Collections (List e ArrayList)
* Estruturas de Repetição
* Estruturas Condicionais
* Manipulação de Strings
* Manipulação de Datas com LocalDate
* Organização em Camadas
* Boas práticas de orientação a objetos

---

## 📋 Fluxo de Funcionamento

1. O sistema é iniciado através da classe Main.
2. O usuário escolhe visualizar os livros disponíveis.
3. Os livros disponíveis são exibidos no console.
4. O usuário informa o ID do livro desejado.
5. O usuário informa seu nome.
6. O sistema valida a disponibilidade do livro.
7. O empréstimo é registrado em memória.
8. O livro é marcado como indisponível.
9. Uma mensagem de confirmação é exibida ao usuário.
10. O programa encerra sua execução.

---

## 📚 Dados Iniciais

A aplicação possui uma lista pré-carregada de autores e livros para facilitar os testes e demonstrações.

### Livros cadastrados

* Clean Code
* Clean Architecture
* Refactoring
* Domain-Driven Design
* Effective Java
* The Pragmatic Programmer
* 1984
* A Revolução dos Bichos
* O Hobbit
* O Senhor dos Anéis
* Dom Casmurro
* Memórias Póstumas de Brás Cubas
* O Pequeno Príncipe

---

## 🔮 Possíveis Melhorias Futuras

O projeto foi desenvolvido com foco educacional, mas pode ser expandido com diversas funcionalidades:

* Cadastro dinâmico de livros
* Cadastro de autores
* Cadastro de clientes
* Histórico de empréstimos
* Devolução de livros
* Busca de livros por título
* Busca de livros por autor
* Persistência em banco de dados
* API REST com Spring Boot
* Testes automatizados com JUnit e Mockito
* Interface gráfica
* Controle de usuários e permissões

---

## 🎓 Aprendizados

Este projeto permitiu praticar conceitos fundamentais do desenvolvimento backend com Java, incluindo:

* Modelagem de entidades
* Organização de responsabilidades entre classes
* Manipulação de listas em memória
* Fluxo de negócio para empréstimos
* Entrada e saída de dados via console
* Estruturação de aplicações orientadas a objetos

---

## 👨‍💻 Autor

**Matheus Santana Silva**

Backend Developer | Java & Spring Boot | REST APIs | SQL

GitHub: https://github.com/matssgit

LinkedIn: https://linkedin.com/in/matheussantanadev
