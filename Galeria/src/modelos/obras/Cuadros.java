package modelos.obras;

import interfaces.ISeguro;
import modelos.Obras;

public abstract class Cuadros extends Obras implements ISeguro{
	
	 @Override
	    public Boolean contraRobo() {
	        return true;
	    }

	 @Override
	    public Boolean contraDanoFisico() {
	        return true;
	    }
	

}
