package modelos.miembros;

import interfaces.IResponsabilidades;
import modelos.Miembro;

public abstract class Piloto extends Miembro implements IResponsabilidades {
	
	  @Override
	    public String comunicacionConPasajeros() {
	        return "Mediante la intercomunicacion de la aeronave directa y tecnica acerca del vuelo";
	    }

	    @Override
	    public String operarVuelo() {
	        return "Opera el transito de la aironave y tecnicamnte";
	    }

	    @Override
	    public String tranquilzar() {
	        return "En caso de emergencia llevar control de los miembros de la tripulacion para llevar control con los demas";
	    }

}
