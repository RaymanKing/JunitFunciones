package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Prueba3 {

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

    @DisplayName("Test de Caja Negra con un valor")
    @Test
    void testFuncion3() {
        assertEquals(0, funcion.funcion3(26, 36));
    }
    
    @DisplayName("Test de Caja Negra")
    @Test
    //test de caja negra correcta.
    void testFuncion3_2() {
    	assertEquals(0, funcion.funcion3(10, 450));
    //compruebo que es correcta, si no se cumple lo establecido en la función devuelve un 0.
    }

    @DisplayName("Test de Caja Negra sin valor")
    @Test
    void testFuncion3_3() {
        assertEquals(0, funcion.funcion3());
    }
}
