package com.ejemplo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
public abstract class Coche {
	protected @Getter @Setter Integer caballos;
	protected @Getter @Setter Integer puertas;
	protected @Getter @Setter String traccion;
	
	// Encapsulate
	protected abstract void pitar();

	public abstract void movimiento();

}
