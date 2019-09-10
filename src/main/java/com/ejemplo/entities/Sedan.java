package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sedan extends Coche {
    @Override
    public void movimiento() {
        System.out.println("Coche sedan en movimiento");
    }
}
