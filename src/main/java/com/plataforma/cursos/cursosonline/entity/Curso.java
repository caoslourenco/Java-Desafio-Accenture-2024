package com.plataforma.cursos.cursosonline.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataCriacao;

    @OneToMany(mappedBy = "curso")
    private Set<Inscricao> inscricoes = new HashSet<>();

    // Getters and Setters
}
