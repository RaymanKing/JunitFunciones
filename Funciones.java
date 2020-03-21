import java.util.*;

public class Funciones{

	public void funcion4(){
		String cadena1 = "Hola";
		String cadena2 = "Daniela";
		String cadena3 = "encantado";

			for (int y = 0; y < cadena1.length(); y++) {
					if (cadena1.charAt(y) != 'a'
					&& cadena1.charAt(y) != 'e'
                    && cadena1.charAt(y) != 'i'
                    && cadena1.charAt(y) != 'o'
                    && cadena1.charAt(y) != 'u' 
                    && cadena1.charAt(y) >= 97 
                    && cadena1.charAt(y) <= 122) {
                System.out.print(cadena1.charAt(y));
            }System.out.print(" ");
		}

			for (int y = 0; y < cadena2.length(); y++) {
					if (cadena2.charAt(y) != 'a'
					&& cadena2.charAt(y) != 'e'
                    && cadena2.charAt(y) != 'i'
                    && cadena2.charAt(y) != 'o'
                    && cadena2.charAt(y) != 'u' 
                    && cadena2.charAt(y) >= 97 
                    && cadena2.charAt(y) <= 122) {
                System.out.print(cadena2.charAt(y));
            }System.out.print(" ");
		}

			for (int y = 0; y < cadena3.length(); y++) {
					if (cadena3.charAt(y) != 'a'
					&& cadena3.charAt(y) != 'e'
                    && cadena3.charAt(y) != 'i'
                    && cadena3.charAt(y) != 'o'
                    && cadena3.charAt(y) != 'u' 
                    && cadena3.charAt(y) >= 97 
                    && cadena3.charAt(y) <= 122) {
                System.out.print(cadena3.charAt(y));
            }System.out.print(" ");
		}
	}
}