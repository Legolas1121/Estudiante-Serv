package com.estudiante.serviceImpl;

import com.estudiante.model.Curso;
import com.estudiante.repository.ICursoRepository;
import com.estudiante.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoImpl implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepository;

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso findById(Long id) {
        return cursoRepository.findById( id ).orElse( null );
    }

    @Override
    public Curso save(Curso curso) {
        return cursoRepository.save( curso );
    }

    @Override
    public Curso update(Curso cursoNuevo) {
        Curso curso = findById( cursoNuevo.getId() );
        curso.setCurso( cursoNuevo.getCurso() );
        return save( curso );
    }

    @Override
    public void deleteById(Long id) {
        cursoRepository.deleteById( id );
    }
}
