package ejercicio2;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio2 {

	public static void main(String[] args) {
		
		ArrayList<Object> Lista = new ArrayList<>();
		
		Lista.add(new Polideportivo(2500.0, "Poli Norte", 1));
        Lista.add(new Polideportivo(3800.0, "Poli Sur", 2));
        Lista.add(new Polideportivo(3100.0, "Poli Centro", 1));

        Lista.add(new EdificioDeOficinas(5600.0, 48));
        Lista.add(new EdificioDeOficinas(4200.0, 56));
        
        ListIterator<Object> it = Lista.listIterator();
        
        while(it.hasNext()) {
        	System.out.println( it.next().toString() );
        }
		
	}
}
