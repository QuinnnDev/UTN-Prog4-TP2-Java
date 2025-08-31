package ejercicio1;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		try 
		{
			String dni1 = "AA202020";
			Persona.verificarDNI(dni1);
			System.out.println("Persona agregada correctamente");
		}catch(ExVerificarDNI e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			String dni2 = "20202020";
			Persona.verificarDNI(dni2);
			System.out.println("Persona agregada correctamente");
		}catch(ExVerificarDNI e)
		{
			System.out.println(e.getMessage());
		}
	}
}
