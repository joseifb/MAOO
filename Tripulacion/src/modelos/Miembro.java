package modelos;

import java.sql.Date;

import enumeraciones.EEstadoCivil;
import enumeraciones.EGenero;
import enumeraciones.ENacionalidad;

public class Miembro {
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaNacimiento;
	private Integer edad;
	private String numeroTelefono;
	private String pasaporte;
	private EGenero genero;
	private String direccion;
	private Float peso;
	private Float altura;
	private EEstadoCivil estadoCivil;
	private ENacionalidad nacionalidad;

public Miembro(){
	
	this.genero = EGenero.MASCULINO;
	this.nacionalidad = ENacionalidad.MEXICANA;
}

}
