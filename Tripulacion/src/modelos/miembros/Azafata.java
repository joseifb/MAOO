package modelos.miembros;

import interfaces.IResponsabilidades;
import modelos.Miembro;

public abstract class Azafata extends Miembro implements IResponsabilidades {
	
	   @Override
	    public String comunicacionConPasajeros() {
	        return "Personal con amabilidad y sutil";
	    }

	    @Override
	    public String operarVuelo() {
	        return "Opera administrativamente el vuelo de pasajeros";
	    }

	    @Override
	    public String tranquilzar() {
	        return "En caso de emergencia llevar control de las emociones en cabina de pasajeros";
	    }

}
