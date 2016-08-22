package modelos.vehiculos;


import enumeraciones.ECombustible;
import modelos.Carga;



public class TractoCamion extends Carga{
	
	private String marca;
	private Integer modelo;
	private String linea;
	private Float rendimiento;
	private Float capacidad;
	private Float peso;
	private Float altura;
	private ECombustible combustible;
	



public TractoCamion(){

this.combustible = ECombustible.DIESEL;
}

}