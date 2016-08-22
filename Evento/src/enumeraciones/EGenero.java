package enumeraciones;

public enum EGenero {
    MASCULINO(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE), 
    FEMENINO(Boolean.FALSE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
    
    private Boolean requiereCartilla;
    private Boolean requiereIne;
    private Boolean requiereActaNacimiento;
    private Boolean requiereExamenNoEmbarazo;

    private EGenero(Boolean requiereCartilla, Boolean requiereIne, Boolean requiereActaNacimiento, Boolean requiereExamenNoEmbarazo) {
        this.requiereCartilla = requiereCartilla;
        this.requiereIne = requiereIne;
        this.requiereActaNacimiento = requiereActaNacimiento;
        this.requiereExamenNoEmbarazo = requiereExamenNoEmbarazo;
    }

    /**
     * @return the requiereCartilla
     */
    public Boolean getRequiereCartilla() {
        return requiereCartilla;
    }

    /**
     * @param requiereCartilla the requiereCartilla to set
     */
    public void setRequiereCartilla(Boolean requiereCartilla) {
        this.requiereCartilla = requiereCartilla;
    }

    /**
     * @return the requiereIne
     */
    public Boolean getRequiereIne() {
        return requiereIne;
    }

    /**
     * @param requiereIne the requiereIne to set
     */
    public void setRequiereIne(Boolean requiereIne) {
        this.requiereIne = requiereIne;
    }

    /**
     * @return the requiereActaNacimiento
     */
    public Boolean getRequiereActaNacimiento() {
        return requiereActaNacimiento;
    }

    /**
     * @param requiereActaNacimiento the requiereActaNacimiento to set
     */
    public void setRequiereActaNacimiento(Boolean requiereActaNacimiento) {
        this.requiereActaNacimiento = requiereActaNacimiento;
    }

    /**
     * @return the requiereExamenNoEmbarazo
     */
    public Boolean getRequiereExamenNoEmbarazo() {
        return requiereExamenNoEmbarazo;
    }

    /**
     * @param requiereExamenNoEmbarazo the requiereExamenNoEmbarazo to set
     */
    public void setRequiereExamenNoEmbarazo(Boolean requiereExamenNoEmbarazo) {
        this.requiereExamenNoEmbarazo = requiereExamenNoEmbarazo;
    }
    
    
    
}
