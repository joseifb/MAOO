package modelos.materiaprima;

import interfaces.IInflamabilidad;
import modelos.MateriaPrima;

public abstract class Algodon extends MateriaPrima implements IInflamabilidad {
	
	public Float volumen;
	public Integer humedad;
	
	
	   @Override
	    public Integer nivel() {
	        return 7;
	    }

	    @Override
	    public String gasExtintor() {
	        return "CO2";
	    }


}
