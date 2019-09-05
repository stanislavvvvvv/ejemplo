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
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {

    //default value = 0
    @Parameter(value = 0)
    public Coche coche1;

    @Parameter(value = 1)
    public Coche coche2;

    @Parameters(name = "{index}: {0} = {1}")
    public static Collection<Object[]> data() {
    	Coche cochet = new Economico();
    	cochet.setCaballos(150);
    	cochet.setPuertas(3);
    	cochet.setTraccion("delantera");
    	Coche cochet2 = new Economico();
    	cochet2.setCaballos(150);
    	cochet2.setPuertas(3);
    	cochet2.setTraccion("delantera");
    	
    	Coche cochett = new Economico();
    	cochett.setCaballos(150);
    	cochett.setPuertas(3);
    	cochett.setTraccion("delantera");
    	Coche cochett2 = new Economico();
    	cochett2.setCaballos(150);
    	cochett2.setPuertas(3);
    	cochett2.setTraccion("delantera");
        return Arrays.asList(new Object[][]{
                {cochet, cochet2},
                {cochett, cochett2}
        });
    }

    @Test
    public void test_addTwoNumbes() {
    	assertThat(coche1).isEqualToComparingFieldByField(coche2);
        
    }

}