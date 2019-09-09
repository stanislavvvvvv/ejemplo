package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Todoterreno extends Coche {
    public Todoterreno(){}
    @JsonCreator
    public Todoterreno(@JsonProperty("caballos") int caballos, @JsonProperty("puertas") int puertas,
            @JsonProperty("traccion") String traccion) {
        super(caballos, puertas, traccion, null);
    }

    @Override
    public void movimiento() {
        System.out.println("Coche todoterreno en movimiento");
    }
}
