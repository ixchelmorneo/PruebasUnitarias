package com.uacm.edu.mx.models.service.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.uacm.edu.mx.TiendaDeportivaApplication;
import com.uacm.edu.mx.models.entity.Producto;
import com.uacm.edu.mx.models.excepciones.ApplicacionExcepcion;
import com.uacm.edu.mx.models.service.IProductoService;
import com.uacm.edu.mx.models.service.coderror.CodigoError;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TiendaDeportivaApplication.class)
public class ProductoServiceImplTest {

	// public static final Logger log = Logger.getLogger(ProductoServiceImpl.class);

	@Autowired
	private IProductoService productoService;

	@SuppressWarnings("deprecation")
	@Test
	public void testGuardarProducto() throws ApplicacionExcepcion {

		// log.debug("Entro al metodo testGuardarProducto");

		Producto retornaProducto = productoService.create("Nike Jordan", "123456789123", 950, 15, "Tenis nike");
		// Assert.assertNotNull(retornaProducto);
		Assert.assertThat(retornaProducto, is(notNullValue()));

	}
/*
	this.nombre = nombre;
	this.codigo = codigo;
	this.precio = precio;
	this.stock = stock;
	this.detalle = detalle;
	*/
	@Test
	public void testprobarNombre() throws ApplicacionExcepcion {

		// log.debug("Entro al metodo testprobarNombre");
		
				
		CodigoError cod = new CodigoError();
		
		
		Assert.assertThrows(expectedThrowable, runnable)

		

			productoService.create("adi45", "123456789123", 950, 20, "Tenis ");

		
			Assert.assertEquals(, CodigoError.MAL_NOMBRE_PRODUCTO);
		

			productoService.create("adidas", "123456789123", 950, 20, "Tenis ");

		

			Assert.assertEquals(, CodigoError.MAL_NOMBRE_PRODUCTO);
		

	}

	@Test
	public void testprobarCodigo() throws ApplicacionExcepcion {

		// log.debug("Entro al metodo testprobarCodigo()");

		try {

			productoService.create("Nike Jordan ", "1234567891", 950, 20, "Tenis ");

		} catch (ApplicacionExcepcion e) {
			// TODO: handle exception

			Assert.assertEquals(e.getCodigoError(), CodigoError.MAL_CODIDENT);
		}

		try {

			productoService.create("Nike Jordan  ", "12345678912312", 950, 20, "Tenis ");

		} catch (ApplicacionExcepcion e) {
			// TODO: handle exception

			Assert.assertEquals(e.getCodigoError(), CodigoError.MAL_CODIDENT);
		}

		try {

			productoService.create("Nike Jordan  ", "ABCDE1234567", 950, 20, "Tenis ");

		} catch (ApplicacionExcepcion e) {
			// TODO: handle exception

			Assert.assertEquals(e.getCodigoError(), CodigoError.MAL_CODIDENT);
		}

	}

	@Test
	public void testprobarStock() throws ApplicacionExcepcion {

		// log.debug("Entro al metodo testprobarNombre");

		try {

			productoService.create("Nike Jordan ", "123456789123", 1500, 0, "Tenis ");

		} catch (ApplicacionExcepcion e) {
			// TODO: handle exception

			Assert.assertEquals(e.getCodigoError(), CodigoError.ERROR_STOCK);
		}

		try {

			productoService.create("Nike Jordan", "123456789123", 1500, 100, "Tenis ");

		} catch (ApplicacionExcepcion e) {
			// TODO: handle exception

			Assert.assertEquals(e.getCodigoError(), CodigoError.ERROR_STOCK);
		}

	}

	@Test
	public void testprobarPrecio() throws ApplicacionExcepcion {

		// log.debug("Entro al metodo testprobarNombre");

		try {

			productoService.create("Nike Jordan ", "123456789123", 0, 20, "Tenis ");

		} catch (ApplicacionExcepcion e) {
			// TODO: handle exception

			Assert.assertEquals(e.getCodigoError(), CodigoError.ERROR_PRECIO);
		}

		try {

			productoService.create("Nike Jordan", "123456789123", 10000, 20, "Tenis ");

		} catch (ApplicacionExcepcion e) {
			// TODO: handle exception

			Assert.assertEquals(e.getCodigoError(), CodigoError.ERROR_PRECIO);
		}

	}

	@Test
	public void testprobarDetalle() throws ApplicacionExcepcion {

		// log.debug("Entro al metodo testprobarNombre");

		try {

			productoService.create("Nike Jordan ", "123456789123", 1500, 30, " ");

		} catch (ApplicacionExcepcion e) {
			// TODO: handle exception

			Assert.assertEquals(e.getCodigoError(), CodigoError.ERROR_DETALLE);
		}

		try {

			productoService.create("Nike Jordan", "123456789123", 1500, 30,
					"Tenis Nije Jordannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
							+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");

		} catch (ApplicacionExcepcion e) {
			// TODO: handle exception

			Assert.assertEquals(e.getCodigoError(), CodigoError.ERROR_DETALLE);
		}

	}

}
