package com.odraudek99.junit.negocio;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odraudek99.junit.dao.PersonaDao;
import com.odraudek99.junit.modelo.Persona;

@Service
public class PersonaNegocio {
	
	@Autowired
	PersonaDao personaDao;
	

	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Método @PostConstruct " );
	}

	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Método @PreDestroy");
	}

	public Persona obetnerPersona(Integer id) {
		System.out.println("obetnerPersona");
		return personaDao.obetnerPersona(id);
	}
	
	public List<Persona> obtenerTodos() {
		System.out.println("obtenerTodos");
		return personaDao.obtenerTodos();
	}
}

