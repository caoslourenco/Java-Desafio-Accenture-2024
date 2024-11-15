package com.plataforma.cursos.cursosonline.populator;

import com.plataforma.cursos.cursosonline.dto.AlunoDTO;
import com.plataforma.cursos.cursosonline.dto.CursoDTO;
import com.plataforma.cursos.cursosonline.dto.InscricaoDTO;
import com.plataforma.cursos.cursosonline.entity.Aluno;
import com.plataforma.cursos.cursosonline.entity.Curso;
import com.plataforma.cursos.cursosonline.entity.Inscricao;
import org.springframework.stereotype.Component;

@Component
public class InscricaoPopulator {

    public AlunoDTO toAlunoDTO(Aluno aluno) {
        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setId(aluno.getId());
        alunoDTO.setNome(aluno.getNome());
        alunoDTO.setEmail(aluno.getEmail());
        alunoDTO.setDataCadastro(aluno.getDataCadastro());
        return alunoDTO;
    }

    public CursoDTO toCursoDTO(Curso curso) {
        CursoDTO cursoDTO = new CursoDTO();
        cursoDTO.setId(curso.getId());
        cursoDTO.setNome(curso.getNome());
        cursoDTO.setDescricao(curso.getDescricao());
        cursoDTO.setDataCriacao(curso.getDataCriacao());
        return cursoDTO;
    }

    public InscricaoDTO toInscricaoDTO(Inscricao inscricao) {
        InscricaoDTO inscricaoDTO = new InscricaoDTO();
        inscricaoDTO.setId(inscricao.getId());
        inscricaoDTO.setAlunoId(inscricao.getAluno().getId());
        inscricaoDTO.setCursoId(inscricao.getCurso().getId());
        inscricaoDTO.setDataInscricao(inscricao.getDataInscricao());
        return inscricaoDTO;
    }
}
