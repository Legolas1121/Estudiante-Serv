package com.estudiante.repository;

import com.estudiante.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
