package com.plataforma.cursos.cursosonline.controller;

import com.plataforma.cursos.cursosonline.dto.AlunoDTO;
import com.plataforma.cursos.cursosonline.dto.CursoDTO;
import com.plataforma.cursos.cursosonline.service.AlunoService;
import com.plataforma.cursos.cursosonline.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;
    
    @Autowired
    private CursoService cursoService;

    // Endpoint para cadastrar aluno
    @PostMapping
    public AlunoDTO cadastrarAluno(@RequestBody AlunoDTO alunoDTO) {
        return alunoService.cadastrarAluno(alunoDTO);
    }

    // Endpoint para listar todos os cursos de um aluno
    @GetMapping("/{id}/cursos")
    public List<CursoDTO> listarCursosPorAluno(@PathVariable Long id) {
        return alunoService.listarCursosPorAluno(id);
    }

    // Endpoint para listar todos os alunos inscritos em um determinado curso
    @GetMapping("/cursos/{cursoId}")
    public List<AlunoDTO> listarAlunosPorCurso(@PathVariable Long cursoId) {
        return cursoService.listarAlunosPorCurso(cursoId);
    }

    // Endpoint para inscrever um aluno em um curso
    @PostMapping("/{alunoId}/cursos/{cursoId}")
    public String inscreverAlunoEmCurso(@PathVariable Long alunoId, @PathVariable Long cursoId) {
        return alunoService.inscreverAlunoEmCurso(alunoId, cursoId);
    }
}
