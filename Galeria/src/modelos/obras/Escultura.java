package modelos.obras;

import interfaces.ISeguro;
import modelos.Obras;

public abstract class Escultura extends Obras implements ISeguro{
		
	private String material;
	private String herramientaUsada;

	 @Override
	    public Boolean contraDanoFisico() {
	        return true;
	    }
	

}