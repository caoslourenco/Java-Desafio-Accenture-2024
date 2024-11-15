package com.plataforma.cursos.cursosonline.repository;

import com.plataforma.cursos.cursosonline.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {
}
