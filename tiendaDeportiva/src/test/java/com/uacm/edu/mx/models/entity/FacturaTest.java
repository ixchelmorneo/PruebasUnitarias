package com.uacm.edu.mx.models.entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FacturaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	/***************** Iva *****************/
	@Test
	public void testSetIvaInvalida() {
		Factura fac = new Factura(-115);
		assertFalse(fac.setIva(-115));

	}

	@Test
	public void testSetIvaValido(){
		Factura fac = new Factura(99);
		assertTrue(fac.setIva(99));

	}
	
}
