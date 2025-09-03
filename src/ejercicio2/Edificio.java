package ejercicio2;

public class Edificio implements IGetSuperficieEdificio{

	 private Double superficie;
	 

	public Edificio(Double superficie) {
		this.superficie = superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return superficie;
	}
	 
	
}
