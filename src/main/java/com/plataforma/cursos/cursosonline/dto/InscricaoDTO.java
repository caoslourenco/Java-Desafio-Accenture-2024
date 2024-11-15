package com.plataforma.cursos.cursosonline.dto;

import java.time.LocalDate;

public class InscricaoDTO {
    private Long id;
    private Long alunoId;
    private Long cursoId;
    private LocalDate dataInscricao;

    // Construtor vazio
    public InscricaoDTO() {}

    // Construtor com parâmetros
    public InscricaoDTO(Long id, Long alunoId, Long cursoId, LocalDate dataInscricao) {
        this.id = id;
        this.alunoId = alunoId;
        this.cursoId = cursoId;
        this.dataInscricao = dataInscricao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
}
