package ejercicio1;

import java.time.LocalDate;
import java.util.*;

public class MainEjercicio1_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado p1 = new Empleado("12345678", "Joaquin", "Devec", 		LocalDate.of(2005, 10, 11), "femboy", "Femboy island Main st.", "22222222", "asdf1@gmail.com", "Contador");
		Empleado p2 = new Empleado("12345679", "Juan", "Cruz",			LocalDate.of(2005, 6, 15), "masculino", "Santa Fe 4321", "1111111111", "asdf2@gmail.com", "contador");
		Empleado p3 = new Empleado("12345680", "Gonzalo", "Cubilla",	LocalDate.of(2004, 12, 13), "masculino", "San martin 5421", "33333333", "asdf3@gmail.com", "programador");
		Empleado p4 = new Empleado("12345681", "Jorge", "El Curioso", 	LocalDate.of(2006, 10, 11), "masculino", "Belgrano 124", "44444444", "asdf4@gmail.com", "jefe");
		Empleado p5 = new Empleado("12345682", "Leandro", "Paredes", 	LocalDate.of(1997,12,11), "masculino", "Formosa 1111", "55555555", "asdf5@gmail.com", "seguridad");
		
		 Set<Empleado> listaEmp = new TreeSet<>();
	        listaEmp.add(p1);
	        listaEmp.add(p2);
	        listaEmp.add(p3);
	        listaEmp.add(p4);
	        listaEmp.add(p5);
	        
		Iterator<Empleado> it = listaEmp.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
