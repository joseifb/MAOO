package modelos.so;

import interfaces.ISoporte;
import modelos.So;

public abstract class GNULinux extends So implements ISoporte {
	
	private String distro;
	private String kernel;

	 @Override
	    public String asistenciaSoporte() {
	        return "Solo Red Hat o Ubuntu ORG";
	    }

}
