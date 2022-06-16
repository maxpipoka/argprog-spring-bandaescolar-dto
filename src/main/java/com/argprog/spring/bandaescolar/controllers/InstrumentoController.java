package com.argprog.spring.bandaescolar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.argprog.spring.bandaescolar.models.Instrumento;
import com.argprog.spring.bandaescolar.services.IInstrumentoServices;

@RestController
public class InstrumentoController {

    @Autowired
    private IInstrumentoServices instruInterface;

    @PostMapping("/instrumento/save")
    public void saveInstrumento(@RequestBody Instrumento instrumento){
        instruInterface.saveInstrumento(instrumento);
    }
}
