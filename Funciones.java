import java.util.*;

public class Funciones{

	public String[] funcion7(String[] listaCadenas){

        String cadena= "";
        String[] cadenaS = {cadena};

        for (int i = 0; i < listaCadenas.length; i++) {
            for (int y = 0; y < listaCadenas[i].length(); y++) {
                if (y >= 6 && y <= 10) {
                cadena = cadena + listaCadenas[i].charAt(y);
                }
            }cadena = cadena + " ";
        }return cadenaS;
    }
}