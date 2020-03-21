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
}
