package com.argprog.spring.bandaescolar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Instrumento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idInstrumento;
    @Column(nullable=false)
    private String nombre;
    @Column(nullable=false)
    private String tipo;
    @Column(nullable=false)
    private String material;
    
    public Instrumento() {
    }

    public Instrumento(Long idInstrumento, String nombre, String tipo, String material) {
        this.idInstrumento = idInstrumento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
    }

    
}
