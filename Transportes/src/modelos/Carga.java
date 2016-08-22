package modelos;

import enumeraciones.ECiudades;
import enumeraciones.ECombustible;

public class Carga {
	

	private String matricula;
	private String chofer;
	private ECiudades origen;
	private ECiudades destino;
	private Integer orometro;
	
	

public Carga(){
	
	this.origen = ECiudades.JRZ;
	this.destino = ECiudades.MEX;
}

}
