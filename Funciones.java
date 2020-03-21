import java.util.*;

public class Funciones{

	public void funcion7(){

		String[] cadena = {"Enrique", "Esperanza", "Oscar", "Marcos"};

		for (int i = 0; i < cadena.length; i++) {
			for (int y = 0; y < cadena[i].length(); y++) {
				if (y >= 6 && y <= 10) {
				System.out.print(cadena[i].charAt(y));
				}
			}System.out.print(" ");
		}
	}
}