package com.estudiante.service;

import com.estudiante.model.Curso;

import java.util.List;

public interface ICursoService {

    public List<Curso> findAll();

    public Curso findById( Long id );

    public Curso save( Curso curso );

    public Curso update( Curso curso );

    public void deleteById( Long id );
}
