import java.util.Scanner;

public class Funciones {

    public static int funcion5(String cadena1) {

        int sumatorio = 0;

        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) <= 9) {
                sumatorio = sumatorio + cadena1.charAt(i);
            } else if (cadena1.charAt(i) >= 0) {
                sumatorio = sumatorio + cadena1.charAt(i);
            }

        }
        return sumatorio;
    }
}
