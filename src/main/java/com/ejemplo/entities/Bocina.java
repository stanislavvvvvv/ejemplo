package com.ejemplo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class Bocina {

    public void pitar() {
        System.out.println("aaaaaaaaaaAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAA");
    }
    public int devuelveSonido() {
    	return 20;
    }
}
