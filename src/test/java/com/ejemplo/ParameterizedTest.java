package com.ejemplo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ejemplo.entities.Coche;
import com.ejemplo.entities.Economico;

import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(value = Parameterized.class)
public class ParameterizedTest {

    //default value = 0
    @Parameter(value = 0)
    public Coche coche1;

    @Parameter(value = 1)
    public Coche coche2;

    @Parameters(name = "{index}: {0} = {1}")
    public static Collection<Object[]> data() {
        Coche coche1 = cocheNuevo();
        Coche coche2 = cocheNuevo();
        Coche coche3 = cocheNuevo();
        Coche coche4 = cocheNuevo();
        return Arrays.asList(new Object[][] {
                { coche1, coche2 },
                { coche3, coche4 }
        });
    }

    @Test
    public void cochesIgualesTest() {
        assertThat(coche1).isEqualToComparingFieldByField(coche2);

    }

    private static Coche cocheNuevo() {
        Coche coche = new Economico();
        coche.setCaballos(150);
        coche.setPuertas(3);
        coche.setTraccion("delantera");
        return coche;
    }

}