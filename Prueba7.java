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

    @DisplayName("Test de Caja Negra con array")
    @Test
    void testFuncion7() {
        assertArrayEquals({"ocle", "isti", "onof", "ill"},
                funcion.funcion7({"Esternocleidomastoideo", "Futbolistico", "Soyunmonofeliz", "Pentakill"}));
    }

    // 6 y 10
    @DisplayName("Test de Caja Negra con valor Nulo")
    @Test
    void testFuncion7_1() {
        assertNull(" ", funcion.funcion7(null));
    }

    @DisplayName("Test de analisis de limites");
    @Test
    void testFuncion7_2() {
        assertArrayEquals("","","","", funcion.funcion7("a", "b", "c","d"));
        assertArrayEquals("78910", funcion.funcion7("12345678910"));
    }
}
