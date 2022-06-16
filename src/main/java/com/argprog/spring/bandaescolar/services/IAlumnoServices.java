package com.argprog.spring.bandaescolar.services;

import java.util.List;

import com.argprog.spring.bandaescolar.models.Alumno;

public interface IAlumnoServices {
    
    public List<Alumno> getAlumnos();

    public void deleteAlumno(Long id);

    public void saveAlumno(Alumno alumno);

    public Alumno findAlumno(Long id);
}
