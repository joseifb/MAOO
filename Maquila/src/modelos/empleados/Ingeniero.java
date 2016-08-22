package modelos.empleados;

import interfaces.ILabores;
import modelos.Empleado;

public abstract class Ingeniero extends Empleado implements ILabores {
	
	private Float compensacion;
	private String vehiculoAsignado;
	
	@Override
    public String produccion() {
        return "Desarrolla Software";
	}
	
	@Override
	public String probar() {
		return "Prueba su software desarrollado";
	}
	
	@Override
	public String supervisar() {
		return "Supervisa a ciertos empleados a cargo en su departamento";
	}

	public Float getCompensacion() {
		return compensacion;
	}

	public void setCompensacion(Float compensacion) {
		this.compensacion = compensacion;
	}

	public String getVehiculoAsignado() {
		return vehiculoAsignado;
	}

	public void setVehiculoAsignado(String vehiculoAsignado) {
		this.vehiculoAsignado = vehiculoAsignado;
	}


}
