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

    public void pitar(String msg) throws MiExcepcion {
        bocina.pitar();
        if(msg=="error") {
        	throw new MiExcepcion("PITA DESDE LA EXCEPCION");
        }
        
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
