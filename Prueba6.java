package pruebas;

import static org.junit.jupiter.api.Assertions.*;

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
        funcion = new Funcion();
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
        assertArrayEquals({6, 72, 12, 1}, funcion.funcion6({1, 2, 2, 1}));
    }
    // z = 6 y 6

    @DisplayName
    @Test
    void testFuncion6_1() {
        assertNull(0, 0, 0, 0, funcion.funcion6(null));
    }

    @DisplayName("Test de analisis de limites")
    @Test
    void testFuncion6_2() {
        assertNull(0, 0, 0, 0, funcion.funcion6(null));
    } 
    
    @DisplayName ("Prueba de caja negra incorrecta")

    @Test

     void pruebaFuncion6(){

        ArrayList <Double> numeros = new ArrayList <Double> ();
        numeros.add(8);
        numeros.add(6);
        ArrayList <Double> resultado = new ArrayList <Double> ();
        resultado.add(8);
        resultado.add(6);

        //le pasamos un resultado en el que los números no se modifican.
       
        //comprueba que el resultado es erróneo, dado que le damos unos valores que da un resultado distino al que daría en la función.

        assertEquals(resultado ,funcion.funcion6 (numeros));

     }

}
