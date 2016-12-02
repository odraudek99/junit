package com.odraudek99.junit.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.odraudek99.junit.modelo.Persona;

@Repository
public class PersonaDao {

	static Map<Integer, Persona> map = new HashMap<Integer, Persona>();
	
	static {
		map.put(1, new Persona(1, "Eduardo", new Date(), "lalo"));
		map.put(2, new Persona(2, "Jaquelie", new Date(), "jaqui"));
		map.put(3, new Persona(3, "Elizabeth", new Date(), "eli"));
		map.put(4, new Persona(4, "Rocio", new Date(), "ro"));
		map.put(5, new Persona(5, "Hake", new Date(), "hk"));
	}
	
	public Persona obetnerPersona(Integer id) {
		return map.get(id);
	}
	
	public List<Persona> obtenerTodos() {
		return new ArrayList<Persona>(map.values());
	}
	
	
	
}
