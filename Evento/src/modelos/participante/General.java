package modelos.participante;

import interfaces.IPrivilegios;
import modelos.Participante;

public abstract class General extends Participante implements IPrivilegios{
	
	@Override
	public String acceso(){
		return "ENTRADA 2";
		
	}
	
	@Override
	public String comida(){
		return "Almuerzo";		
		
	}
	
	@Override
	public Boolean tshirt(){
		
		return false;
	}
	
	@Override
	public String codigoUber(){
		
		return "UB3R123";
	}
	
	@Override
	public Boolean certificado(){
		
		return true;
		
	}

}
