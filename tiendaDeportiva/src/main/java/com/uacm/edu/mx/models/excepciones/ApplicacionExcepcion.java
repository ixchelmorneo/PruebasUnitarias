package com.uacm.edu.mx.models.excepciones;

public class ApplicacionExcepcion extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private int codigoError;
		

		public  ApplicacionExcepcion(int codigoError, String mensaje) {
			super(mensaje);
			this.codigoError = codigoError;
		}


		/**
		 * @return the codigoError
		 */
		public int getCodigoError() {
			return codigoError;
		}


		/**
		 * @param codigoError the codigoError to set
		 */
		public void setCodigoError(int codigoError) {
			this.codigoError = codigoError;
		}

	

}
