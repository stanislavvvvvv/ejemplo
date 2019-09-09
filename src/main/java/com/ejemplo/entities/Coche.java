package com.ejemplo.entities;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Economico.class),
        @JsonSubTypes.Type(value = Sedan.class),
        @JsonSubTypes.Type(value = Todoterreno.class),
})
public abstract class Coche {
    protected Integer caballos;
    protected Integer puertas;
    protected String traccion;
    protected Bocina bocina;

    public String pitar(String msg) throws MiExcepcion {
        bocina.pitar();
        if(msg == "error") {
        	throw new MiExcepcion("PITA DESDE LA EXCEPCION");
        }
        return "pip";
        
    }
    public void cuantoSonido() {
    	int sonido;
    	sonido = bocina.devuelveSonido();
    }

    protected abstract void movimiento();

    public class MiExcepcion extends Exception {
        public MiExcepcion(String mierror) {
            super(mierror);
        }
    }
}
