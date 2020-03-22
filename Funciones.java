import java.util.*;

public class Funciones{

	public String funcion4(String cadena1, String cadena2, String cadena3){

            String cadena = "";

            for (int i = 0; i < cadena1.length(); i++) {
                if (cadena1.charAt(i) != 'a'
                    && cadena1.charAt(i) != 'e'
                    && cadena1.charAt(i) != 'i'
                    && cadena1.charAt(i) != 'o'
                    && cadena1.charAt(i) != 'u' 
                    && cadena1.charAt(i) >= 97 
                    && cadena1.charAt(i) <= 122){
                    cadena = cadena + cadena1.charAt(i);
                    }else{
                        cadena = cadena + "";
                }
            }cadena = cadena + " ";
            for (int i = 0; i < cadena2.length(); i++) {
                if (cadena2.charAt(i) != 'a'
                    && cadena2.charAt(i) != 'e'
                    && cadena2.charAt(i) != 'i'
                    && cadena2.charAt(i) != 'o'
                    && cadena2.charAt(i) != 'u' 
                    && cadena2.charAt(i) >= 97 
                    && cadena2.charAt(i) <= 122){
                    cadena = cadena + cadena2.charAt(i);
                    }else{
                        cadena = cadena + "";
                }
            }cadena = cadena + " ";
            for (int i = 0; i < cadena3.length(); i++) {
                if (cadena3.charAt(i) != 'a'
                    && cadena3.charAt(i) != 'e'
                    && cadena3.charAt(i) != 'i'
                    && cadena3.charAt(i) != 'o'
                    && cadena3.charAt(i) != 'u' 
                    && cadena3.charAt(i) >= 97 
                    && cadena3.charAt(i) <= 122){
                    cadena = cadena + cadena3.charAt(i);
                }else{
                    cadena = cadena + "";
            }
        }cadena = cadena + " "; 
        return cadena;  
        
    }
}