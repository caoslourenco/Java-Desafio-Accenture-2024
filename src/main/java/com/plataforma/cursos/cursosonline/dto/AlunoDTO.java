package com.plataforma.cursos.cursosonline.dto;

import java.time.LocalDate;

public class AlunoDTO {
    private Long id;
    private String nome;
    private String email;
    private LocalDate dataCadastro;

    // Construtor vazio
    public AlunoDTO() {}

    // Construtor com parâmetros
    public AlunoDTO(Long id, String nome, String email, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
