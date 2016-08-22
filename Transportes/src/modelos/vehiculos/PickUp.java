package modelos.vehiculos;

import enumeraciones.ECombustible;
import enumeraciones.EDepartamentos;
import modelos.Operacion;

public class PickUp extends Operacion {
	
	private String marca;
	private Integer modelo;
	private String linea;
	private Float rendimiento;
	private Float peso;
	private ECombustible combustible;
	private EDepartamentos departamento;
	



public PickUp(){

this.departamento = EDepartamentos.INGENIERIA;
this.combustible = ECombustible.GASOLINA;
}

}
