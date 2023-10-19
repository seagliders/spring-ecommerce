package com.curso.ecommerce.model;

import java.util.Date;

public class Orden {

	private int ID;
	private String numero;
	private Date fechaCreacion;
	private Date fecharecibida;
	
	
	private double total;
	
	public Orden() {}

	public Orden(int iD, String numero, Date fechaCreacion, Date fecharecibida, double total) {
		super();
		ID = iD;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fecharecibida = fecharecibida;
		this.total = total;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFecharecibida() {
		return fecharecibida;
	}

	public void setFecharecibida(Date fecharecibida) {
		this.fecharecibida = fecharecibida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [ID=" + ID + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fecharecibida="
				+ fecharecibida + ", total=" + total + "]";
	}
	
	
	
	
	
}
