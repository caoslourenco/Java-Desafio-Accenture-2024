package com.plataforma.cursos.cursosonline.repository;

import com.plataforma.cursos.cursosonline.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    // Buscar um aluno pelo email
    Optional<Aluno> findByEmail(String email);

    // Buscar alunos por nome
    List<Aluno> findByNomeContainingIgnoreCase(String nome);

    // Buscar alunos cadastrados após uma determinada data
    List<Aluno> findByDataCadastroAfter(LocalDate data);
}
