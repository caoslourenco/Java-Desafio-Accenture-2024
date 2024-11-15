package com.plataforma.cursos.cursosonline.controller;

import com.plataforma.cursos.cursosonline.dto.AlunoDTO;
import com.plataforma.cursos.cursosonline.dto.CursoDTO;
import com.plataforma.cursos.cursosonline.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping
    public CursoDTO cadastrarCurso(@RequestBody CursoDTO cursoDTO) {
        return cursoService.cadastrarCurso(cursoDTO);
    }

    @GetMapping("/{id}/alunos")
    public List<AlunoDTO> listarAlunosPorCurso(@PathVariable Long id) {
        return cursoService.listarAlunosPorCurso(id);
    }
}
