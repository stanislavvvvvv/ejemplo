package com.ejemplo;

import java.util.ArrayList;
import java.util.Arrays;

import com.ejemplo.entities.Coche;
import com.ejemplo.entities.Economico;
import com.ejemplo.entities.Sedan;
import com.ejemplo.entities.Todoterreno;

/**
 * algo
 *
 */
public class App 
{
		static ArrayList<Coche> coches = new ArrayList<Coche>();
		
    public static void main( String[] args )
    {
    	Coche mini = new Economico();
    	Coche suv = new Todoterreno();
    	Coche largo = new Sedan();
    	mini.setCaballos(90);
    	mini.setPuertas(3);
    	mini.setTraccion("delantera");
    	
    	suv.setCaballos(190);
    	suv.setPuertas(5);
    	suv.setTraccion("cuatros por cuatro");
    	
    	largo.setCaballos(130);
    	largo.setPuertas(5);
    	largo.setTraccion("delantera");
    	
    	
    	coches.addAll(Arrays.asList(mini,suv,largo));
    	coches.for
    }
}
