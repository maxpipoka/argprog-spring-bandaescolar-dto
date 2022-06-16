package com.argprog.spring.bandaescolar.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.argprog.spring.bandaescolar.models.Alumno;
import com.argprog.spring.bandaescolar.repository.AlumnoRepository;

public class AlumnoServices implements IAlumnoServices{
    
    @Autowired
    private AlumnoRepository alumnoRepo;

    @Override
    public void deleteAlumno(Long id) {
        alumnoRepo.deleteById(id);
    }

    @Override
    public Alumno findAlumno(Long id) {
        Alumno alumnoFinded = alumnoRepo.findById(id).orElse(null); 
        return alumnoFinded;
    }

    @Override
    public List<Alumno> getAlumnos() {
        List<Alumno> alumnos = alumnoRepo.findAll();
        return alumnos;
    }

    @Override
    public void saveAlumno(Alumno alumno) {
        alumnoRepo.save(alumno);
        
    }

    
}
