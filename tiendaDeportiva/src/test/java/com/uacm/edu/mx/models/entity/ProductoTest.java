package com.uacm.edu.mx.models.entity;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.uacm.edu.mx.models.excepciones.ApplicacionExcepcion;
import com.uacm.edu.mx.models.service.coderror.CodigoError;

public class ProductoTest {

	/******** Constructor **********/
	/*
	 * @Test public void testConstrcutorInvalidaProducto() { // como pruebo el
	 * contructor?
	 * 
	 * assertThrows(ApplicacionExcepcion.class, () -> { Producto p = new
	 * Producto("Adidas", "1", 950, 15, "Tenis"); }); }
	 */

	/******** Nombre **********/

	@Test
	public void testSetNombreValido() throws ApplicacionExcepcion {

		Producto p = new Producto("Adidas", "1", 950, 15, "Tenis nike");
		assertEquals("Adidas", p.getNombre());
	}

	@Test
	public void testSetNombreInvalido() throws ApplicacionExcepcion {

		Producto p = new Producto();

		try {
			p.setNombre("id1");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.MAL_NOMBRE_PRODUCTO);

		}

	}

	/***************** Precio *****************/
	@Test
	public void testSetPrecioInvalida() throws ApplicacionExcepcion {
		Producto p = new Producto("Nike Jordan", "123456789123", 950, 15, "Tenis nike");
		assertFalse(p.setPrecio(0));

	}

	@Test
	public void testSetPrecioValido() throws ApplicacionExcepcion {
		Producto p = new Producto("Nike Jordan", "123456789123", 950, 15, "Tenis nike");
		assertTrue(p.setPrecio(99));

	}

	/********************** Codigo *************/

	@Test
	public void testSetCodigoValido() throws ApplicacionExcepcion {

		Producto p = new Producto("Adidas", "1", 950, 15, "Tenis nike");
		assertEquals("Adidas", p.getNombre());
	}

	@Test
	public void testSetCodigoInvalido() throws ApplicacionExcepcion {

		Producto p = new Producto();

		try {
			p.setCodigo("AAAO");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.MAL_CODIDENT);

		}

	}

	/***************** Stock *****************/
	@Test
	public void testSetStockInvalida() throws ApplicacionExcepcion {
		Producto p = new Producto("Nike Jordan", "123456789123", 950, 15, "Tenis nike");
		assertFalse(p.setStock(3));

	}

	@Test
	public void testSetStockValido() throws ApplicacionExcepcion {
		Producto p = new Producto("Nike Jordan", "123456789123", 950, 15, "Tenis nike");
		assertTrue(p.setStock(99));

	}

	/******** Detalle **********/

	@Test
	public void testSetDetalleValido() throws ApplicacionExcepcion {

		Producto p = new Producto("Adidas", "1", 950, 15, "Tenis nike");
		assertEquals("Tenis nike", p.getDetalle());
	}

	@Test
	public void testSetDetalleInvalido() throws ApplicacionExcepcion {

		Producto p = new Producto();

		try {
			p.setDetalle("");// contine un rango de 3 y esta usando numeros en una cadena

		} catch (ApplicacionExcepcion e) {

			Assert.assertEquals(e.getMessage(), CodigoError.ERROR_DETALLE);

		}

	}

}
