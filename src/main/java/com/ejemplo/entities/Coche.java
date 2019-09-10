package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, //field must be present in the POJO
        property = "nombre")
public abstract class Coche {

    @JsonProperty
    protected String nombre = this.getClass().getSimpleName();
    @JsonProperty
    protected Integer caballos;
    @JsonProperty
    protected Integer puertas;
    @JsonProperty
    protected String traccion;
    @JsonProperty
    protected Bocina bocina;

    public String pitar(String msg) throws MiExcepcion {
        bocina.pitar();
        if (msg == "error") {
            throw new MiExcepcion("PITA DESDE LA EXCEPCION");
        }
        return "pip";

    }

    public void cuantoSonido() {
        int sonido;
        sonido = bocina.devuelveSonido();
    }

    protected abstract void movimiento();

    public static class MiExcepcion extends Exception {
        public MiExcepcion(String mierror) {
            super(mierror);
        }
    }
}
