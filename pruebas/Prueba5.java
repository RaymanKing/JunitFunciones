package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Prueba5 {

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
    void testFuncion5() {
        assertEquals(127, funcion.funcion5(
                "Enrique Rapela Castejon 12/02/1197, Marcos Torres Segura 28/08/1999, Oscar Padilla Valdes 09/04/2000, Esperanza Del Junco Perez 29/06/1997"));
    }

    @DisplayName("Test de caja Negra con Valor err�neo")
    @Test
    void testFuncion5_1() {
        assertNotEquals(1, funcion.funcion5("Pepe tenia un caballo que se llamaba coliflor"));
    }

    @DisplayName("Test de analisis de valores limites")
    @Test
    void testFuncion5_2() {
        assertEquals(0, funcion.funcion5(
                "Enrique Rapela Castejon, Marcos Torres Segura, Oscar Padilla Valdes, Esperanza Del Junco Perez"));
    }
}
