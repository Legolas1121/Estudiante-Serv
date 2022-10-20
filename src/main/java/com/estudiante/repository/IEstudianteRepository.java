package com.estudiante.repository;

import com.estudiante.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {
}
