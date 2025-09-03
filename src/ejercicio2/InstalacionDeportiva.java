package ejercicio2;

public class InstalacionDeportiva implements IGetTipoDeInstalacion {
    private int tipoDeInstalacion;

    public InstalacionDeportiva(int tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
    
    @Override
    public int getTipoDeInstalacion () {
    	return tipoDeInstalacion;
    }

	@Override
	public String toString() {
		return "Instalacion tipo: " + tipoDeInstalacion;
	}
    
 
}
