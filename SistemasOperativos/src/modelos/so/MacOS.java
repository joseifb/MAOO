package modelos.so;

import interfaces.ISoporte;
import modelos.So;

public class MacOS extends So implements ISoporte {


	
	 @Override
	    public String asistenciaSoporte() {
	        return "Todas las Versiones";
	    }
	 
	 @Override
	    public String actualizaciones() {
	        return "Desde OSX";
	    }


}
