package com.plataforma.cursos.cursosonline.service;

import com.plataforma.cursos.cursosonline.dto.AlunoDTO;
import com.plataforma.cursos.cursosonline.dto.CursoDTO;
import com.plataforma.cursos.cursosonline.entity.Aluno;
import com.plataforma.cursos.cursosonline.entity.Curso;
import com.plataforma.cursos.cursosonline.populator.InscricaoPopulator;
import com.plataforma.cursos.cursosonline.repository.AlunoRepository;
import com.plataforma.cursos.cursosonline.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private InscricaoPopulator inscricaoPopulator;

    public CursoDTO cadastrarCurso(CursoDTO cursoDTO) {
        Curso curso = new Curso();
        curso.setNome(cursoDTO.getNome());
        curso.setDescricao(cursoDTO.getDescricao());
        curso.setDataCriacao(cursoDTO.getDataCriacao());

        Curso novoCurso = cursoRepository.save(curso);
        return inscricaoPopulator.toCursoDTO(novoCurso);
    }

    public List<AlunoDTO> listarAlunosPorCurso(Long cursoId) {
        Curso curso = cursoRepository.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso não encontrado"));

        // Extrair alunos associados ao curso
        return curso.getInscricoes().stream()
                .map(inscricao -> inscricaoPopulator.toAlunoDTO(inscricao.getAluno()))
                .collect(Collectors.toList());
    }
}
