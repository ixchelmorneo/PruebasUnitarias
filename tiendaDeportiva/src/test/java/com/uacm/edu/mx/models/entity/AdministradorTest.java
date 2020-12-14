package com.uacm.edu.mx.models.entity;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.uacm.edu.mx.models.excepciones.ApplicacionExcepcion;
import com.uacm.edu.mx.models.service.coderror.CodigoError;

public class AdministradorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
/****Cosntructor***/	
	
	
	
	/******** Nombre **********/

	@Test
	public void testSetNombreValido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","colonia del mar","ixchel@uacm.com","myp4ssw0rd");
		assertEquals("ixchel", adm.getNombre());
	}
	
	@Test
	public void testSetNombreInvalido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador();

		try {
			adm.setNombre("1xchel");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.MAL_NOMBRE_ADMINISTRADOR);

		}

	}
	
	
	/******** Roll **********/

	@Test
	public void testSetRollValido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","colonia del mar","ixchel@uacm.com","myp4ssw0rd");
		assertEquals("Administrador", adm.getRoll());
	}

	@Test
	public void testSetRollInvalido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador();

		try {
			adm.setRoll("Adm1n1stra0r");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.ERROR_APELLIDO_PATERNO_ADMINISTRADOR);

		}

	}
	
	/******** Apellido Paterno **********/
	
	@Test
	public void testSetApellidoPValido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","colonia del mar","ixchel@uacm.com","myp4ssw0rd");
		assertEquals("Moreno", adm.getApellidoP());
	}
	
	@Test
	public void testSetApellidoPInvalido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador();

		try {
			adm.setApellidoP("M0ren0");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.ERROR_APELLIDO_PATERNO_ADMINISTRADOR);

		}

	}
	
/******** Apellido Materno **********/
	
	@Test
	public void testSetMaternoPValido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","colonia del mar","ixchel@uacm.com","myp4ssw0rd");
		assertEquals("Navarrete", adm.getApellidoM());
	}
	
	@Test
	public void testSetMaternoPInvalido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador();

		try {
			adm.setApellidoM("Navarret3");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.ERROR_APELLIDO_MATERNO_ADMINISTRADOR);

		}

	}
	
	/***************** Edad *****************/
	@Test
	public void testSetEdadInvalida() throws ApplicacionExcepcion {
		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","colonia del mar","ixchel@uacm.com","myp4ssw0rd");
		assertTrue(adm.setEdad(0));

	}

	@Test
	public void testSetEdadValido() throws ApplicacionExcepcion {
		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","colonia del mar","ixchel@uacm.com","myp4ssw0rd");
		assertFalse(adm.setEdad(85));

	}

/******** Telefono **********/
	
	@Test
	public void testSetTelefonoValido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","colonia del mar","ixchel@uacm.com","myp4ssw0rd");
		assertEquals("55-58-40-75-10", adm.getTelefono());
	}
	
	@Test
	public void testSetTelefonoInvalido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador();

		try {
			adm.setTelefono("55-84-22-58-10-89");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.ERROR_TELEFONO_ADMINISTRADOR);

		}

	}
	
	/******** Direcion **********/

	@Test
	public void testSetDirecionValido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","#1, Colonia Portillo, Calle - 11","ixchel@uacm.com","myp4ssw0rd");
		assertEquals("#1, Colonia Portillo, Calle - 11", adm.getDireccion());
	}

	@Test
	public void testSetDirecionInvalido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador();

		try {
			 adm.setDireccion("");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.ERROR_DIRECION_ADMINISTRADOR);

		}

	}
	
	/******** Email **********/

	@Test
	public void testSetEmailValido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","#1, Colonia Portillo, Calle - 11","ixchel@uacm.com","myp4ssw0rd");
		assertEquals("ixchel@uacm.com", adm.getEmail());
	}

	@Test
	public void testSetEmailInvalido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador();

		try {
			 adm.setEmail("ixchel@uacm.com.mx.45");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.ERROR_CORREO_ADMINISTRADOR);

		}

	}
	

	/******** Pasword **********/

	@Test
	public void testSetPaswordValido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador("ixchel","Administrador","Moreno","Navarrete",26,"55-58-40-75-10","#1, Colonia Portillo, Calle - 11","ixchel@uacm.com","myp4ssw0rd");
		assertEquals("myp4ssw0rd", adm.getPassword());
	}

	@Test
	public void testSetPaswordInvalido() throws ApplicacionExcepcion {

		Administrador adm = new Administrador();

		try {
			 adm.setPassword("Mypa$ $w0rd");

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.ERROR_CORREO_ADMINISTRADOR);

		}

	}

	
	
	
	

}
