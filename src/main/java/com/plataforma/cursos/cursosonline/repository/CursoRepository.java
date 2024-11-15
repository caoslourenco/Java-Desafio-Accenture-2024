package com.plataforma.cursos.cursosonline.repository;

import com.plataforma.cursos.cursosonline.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    // Buscar curso por nome
    List<Curso> findByNomeContainingIgnoreCase(String nome);

    // Buscar cursos criados após uma determinada data
    List<Curso> findByDataCriacaoAfter(LocalDate data);
}
