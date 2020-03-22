package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Prueba7 {

    static Funciones funcion = null;
    static int pruebasRealizadas = 0;

    @BeforeAll
    static void prepararPruebas() {
        System.out.println("Preparando Tests");
        Funciones funcion = new Funciones();
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

    @DisplayName("Test de Caja Negra con array")
    @Test
    void testFuncion7() {
        String[] palabras = { "ocle", "isti", "onof", "ill" };
        String[] clave = { "Esternocleidomastoideo", "Futbolistico", "Soyunmonofeliz", "Pentakill" };
        assertArrayEquals(palabras, funcion.funcion7(clave));
    }

    // 6 y 10
    @DisplayName("Test de Caja Negra con valor Nulo")
    @Test
    void testFuncion7_1() {
        String[] nulo = { "" };
        assertArrayEquals(nulo, funcion.funcion7(nulo));
    }

    @DisplayName("Test de analisis de limites")
    @Test
    void testFuncion7_2() {
        String[] limite = { "", "", "", "" };
        String[] enviado = { "a", "b", "c", "d" };
        String[] limite2 = { "78910" };
        String[] enviado2 = { "12345678910" };
        assertArrayEquals(limite, funcion.funcion7(enviado));
        assertArrayEquals(limite2, funcion.funcion7(enviado2));
    }

    @DisplayName("Prueba de caja negra incorrecta")
    @Test

    void pruebaFuncion7() {

        String[] cadenas = { "obdulio", "eustaquio", "herminio" };
        String[] resultadoEsperado = { " ", " ", " " };
        // le pasamos los datos a los distintos string.

        assertEquals(resultadoEsperado, funcion.funcion7(cadenas));
        // es incorrecta ya que el resultado esperado no coincide con el que
        // indicado(vac�o).

    }
}
