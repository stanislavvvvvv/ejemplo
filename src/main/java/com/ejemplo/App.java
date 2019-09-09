package com.ejemplo;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

import com.ejemplo.entities.Coche;
import com.ejemplo.entities.Economico;
import com.ejemplo.entities.Sedan;
import com.ejemplo.entities.Todoterreno;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * algo
 *
 */
public class App 
{
		static ArrayList<Coche> coches = new ArrayList<Coche>();
		
    public static void main( String[] args ) throws JsonProcessingException {
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

		ObjectMapper mapper = new ObjectMapper();
		String s  = mapper.writeValueAsString(coches);

		String directory = System.getProperty("user.home");
		String fileName = "coches.bin";
		String absolutePath = directory + File.separator + fileName;

		// write the content in file
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {
			bufferedWriter.write(s);
		} catch (IOException e) {
			// exception handling
		}

		// read the content from file
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {

			String line = bufferedReader.readLine();
			ArrayList cochesList = mapper.readValue(s,ArrayList.class);
			System.out.println(cochesList);
			while(line != null) {
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			// exception handling
		} catch (IOException e) {
			// exception handling
		}

	}
}
