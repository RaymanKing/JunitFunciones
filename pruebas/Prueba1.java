package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Prueba1 {

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

   @DisplayName("Test de Caja Negra con un valor divisible") 
    @Test
    void testFuncion1() {
        assertEquals(true, funcion.funcion1(26));
    }

    @DisplayName("Test de Caja Negra con un valor que no sea divisible")
    @Test
    void testFuncion1_2() {
        assertNotEquals(true, funcion.funcion1(32));
    }
    
    @DisplayName("Test de Caja Negra con valores aleatorios")
    
    @Test
    
    //Test de caja negra aleatoria.
    void testFuncion1_3() {
    	assertNotEquals(true, funcion.funcion1((int)(Math.random() * 10)));
    	//le pasamos un número aleatorio del 0 al 10, el int lo convierte en entero.
    }

    @DisplayName("Test de Analisis limite")
    @Test
    void testFuncion1_4() {
        assertEquals(false, funcion.funcion1(2147483647));
        assertNotEquals(false, funcion.funcion1(0));
        assertEquals(false, funcion.funcion1(-1));
    }

}
