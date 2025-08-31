package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado p1 = new Empleado("12345678", "Joaquin", "Devec", 		LocalDate.of(2005, 10, 11), "masculino", "Tucuman 1234", "22222222", "asdf1@gmail.com", "Contador");
		Empleado p2 = new Empleado("12345679", "Juan", "Cruz",			LocalDate.of(2005, 6, 15), "masculino", "Santa Fe 4321", "1111111111", "asdf2@gmail.com", "contador");
		Empleado p3 = new Empleado("12345680", "Gonzalo", "Cubilla",	LocalDate.of(2004, 12, 13), "masculino", "Bolivia 5421", "33333333", "asdf3@gmail.com", "programador");
		Empleado p4 = new Empleado("12345681", "Jorge", "El Curioso", 	LocalDate.of(2006, 10, 11), "masculino", "Belgrano 124", "44444444", "asdf4@gmail.com", "jefe");
		Empleado p5 = new Empleado("12345682", "Leandro", "Paredes", 	LocalDate.of(1997,12,11), "masculino", "Formosa 1111", "55555555", "asdf5@gmail.com", "seguridad");
		
		Empleado[] listaEmp = new Empleado[5];
		
		listaEmp[0] = p1;
		listaEmp[1] = p2;
		listaEmp[2] = p3;
		listaEmp[3] = p4;
		listaEmp[4] = p5;
		
		System.out.println("aaa fin del programa");
		
	}

}
