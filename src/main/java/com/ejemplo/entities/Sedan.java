package com.ejemplo.entities;

public class Sedan extends Coche {
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
