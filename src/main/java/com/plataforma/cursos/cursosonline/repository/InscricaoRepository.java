package com.plataforma.cursos.cursosonline.repository;

import com.plataforma.cursos.cursosonline.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {

    // Buscar inscrições de um aluno
    List<Inscricao> findByAlunoId(Long alunoId);

    // Buscar inscrições de um curso
    List<Inscricao> findByCursoId(Long cursoId);

    // Buscar inscrições feitas após uma determinada data
    List<Inscricao> findByDataInscricaoAfter(LocalDate data);
}
