package com.estudiante.controller;

import com.estudiante.model.Estudiante;
import com.estudiante.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api" )
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping( "/estudiantes" )
    public List<Estudiante> findAll(){
        return estudianteService.findAll();
    }

    @GetMapping( "/estudiantes/{id}" )
    public Estudiante findById( @PathVariable Long id ){
        return estudianteService.findById( id );
    }

    @PostMapping( "/estudiantes" )
    public Estudiante save( @RequestBody Estudiante estudiante ){
        return estudianteService.save( estudiante );
    }

    @PutMapping( "/estudiantes" )
    public Estudiante update( @RequestBody Estudiante estudianteNuevo){
        return estudianteService.update( estudianteNuevo );
    }

    @DeleteMapping( "/estudiantes/{id}" )
    public void deleteById( @PathVariable Long id ){
        estudianteService.deleteById( id );
    }
}
