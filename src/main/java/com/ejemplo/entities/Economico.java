package com.ejemplo.entities;

public class Economico extends Coche{

	public Economico() {
		// TODO Auto-generated constructor stub
	}
	public Economico(Integer caballos, Integer puertas, String traccion) {
		super(caballos, puertas, traccion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void movimiento() {
		System.out.println("Coche economico en movimiento");
		pitar();
	}
	@Override
	protected void pitar() {
		System.out.println("HONKHONKHONK");
	}

}
