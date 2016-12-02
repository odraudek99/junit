package com.odraudek99.junit.modelo;

import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable {

	private static final long serialVersionUID = 283986490303488992L;
	
	private Integer id;
	private String nombre;
	private Date fecha;
	private String apellido;
	
	public Persona(){}
	


	public Persona(Integer id, String nombre, Date fecha, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.apellido = apellido;
	}



	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", apellido=" + apellido + "]";
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	
}
