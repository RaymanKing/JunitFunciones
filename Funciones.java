import java.util.ArrayList;

public class Funciones {

    public static ArrayList<Double> funcion6(ArrayList<Double> arrayDoubles) {
        for (int i = 0; i < arrayDoubles.size(); i++) {
            if (i % 2 == 0) {
                arrayDoubles.set(i, arrayDoubles.get(i) * 6);
            } else {
                arrayDoubles.set(i, Math.pow(arrayDoubles.get(i), 6));
            }
        }
        return arrayDoubles;
    }

}
