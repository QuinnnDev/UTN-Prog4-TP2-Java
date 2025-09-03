package ejercicio2;

public class Polideportivo extends InstalacionDeportiva implements IGetSuperficieEdificio{
	
	private double superficie;
	private String nombre;
	
	

	public Polideportivo(double superficie, String nombre, int tipoDeInstalacion) {
		super(tipoDeInstalacion);
		this.superficie = superficie;
		this.nombre = nombre;
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
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	
	@Override
	public String toString() {
		return "Polideportivo nombre: " + nombre + "superficie: " + superficie + 
				", " +  super.toString();
	}


}
