package com.estudiante.service;

import com.estudiante.model.Estudiante;

import java.util.List;

public interface IEstudianteService {

    public List<Estudiante> findAll();

    public Estudiante findById( Long id );

    public Estudiante save( Estudiante estudiante );
    public Estudiante update( Estudiante estudianteNuevo );

    public void deleteById( Long id );
}
