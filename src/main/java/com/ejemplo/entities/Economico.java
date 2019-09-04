package com.ejemplo.entities;


public class Economico extends Coche{

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
