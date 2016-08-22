package modelos.so;

import interfaces.ISoporte;
import modelos.So;

public class Windows extends So implements ISoporte {
	
	private String nucleo;

	 @Override
	    public String asistenciaSoporte() {
	        return "Todas las Versiones";
	    }
	 
	 @Override
	    public String actualizaciones() {
	        return "Todas despues de XP";
	    }

}
