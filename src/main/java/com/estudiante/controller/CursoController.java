package com.estudiante.controller;

import com.estudiante.model.Curso;
import com.estudiante.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api" )
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    @GetMapping( "/cursos" )
    public List<Curso> findAll(){
        return cursoService.findAll();
    }

    @GetMapping( "/cursos/{id}" )
    public Curso findById( @PathVariable Long id ){
        return cursoService.findById( id );
    }

    @PostMapping( "/cursos" )
    public Curso save( @RequestBody Curso curso ){
        return cursoService.save( curso );
    }

    @DeleteMapping( "/cursos/{id}")
    public void deleteById( @PathVariable Long id ){
        cursoService.deleteById( id );
    }

    @PutMapping( "/cursos" )
    public Curso update( @RequestBody Curso curso ){
        return cursoService.update( curso );
    }
}
