package ejercicio2;

public class EdificioDeOficinas extends Edificio {

	int cantidadOficinas;
	
	public EdificioDeOficinas(Double superficie, int cantidadOficinas) {
		super(superficie);
		this.cantidadOficinas = cantidadOficinas;
	}

	@Override
	public String toString() {
		return "EdificioDeOficinas " + super.toString() +", " + "cantidadOficinas: " + cantidadOficinas;
	}

	
	
}
