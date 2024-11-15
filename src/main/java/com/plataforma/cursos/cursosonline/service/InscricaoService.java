package com.plataforma.cursos.cursosonline.service;

import com.plataforma.cursos.cursosonline.dto.InscricaoDTO;
import com.plataforma.cursos.cursosonline.entity.Aluno;
import com.plataforma.cursos.cursosonline.entity.Curso;
import com.plataforma.cursos.cursosonline.entity.Inscricao;
import com.plataforma.cursos.cursosonline.populator.InscricaoPopulator;
import com.plataforma.cursos.cursosonline.repository.AlunoRepository;
import com.plataforma.cursos.cursosonline.repository.CursoRepository;
import com.plataforma.cursos.cursosonline.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private InscricaoPopulator inscricaoPopulator;

    public InscricaoDTO inscreverAluno(InscricaoDTO inscricaoDTO) {
        // Validar se o aluno e o curso existem
        Aluno aluno = alunoRepository.findById(inscricaoDTO.getAlunoId())
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        Curso curso = cursoRepository.findById(inscricaoDTO.getCursoId())
                .orElseThrow(() -> new RuntimeException("Curso não encontrado"));

        // Criar nova inscrição
        Inscricao inscricao = new Inscricao();
        inscricao.setAluno(aluno);
        inscricao.setCurso(curso);
        inscricao.setDataInscricao(LocalDate.now());

        // Salvar inscrição no banco
        Inscricao novaInscricao = inscricaoRepository.save(inscricao);

        // Converter para DTO e retornar
        return inscricaoPopulator.toInscricaoDTO(novaInscricao);
    }
}
