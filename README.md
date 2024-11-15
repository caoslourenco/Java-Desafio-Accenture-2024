# Plataforma de Cursos Online - Desafio Java Accenture

Este repositório contém a implementação de uma aplicação Java para gerenciamento de uma plataforma de cursos online. O sistema utiliza o framework **Spring MVC** para implementar os controladores REST e o **Hibernate** para mapear as entidades para um banco de dados relacional.

## Objetivo

O objetivo do desafio é desenvolver uma plataforma que gerencie:
1. **Alunos**: Cadastro de alunos no sistema.
2. **Cursos**: Cadastro de cursos disponíveis.
3. **Inscrições**: Inscrição de alunos em cursos e visualização das inscrições.

## Funcionalidades

A aplicação deve permitir:

- **Cadastrar alunos e cursos**.
- **Inscrever um aluno em um curso**.
- **Listar todos os cursos em que um aluno está inscrito**.
- **Listar todos os alunos inscritos em um determinado curso**.

## Entidades

A aplicação trabalha com as seguintes tabelas no banco de dados:

### 1. Tabela **Aluno**
- **id** (Chave primária, auto-gerado)
- **nome** (String)
- **email** (String)
- **dataCadastro** (Data)

### 2. Tabela **Curso**
- **id** (Chave primária, auto-gerado)
- **nome** (String)
- **descricao** (String)
- **dataCriacao** (Data)

### 3. Tabela **Inscrição**
- **id** (Chave primária, auto-gerado)
- **aluno_id** (Chave estrangeira para a tabela Aluno)
- **curso_id** (Chave estrangeira para a tabela Curso)
- **dataInscricao** (Data)

A relação entre as tabelas é **muitos-para-muitos**, mapeada pela tabela **Inscrição**.

## Arquitetura

A aplicação segue a arquitetura MVC, com Spring Framework:

- **Controller**: Controladores Spring MVC para expor os endpoints REST.
- **DTO (Data Transfer Object)**: Uso de DTOs para evitar a exposição direta das entidades no Controller.
- **Populator**: Conversão de entidades `Aluno` e `Curso` para seus respectivos DTOs por meio de um InscricaoPopulator.

## Tecnologias

- **Java** (JDK 11 ou superior)
- **Spring MVC** (para controle e gerenciamento dos endpoints REST)
- **Hibernate** (para mapeamento objeto-relacional)
- **Banco de Dados H2** (para armazenar dados localmente)
- **Maven** (para gerenciamento de dependências)

## Como Executar

### Pré-requisitos

1. **Java 11 ou superior** instalado.
2. **Maven** para gerenciamento de dependências (opcional, se preferir usar a IDE, o Maven já será integrado).
3. **Banco de Dados H2**: Não é necessário instalar o H2 separadamente, pois o projeto já configura o banco automaticamente.

### Passos para rodar o projeto:

1. Clone este repositório:

   ```bash
   git clone https://github.com/caoslourenco/Java-Desafio-Accenture-2024
