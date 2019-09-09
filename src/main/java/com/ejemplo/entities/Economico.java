package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Economico extends Coche {
    public Economico(){}
    @JsonCreator
    public Economico(@JsonProperty("caballos") int caballos, @JsonProperty("puertas") int puertas,
            @JsonProperty("traccion") String traccion) {
        super(caballos, puertas, traccion, null);
    }
    @Override
    public void movimiento() {
        System.out.println("Coche economico en movimiento");
    }
}
