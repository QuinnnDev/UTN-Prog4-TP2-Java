package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

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
	
	public int compareTo(Empleado o) {
		
		if(o.legajo == this.legajo) return 0;
			
			if(o.legajo<this.legajo) { return -1;} return 1;}
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + legajo;
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (legajo != other.legajo)
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		return true;
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
