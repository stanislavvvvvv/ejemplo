package com.ejemplo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Coche {
    protected Integer caballos;
    protected Integer puertas;
    protected String traccion;
    protected Bocina bocina;

    // Encapsulate
    public void pitar() {
        bocina.pitar();
    }

    protected abstract void movimiento();
}
