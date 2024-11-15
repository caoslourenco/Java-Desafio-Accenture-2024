package com.plataforma.cursos.cursosonline.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Curso curso;

    private LocalDate dataInscricao;

    // Getters and Setters
}
