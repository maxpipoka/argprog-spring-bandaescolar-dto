package com.argprog.spring.bandaescolar.services;

import java.util.List;

import com.argprog.spring.bandaescolar.models.Instrumento;

public interface IInstrumentoServices {
    
    public List<Instrumento> getInstrumentos();

    public void saveInstrumento(Instrumento instrumento);

    public void deleteInstrumento(Long id);

    public Instrumento findInstrumento(Long id);
}
