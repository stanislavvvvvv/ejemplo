package com.ejemplo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import com.ejemplo.entities.Bocina;
import com.ejemplo.entities.Coche;
import com.ejemplo.entities.Economico;
import com.ejemplo.entities.Todoterreno;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testLista() {
        ArrayList<Coche> coches2 = new ArrayList<Coche>();
        ArrayList<Coche> coches = new ArrayList<Coche>();
        Coche coche = cocheNuevo();
        Coche coch2e = cocheNuevoDos();
        Coche coch3e = cocheNuevo();
        Coche coch4e = cocheNuevoDos();

        coches.add(coche);
        coches.add(coch2e);
        coches2.add(coch4e);
        coches2.add(coch3e);

        //assertThat(coches).isEqualTo(coches2);
        assertThat(coches).usingRecursiveFieldByFieldElementComparator().containsAll(coches2);
    }

    public void testCoche() {
        Coche coche = cocheNuevo();

        assertTrue(coche instanceof Coche);
    }

    public void testCochesIguales() {
        Coche coche = cocheNuevo();
        Coche coche2 = cocheNuevo();
        //assertThat(coche).isEqualTo(coche2);
        assertThat(coche).isEqualToComparingFieldByField(coche2);
    }

    private static Coche cocheNuevo() {
        Coche coche = new Economico();
        coche.setCaballos(150);
        coche.setPuertas(3);
        coche.setTraccion("delantera");

        return coche;
    }

    private static Coche cocheNuevoDos() {
        Coche coche = new Todoterreno();
        coche.setCaballos(150);
        coche.setPuertas(3);
        coche.setTraccion("cuatroxcuatro");
        return coche;
    }

    public void testBocina() {
        Coche coche = cocheNuevo();
        Bocina bocina = mock(Bocina.class);
        coche.setBocina(bocina);
        coche.pitar();
        coche.pitar();
        coche.pitar();
        coche.pitar();
        verify(bocina, times(4)).pitar();
    }

}
