package com.plataforma.cursos.cursosonline.repository;

import com.plataforma.cursos.cursosonline.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
