package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona p1 = new Persona("12345678", "Joaquin", "Devec", 		LocalDate.of(2005, 10, 11), "masculino", "San miguel", "22222222", "asdf1@gmail.com");
		Persona p2 = new Persona("12345679", "Juan", "Cruz",			LocalDate.of(2005, 6, 15), "masculino", "Santa Fe 4321", "1111111111", "asdf2@gmail.com");
		Persona p3 = new Persona("12345680", "Gonzalo", "Cubilla",	LocalDate.of(2004, 12, 13), "masculino", "Argentina", "33333333", "asdf3@gmail.com");
		Persona p4 = new Persona("12345681", "Jorge", "El Curioso", 	LocalDate.of(2006, 10, 11), "masculino", "Belgrano 124", "44444444", "asdf4@gmail.com");
		Persona p5 = new Persona("12345682", "Leandro", "Paredes", 	LocalDate.of(1997,12,11), "masculino", "Formosa 1111", "55555555", "asdf5@gmail.com");
		
		HashSet<Persona> set = new HashSet<Persona>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		Iterator<Persona> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
