package com.ejemplo.entities;

public class Todoterreno extends Coche{

	public Todoterreno() {
		// TODO Auto-generated constructor stub
	}
	public Todoterreno(Integer caballos, Integer puertas, String traccion) {
		super(caballos, puertas, traccion);
		// TODO Auto-generated constructor stub
	}

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
