import java.util.ArrayList;

public class Funciones {

    public static boolean funcion1(int numero) {

        int x = 13;

        if (numero % x == 0) {

            return true;

        } else {

            return false;

        }

    }

    public static boolean funcion2(int numero) {

        if (numero >= 400 && numero <= 500) {

            return true;

        } else {
            return false;

        }

    }

    public static double funcion3(double numero, double divisor) {

        if (numero % 13 == 0 && numero % divisor == 0) {
            return numero / divisor;
        } else {
            return 0;
        }
    }

    public String funcion4(String cadena1, String cadena2, String cadena3) {
        String cadena;

        for (int y = 0; y < cadena1.length(); y++) {
            if (cadena1.charAt(y) != 'a' && cadena1.charAt(y) != 'e' && cadena1.charAt(y) != 'i'
                    && cadena1.charAt(y) != 'o' && cadena1.charAt(y) != 'u' && cadena1.charAt(y) >= 97
                    && cadena1.charAt(y) <= 122) {
                System.out.print(cadena1.charAt(y));
            }
            System.out.print(" ");
        }

        for (int y = 0; y < cadena2.length(); y++) {
            if (cadena2.charAt(y) != 'a' && cadena2.charAt(y) != 'e' && cadena2.charAt(y) != 'i'
                    && cadena2.charAt(y) != 'o' && cadena2.charAt(y) != 'u' && cadena2.charAt(y) >= 97
                    && cadena2.charAt(y) <= 122) {
                System.out.print(cadena2.charAt(y));
            }
            System.out.print(" ");
        }

        for (int y = 0; y < cadena3.length(); y++) {
            if (cadena3.charAt(y) != 'a' && cadena3.charAt(y) != 'e' && cadena3.charAt(y) != 'i'
                    && cadena3.charAt(y) != 'o' && cadena3.charAt(y) != 'u' && cadena3.charAt(y) >= 97
                    && cadena3.charAt(y) <= 122) {
                System.out.print(cadena3.charAt(y));
            }
            System.out.print(" ");
        }
    }

    public static int funcion5(String cadena1, int number) {

        for (int i = 0; i < cadena1.length(); i++) {

            if (cadena1.charAt(i) == 48) {
                number = number + 0;
            }
            if (cadena1.charAt(i) == 49) {
                number = number + 1;
            }
            if (cadena1.charAt(i) == 50) {
                number = number + 2;
            }
            if (cadena1.charAt(i) == 51) {
                number = number + 3;
            }
            if (cadena1.charAt(i) == 52) {
                number = number + 4;
            }
            if (cadena1.charAt(i) == 53) {
                number = number + 5;
            }
            if (cadena1.charAt(i) == 54) {
                number = number + 6;
            }
            if (cadena1.charAt(i) == 55) {
                number = number + 7;
            }
            if (cadena1.charAt(i) == 56) {
                number = number + 8;
            }
            if (cadena1.charAt(i) == 57) {
                number = number + 9;
            }
        }
        return number;
    }

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

    public void funcion7() {

        String[] cadena = { "Enrique", "Esperanza", "Oscar", "Marcos" };

        for (int i = 0; i < cadena.length; i++) {
            for (int y = 0; y < cadena[i].length(); y++) {
                if (y >= 6 && y <= 10) {
                    System.out.print(cadena[i].charAt(y));
                }
            }
            System.out.print(" ");
        }
    }

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
