package com.plataforma.cursos.cursosonline.controller;

import com.plataforma.cursos.cursosonline.dto.CursoDTO;
import com.plataforma.cursos.cursosonline.dto.AlunoDTO;
import com.plataforma.cursos.cursosonline.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public AlunoDTO cadastrarAluno(@RequestBody AlunoDTO alunoDTO) {
        return alunoService.cadastrarAluno(alunoDTO);
    }

    @GetMapping("/{id}/cursos")
    public List<CursoDTO> listarCursosPorAluno(@PathVariable Long id) {
        return alunoService.listarCursosPorAluno(id);
    }
}
