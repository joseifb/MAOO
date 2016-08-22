package modelos;

import java.util.Date;

import enumeraciones.EDestino;



public class MateriaPrima {
	
		
		private String nombre;	
		private String nombrecomercial;
		private String origen;
		private String lote;
		private EDestino destino;
		private Date llegada;
		private Date salida;
		private Float ancho;
		private Float pieza;
		private Float peso;
		
		
		public MateriaPrima(){
			
			this.destino = EDestino.PLANTAQUIRURGICO;
		}
	
		
}



