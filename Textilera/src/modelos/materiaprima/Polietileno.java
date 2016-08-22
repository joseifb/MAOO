package modelos.materiaprima;

import interfaces.IInflamabilidad;
import modelos.MateriaPrima;

public abstract class Polietileno extends MateriaPrima implements IInflamabilidad {
	
	
		public Integer numeroFibras;
		public String nombreComercial;
	
	
	   @Override
	    public Integer nivel() {
	        return 10;
	    }

	    @Override
	    public String gasExtintor() {
	        return "Novec";
	    }


}
