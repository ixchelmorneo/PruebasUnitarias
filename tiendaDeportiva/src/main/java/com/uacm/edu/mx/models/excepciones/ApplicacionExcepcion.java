package com.uacm.edu.mx.models.excepciones;

public class ApplicacionExcepcion extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private int codigoError;
		

		public  ApplicacionExcepcion(int codigoError, String mensaje) {
			super(mensaje);
			this.codigoError = codigoError;
		}
	
//	public  ApplicacionExcepcion(String mensaje) {
	//	super(mensaje);
		
//	}



	
		public int getCodigoError() {
			return codigoError;
		}


	
		public void setCodigoError(int codigoError) {
			this.codigoError = codigoError;
		}

	

}
