package com.curso.ecommerce.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordenes")
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String numero;
	private Date fechaCreacion;
	private Date fecharecibida;
	
	
	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalle;
	
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
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public DetalleOrden getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleOrden detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Orden [ID=" + ID + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fecharecibida="
				+ fecharecibida + ", total=" + total + "]";
	}
	
	
	
	
	
}
