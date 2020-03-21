import java.util.ArrayList;

public class Funciones {

    public static boolean funcion8(int[][] tiempodetrabajos, ArrayList<String> alumnos) {

        int tiempo = 700;
        int sumatotal = 0;

        for (int i = 0; i < alumnos.size(); i++) {
            sumatotal = 0;
            for (int j = 0; j < alumnos.size(); j++) {
                sumatotal += tiempodetrabajos[j][i];
            }
            if (sumatotal <= tiempo) {
                return false;
            }
        }
        return true;
    }
}
