package com.ejemplo.entities;

public class Todoterreno extends Coche{


	@Override
	public void movimiento() {
		System.out.println("Coche todoterreno en movimiento");
		pitar();
	}
	@Override
	protected void pitar() {
		System.out.println("HONKHONKHONK");
	}

}
