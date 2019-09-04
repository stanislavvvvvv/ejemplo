package com.ejemplo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public @Data abstract class Coche {
	protected Integer caballos;
	protected Integer puertas;
	protected String traccion;
	
	// Encapsulate
	protected abstract void pitar();

	public abstract void movimiento();

}
