package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sedan extends Coche {
    public Sedan(){};
    @JsonCreator
    public Sedan(@JsonProperty("caballos") int caballos, @JsonProperty("puertas") int puertas,
            @JsonProperty("traccion") String traccion) {
        super(caballos, puertas, traccion, null);
    }

    @Override
    public void movimiento() {
        System.out.println("Coche sedan en movimiento");
    }
}
