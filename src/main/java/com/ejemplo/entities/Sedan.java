package com.ejemplo.entities;

public class Sedan extends Coche {

	public Sedan() {
		// TODO Auto-generated constructor stub
	}
	public Sedan(Integer caballos, Integer puertas, String traccion) {
		super(caballos, puertas, traccion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void movimiento() {
		System.out.println("Coche sedan en movimiento");
		pitar();
	}
	@Override
	protected void pitar() {
		System.out.println("HONKHONKHONK");
	}

}
