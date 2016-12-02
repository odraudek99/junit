package com.odraudek99.junit.web;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import com.odraudek99.junit.modelo.Persona;
import com.odraudek99.junit.negocio.PersonaNegocio;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test-negocio.xml")
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional
public class TestPersonaController {


//    @Autowired
//    PersonaNegocio personaNegocio;
//    
//
//    
//    
//    @Test
//    public void obtenerPersonaId() {
//		Persona persona = personaNegocio.obetnerPersona(1);
//		Assert.assertNotNull(persona);
//	}
//    
//    @Test
//    public void obtenerPersonas() {
//		List<Persona> personas = personaNegocio.obtenerTodos();
//		Assert.assertNotNull(personas);
//		Assert.assertFalse(CollectionUtils.isEmpty(personas));
//	}

    
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

