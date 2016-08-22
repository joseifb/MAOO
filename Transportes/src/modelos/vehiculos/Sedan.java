package modelos.vehiculos;

import enumeraciones.ECombustible;
import enumeraciones.EDepartamentos;
import modelos.Operacion;

public class Sedan extends Operacion {
	
	private String marca;
	private Integer modelo;
	private String linea;
	private Float rendimiento;
	private ECombustible combustible;
	private EDepartamentos departamento;
	
	public Sedan(){

		this.departamento = EDepartamentos.CONTABILIDAD;
		this.combustible = ECombustible.HIBRIDO;
		}


}
