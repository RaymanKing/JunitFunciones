package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Prueba6 {

    static Funciones funcion = null;
    static int pruebasRealizadas = 0;

    @BeforeAll
    static void prepararPruebas() {
        System.out.println("Preparando Tests");
        funcion = new Funciones();
    }

    @BeforeEach
    private void preparaPruebaEjecutar() {
        pruebasRealizadas++;
        System.out.println("Ejecutando test " + pruebasRealizadas);
    }

    @AfterEach
    private void terminadaPrueba() {
        System.out.println("Se ha ejecutado el test: " + pruebasRealizadas);
    }

    @AfterAll
    static void terminarPruebas() {
        System.out.println("Se ha terminado de ejecutar todas las pruebas");
        funcion = null;
    }

    @DisplayName("Test de Caja Negra con cadena")
    @Test
    void testFuncion6() {
        ArrayList<Double> arrayDouble = new ArrayList<Double>();
        arrayDouble.add(1.0);
        arrayDouble.add(2.0);
        arrayDouble.add(2.0);
        arrayDouble.add(1.0);
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(6.0);
        array.add(64.0);
        array.add(12.0);
        array.add(1.0);
        assertEquals(array, funcion.funcion6(arrayDouble));
    }
    // z = 6 y 6

    @DisplayName("Test de valores nulos")
    @Test
    void testFuncion6_1() {
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(0.0);
        assertEquals(array, funcion.funcion6(array));
    }

    @DisplayName("Test de analisis de limites")
    @Test
    void testFuncion6_2() {
        ArrayList<Double> arrayLimite = new ArrayList<Double>();
        arrayLimite.add(0.0);
        arrayLimite.add(0.0);
        arrayLimite.add(0.0);
        arrayLimite.add(0.0);
        assertEquals(arrayLimite, funcion.funcion6(arrayLimite));
    }

    @DisplayName("Prueba de caja negra incorrecta")

    @Test

    void pruebaFuncion6() {

        ArrayList<Double> numeros = new ArrayList<Double>();
        numeros.add(8.0);
        numeros.add(6.0);
        ArrayList<Double> resultado = new ArrayList<Double>();
        resultado.add(8.0);
        resultado.add(6.0);

        // le pasamos un resultado en el que los n�meros no se modifican.

        // comprueba que el resultado es err�neo, dado que le damos unos valores que da
        // un resultado distino al que dar�a en la funci�n.

        assertNotEquals(resultado, funcion.funcion6(numeros));

    }

}
