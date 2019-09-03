package com.ejemplo.entities;

public abstract class Coche {
	protected Integer caballos;
	protected Integer puertas;
	protected String traccion;

	// Encapsulate
	protected abstract void pitar();

	public abstract void movimiento();

	public Coche() {

	}

	public Coche(Integer caballos, Integer puertas, String traccion) {
		super();
		this.caballos = caballos;
		this.puertas = puertas;
		this.traccion = traccion;
	}

	public Integer getCaballos() {
		return caballos;
	}

	public void setCaballos(Integer caballos) {
		this.caballos = caballos;
	}

	public Integer getPuertas() {
		return puertas;
	}

	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

}
