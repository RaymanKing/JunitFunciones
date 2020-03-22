package pruebas;

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
