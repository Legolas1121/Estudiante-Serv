package com.estudiante.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "estudiantes" )
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;

    //@JsonIgnoreProperties( "usuario" )
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne( optional = false,  fetch = FetchType.LAZY )
    @JoinColumn( name = "id_curso", referencedColumnName = "id")
    private Curso curso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
