package com.odraudek99.junit.web;

import java.util.List;

import com.odraudek99.junit.modelo.Persona;
import com.odraudek99.junit.negocio.PersonaNegocio;

public class PersonaController {

	private Persona persona;
	private List<Persona> personas;
	
	PersonaNegocio personaNegocio;
	
	public void init() {
		
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	
	
	
	
}
