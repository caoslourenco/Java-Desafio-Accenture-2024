package com.plataforma.cursos.cursosonline.repository;

import com.plataforma.cursos.cursosonline.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
