package com.plataforma.cursos.cursosonline.controller;

import com.plataforma.cursos.cursosonline.dto.InscricaoDTO;
import com.plataforma.cursos.cursosonline.service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    // Endpoint para inscrever um aluno em um curso
    @PostMapping
    public InscricaoDTO inscreverAluno(@RequestBody InscricaoDTO inscricaoDTO) {
        return inscricaoService.inscreverAluno(inscricaoDTO);
    }
}
