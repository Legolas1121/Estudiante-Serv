package com.estudiante.serviceImpl;

import com.estudiante.model.Estudiante;
import com.estudiante.repository.IEstudianteRepository;
import com.estudiante.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteImpl implements IEstudianteService {

    @Autowired
    IEstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findById(Long id) {
        return estudianteRepository.findById( id ).orElse( null );
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save( estudiante );
    }

    public Estudiante update( Estudiante estudianteNuevo ){
        Estudiante estudiante = findById( estudianteNuevo.getId() );
        estudiante.setNombres( estudianteNuevo.getNombres() );
        estudiante.setCurso( estudianteNuevo.getCurso() );

        return save( estudiante );
    }
    @Override
    public void deleteById(Long id) {
        estudianteRepository.deleteById( id );
    }
}
