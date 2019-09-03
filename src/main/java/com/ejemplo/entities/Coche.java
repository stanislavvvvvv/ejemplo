package com.ejemplo.entities;

public abstract class Coche {
	protected Integer caballos;
	protected Integer puertas;
	protected String traccion;

	// Encapsulate
	protected abstract void pitar();

	public abstract void movimiento();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caballos == null) ? 0 : caballos.hashCode());
		result = prime * result + ((puertas == null) ? 0 : puertas.hashCode());
		result = prime * result + ((traccion == null) ? 0 : traccion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (caballos == null) {
			if (other.caballos != null)
				return false;
		} else if (!caballos.equals(other.caballos))
			return false;
		if (puertas == null) {
			if (other.puertas != null)
				return false;
		} else if (!puertas.equals(other.puertas))
			return false;
		if (traccion == null) {
			if (other.traccion != null)
				return false;
		} else if (!traccion.equals(other.traccion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coche [caballos=" + caballos + ", puertas=" + puertas + ", traccion=" + traccion + "]";
	}

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
