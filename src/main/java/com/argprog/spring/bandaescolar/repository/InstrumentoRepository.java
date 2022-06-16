package com.argprog.spring.bandaescolar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.argprog.spring.bandaescolar.models.Instrumento;

@Repository
public interface InstrumentoRepository extends JpaRepository<Instrumento, Long>{
    
}
