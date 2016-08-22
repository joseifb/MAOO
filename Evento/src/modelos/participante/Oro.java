package modelos.participante;

import interfaces.IPrivilegios;
import modelos.Participante;

public abstract class Oro extends Participante implements IPrivilegios {
	
	@Override
	public String acceso(){
		return "ENTRADA 1";
		
	}
	
	@Override
	public String comida(){
		return "Completo";		
		
	}
	
	@Override
	public Boolean tshirt(){
		
		return true;
	}
	
	@Override
	public String codigoUber(){
		
		return "UB3R564";
	}
	
	@Override
	public Boolean certificado(){
		
		return true;
		
	}

}
