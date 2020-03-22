package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Prueba2 {

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
    void testFuncion2() {
        assertEquals(true, funcion.funcion2(7));
    }

    @DisplayName("Test de Caja Negra Valor Nulo")
    @Test
    void testFuncion2_2() {
        assertNull(funcion.funcion2(null));
    }
    
    @DisplayName("prueba realizada por espe(*MARIO*)")
    @Test
    //Test de caja negra correcta.
    void testFuncion2_3() {
    	assertEquals(true, funcion.funcion2(450));
    //Estoy comprobando si funciona correctamente, al darle un valor dentro del intervalo.
    
    }

    @DisplayName("Test de Analisis de valores limites")
    @Test 
    void testFuncion2_4() {
        assertEquals(true, funcion.funcion2(500));
        assertEquals(false, funcion.funcion2(501));
        assertEquals(true, funcion.funcion2(400));
        assertEquals(false, funcion.funcion2(399));
    }
    

}