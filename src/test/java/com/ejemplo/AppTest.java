package com.ejemplo;

import com.ejemplo.entities.Coche;
import com.ejemplo.entities.Economico;

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
    public void testCoche() {
    	Coche coche = new Economico();
    	coche.setCaballos(150);
    	coche.setPuertas(3);
    	coche.setTraccion("delantera");
    	
    	assertTrue(coche instanceof Coche);
    }
}
