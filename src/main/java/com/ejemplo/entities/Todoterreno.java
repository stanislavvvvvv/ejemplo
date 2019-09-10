package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Todoterreno extends Coche {
    @Override
    public void movimiento() {
        System.out.println("Coche todoterreno en movimiento");
    }
}
