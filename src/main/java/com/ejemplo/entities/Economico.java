package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Economico extends Coche {
    @Override
    public void movimiento() {
        System.out.println("Coche economico en movimiento");
    }
}
