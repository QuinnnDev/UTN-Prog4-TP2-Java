package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona{
	
	//Atributos
	private final int legajo;
	private String puesto;
		
	private static int cont = 999;
		
	//Constructores
	public Empleado() {
        super();
        cont++;
        
        this.legajo = cont;
        this.puesto = "Sin puesto";
    }

	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero,
			String direccion, String telefono, String email, String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		cont++;
		this.puesto = puesto;
		this.legajo = cont;
	}
		
	//Métodos
	public String toString() {
		return super.toString() + ", Legajo = " + legajo + ", Puesto = " + puesto;
	}
	
    public static int getProximoLegajo() {
        return cont + 1;
    }
	
	//getters y setters
	public int getLegajo() {
		return legajo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
}
