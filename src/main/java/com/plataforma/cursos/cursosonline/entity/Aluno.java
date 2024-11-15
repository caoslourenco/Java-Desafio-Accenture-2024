package com.plataforma.cursos.cursosonline.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private LocalDate dataCadastro;

    @OneToMany(mappedBy = "aluno")
    private Set<Inscricao> inscricoes = new HashSet<>();

    // Getters and Setters
}
