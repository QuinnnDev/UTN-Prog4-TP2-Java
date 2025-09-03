package ejercicio2;

public class Polideportivo implements IGetTipoDeInstalacion, IGetSuperficieEdificio{
	
	private double superficie;
	private String nombre;
	private int tipoInstalacion;
	
	
	public Polideportivo(double superficie, String nombre, int tipoDeInstalacion) {
		this.superficie = superficie;
		this.nombre = nombre;
		this.tipoInstalacion = tipoDeInstalacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSuperficieEdificio() {
		return superficie;
	}

	public int getTipoDeInstalacion() {
		return tipoInstalacion;
	}
	
	public void setTipoDeInstalacion(int tipo) {
		this.tipoInstalacion = tipo;
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	

}
