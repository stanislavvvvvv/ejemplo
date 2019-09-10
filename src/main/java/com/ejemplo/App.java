package com.ejemplo;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ejemplo.entities.Coche;
import com.ejemplo.entities.Economico;
import com.ejemplo.entities.Sedan;
import com.ejemplo.entities.Todoterreno;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * algo
 */
public class App {
    static ArrayList<Coche> coches = new ArrayList<Coche>();

    public static void main(String[] args) throws IOException {
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

        coches.addAll(Arrays.asList(mini, suv, largo));

    }
}
