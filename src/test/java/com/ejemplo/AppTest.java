package com.ejemplo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

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
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    //comparar dos coche con los mismo parametros assertj
    //lista de coche a ver si son iguales assertj
    public void testLista() {
    	ArrayList<Coche> coches2 = new ArrayList<Coche>();
    	ArrayList<Coche> coches = new ArrayList<Coche>();
    	Coche coche = new Economico();
    	coche.setCaballos(150);
    	coche.setPuertas(3);
    	coche.setTraccion("delantera");
    	Coche coch2e = new Todoterreno();
    	coch2e.setCaballos(150);
    	coch2e.setPuertas(3);
    	coch2e.setTraccion("cuatroxcuatro");
    	Coche coch3e = new Todoterreno();
    	coch3e.setCaballos(150);
    	coch3e.setPuertas(3);
    	coch3e.setTraccion("cuatroxcuatro");
    	Coche coch4e = new Todoterreno();
    	coch4e.setCaballos(150);
    	coch4e.setPuertas(3);
    	coch4e.setTraccion("cuatroxcuatro");
    	
    	coches.add(coche);
    	coches.add(coch2e);
    	coches2.add(coch3e);
    	coches2.add(coch4e);
    	//assertThat(coches).isEqualTo(coches2);
    	assertThat(coches).usingRecursiveFieldByFieldElementComparator().containsAll(coches2);
    }
    
    
    public void testCoche() {
    	Coche coche = new Economico();
    	coche.setCaballos(150);
    	coche.setPuertas(3);
    	coche.setTraccion("delantera");
    	
    	assertTrue(coche instanceof Coche);
    }
    public void testCochesIguales() {
    	Coche coche = new Economico();
    	coche.setCaballos(150);
    	coche.setPuertas(3);
    	coche.setTraccion("delantera");
    	Coche coche2 = new Economico();
    	coche2.setCaballos(150);
    	coche2.setPuertas(3);
    	coche2.setTraccion("delantera");
    	System.out.println(coche.equals(coche2));
    	//assertThat(coche).isEqualTo(coche2);
    	assertThat(coche).isEqualToComparingFieldByField(coche2);
    }
}
