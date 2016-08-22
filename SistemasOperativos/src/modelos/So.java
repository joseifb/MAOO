package modelos;

import enumeraciones.ELicencia;

public class So {
	
	private String nombre;
	private String version;	
	private String arquitectura;
	private ELicencia licencia;
	private String desarrollador;
	private String usuarioFinal;
	
	
	public So (){
		
		this.licencia = ELicencia.PROPETIARIO;

	}

}
