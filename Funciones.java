import java.util.Scanner;

public class Funciones {

    public static int funcion5(String cadena1, int number) {

        // String cadena1;
        // int number = 0;
        // int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena; ");
        cadena1 = sc.nextLine();

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
        // System.out.println("La suma de los numeros es: " + number + " Jorge.");
        return number;
    }
}
