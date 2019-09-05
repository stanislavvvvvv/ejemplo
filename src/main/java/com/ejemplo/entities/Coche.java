package com.ejemplo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
public abstract class Coche {
	protected Integer caballos;
	protected Integer puertas;
	protected String traccion;
	
	// Encapsulate
	protected abstract void pitar();

	public abstract void movimiento();

}
