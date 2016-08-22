package modelos.vehiculos;

import enumeraciones.ECombustible;
import enumeraciones.EDepartamentos;
import modelos.Carga;

public class TresCuartos extends Carga {
	
	private String marca;
	private Integer modelo;
	private String linea;
	private Float rendimiento;
	private Float capacidad;
	private Float peso;
	private Float altura;
	private ECombustible combustible;
	private EDepartamentos departamento;
	
	
	public TresCuartos(){

		this.combustible = ECombustible.GASOLINA;
		this.departamento = EDepartamentos.GERENCIA;
	}

}
