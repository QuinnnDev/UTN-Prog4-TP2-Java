package ejercicio1;

import java.time.*;

public class Persona {
	
	//Atributos 
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	//Constructores
	public Persona () {
		nombre = "sin nombre";
		fechaNacimiento= LocalDate.of(2025, 1, 1);
	}
	
	public Persona (String dni, String nombre, String apellido, LocalDate fechaNac,
					String genero, String direccion, String telefono, String email) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNac;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	//Métodos
	public String toString() {
		return "DNI = " + dni + ", Nombre = " + nombre + ", Apellido = " + apellido + ", Fecha de nacimiento = " + fechaNacimiento +
				", Género = " + genero + ", Dirección = " + direccion + ", Teléfono = " + telefono + ", Email = " + email;
	}	
	
	public static void verificarDNI(String dni) throws ExVerificarDNI {
	    if (dni == null || dni.length() != 8) throw new ExVerificarDNI();

	    for (int i = 0; i < dni.length(); i++) {
	        if (!Character.isDigit(dni.charAt(i))) {
	            throw new ExVerificarDNI();
	        }
	    }
	}
}

