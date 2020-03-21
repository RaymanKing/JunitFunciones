import java.util.ArrayList;

public class Funciones {

    public static double funcion3(double numero, double divisor) {

        if (numero % 13 == 0 && numero % divisor == 0) {
            return numero / divisor;
        } else {
            return 0;
        }
    }

}
