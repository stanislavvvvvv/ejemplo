package com.ejemplo;
import org.junit.runner.RunWith;

import com.ejemplo.entities.Coche;
import com.ejemplo.entities.Economico;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class JunitParams {
 
 
    @Test
    @Parameters(method = "parametersToTestAdd")
    public void whenWithNamedMethod_thenSafeAdd(
      Coche a, Coche b, Coche c) {
    	assertThat(a).isEqualToComparingFieldByField(b).isEqualToComparingFieldByField(c);
        
    }
     
    private Object[] parametersToTestAdd() {
    	Coche coche1 = cocheNuevo();
        Coche coche2 = cocheNuevo();
        Coche coche3 = cocheNuevo();
      
        return new Object[] { 
            new Object[] { coche1, coche2, coche3 }
        };
    }

    private static Coche cocheNuevo() {
        Coche coche = new Economico();
        coche.setCaballos(150);
        coche.setPuertas(3);
        coche.setTraccion("delantera");
        return coche;
    }
 
}
