package modelos;

import java.sql.Date;

import enumeraciones.EEstadoCivil;
import enumeraciones.EGenero;

public class Empleado {

	
	private String nombre;	
	private String primerApellido;
	private Integer seguroSocial;
	private String segundoApellido;
	private Date fechaNacimiento;
	private Integer edad;
	private String numeroTelefono;
	private EGenero genero;
	private String direccion;
	private Float peso;
	private Float altura;
	private EEstadoCivil estadoCivil;
	private String departamento;
	private String nacionalidad;
	
	
	public Empleado (){
		
		this.genero = EGenero.MASCULINO;
		this.estadoCivil = EEstadoCivil.CASADO;
	}
}



