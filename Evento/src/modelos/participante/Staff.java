package modelos.participante;

import interfaces.IPrivilegios;
import modelos.Participante;

public abstract class Staff extends Participante implements IPrivilegios {
	
	@Override
	public String acceso(){
		return "TODAS";
		
	}
	
	@Override
	public String comida(){
		return "Completo";		
		
	}
	
	@Override
	public Boolean tshirt(){
		
		return true;
	}
	

}
