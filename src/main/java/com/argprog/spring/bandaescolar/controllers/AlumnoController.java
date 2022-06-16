package com.argprog.spring.bandaescolar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.spring.bandaescolar.models.Alumno;
import com.argprog.spring.bandaescolar.services.IAlumnoServices;

@RestController
public class AlumnoController {

    @Autowired
    private IAlumnoServices alumnoInter;

    @PostMapping("/alumno/save")
    public void saveAlumno(@RequestBody Alumno alumno){
        alumnoInter.saveAlumno(alumno);
    }
}
