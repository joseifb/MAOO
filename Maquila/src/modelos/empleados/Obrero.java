package modelos.empleados;

import interfaces.ILabores;
import modelos.Empleado;

public abstract class Obrero extends Empleado implements ILabores {
	
	private Integer afiliacionSindicato;
	
	@Override
    public String produccion() {
        return "Conecta Arneses";
	}
	@Override
	public String probar() {
		return "Prueba conexiones de arneses finales";
	}
	public Integer getAfiliacionSindicato() {
		return afiliacionSindicato;
	}
	public void setAfiliacionSindicato(Integer afiliacionSindicato) {
		this.afiliacionSindicato = afiliacionSindicato;
	}
	

}
