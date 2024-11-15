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
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private InscricaoPopulator inscricaoPopulator;

    public AlunoDTO cadastrarAluno(AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoDTO.getNome());
        aluno.setEmail(alunoDTO.getEmail());
        aluno.setDataCadastro(alunoDTO.getDataCadastro());

        Aluno novoAluno = alunoRepository.save(aluno);
        return inscricaoPopulator.toAlunoDTO(novoAluno);
    }

    public List<CursoDTO> listarCursosPorAluno(Long alunoId) {
        Aluno aluno = alunoRepository.findById(alunoId)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        // Extrair cursos associados ao aluno
        return aluno.getInscricoes().stream()
                .map(inscricao -> inscricaoPopulator.toCursoDTO(inscricao.getCurso()))
                .collect(Collectors.toList());
    }
}
