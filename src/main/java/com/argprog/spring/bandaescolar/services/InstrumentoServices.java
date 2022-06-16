package com.argprog.spring.bandaescolar.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.argprog.spring.bandaescolar.models.Instrumento;
import com.argprog.spring.bandaescolar.repository.InstrumentoRepository;

public class InstrumentoServices implements IInstrumentoServices {

    @Autowired
    private InstrumentoRepository instruRepo;

    @Override
    public void deleteInstrumento(Long id) {
        instruRepo.deleteById(id);
    }

    @Override
    public Instrumento findInstrumento(Long id) {
        Instrumento instruFinded = instruRepo.findById(id).orElse(null);
        return instruFinded;
    }

    @Override
    public List<Instrumento> getInstrumentos() {
        List<Instrumento> instrumentos = instruRepo.findAll();
        return instrumentos;
    }

    @Override
    public void saveInstrumento(Instrumento instrumento) {
        instruRepo.save(instrumento);
        
    }

    
    
}
