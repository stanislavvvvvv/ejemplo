package com.ejemplo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class Bocina {
    private String sonido;

    public String pitar() {
        return "aaaaaaaaaaAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAA";
    }
    public String sonido(){
        return sonido;
    }
}
