package com.odraudek99.junit.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import com.odraudek99.junit.modelo.Persona;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test-dao.xml")
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional
public class TestPersonaDao {


    @Autowired
    PersonaDao personaDao;
    

    
    
    @Test
    public void obtenerPersonaId() {
		Persona persona = personaDao.obetnerPersona(1);
		Assert.assertNotNull(persona);
	}
    
    @Test
    public void obtenerPersonas() {
		List<Persona> personas = personaDao.obtenerTodos();
		Assert.assertNotNull(personas);
		Assert.assertFalse(CollectionUtils.isEmpty(personas));
	}

    
    
    //@Test
//    public void guardarPersona() {

//        try {
//    		 SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
// 		 fechaInicio =  sf.parse("24/10/2016");
//                 fechaFin = sf.parse("26/10/2016");
//                Integer total = solicitudQRDao.conteoSolicitudes(fechaInicio, fechaFin, rfc, tipoBebida);
//                System.out.println("total: "+total);
//                Assert.assertTrue(3== total);
//        } catch (Exception e) {
//            
//           e.printStackTrace();
//    	   System.out.println("Error al buscar el representante legal del contribuyente "  + fechaInicio+fechaFin+rfc+tipoBebida );
//       }
//    }
     
    


}

