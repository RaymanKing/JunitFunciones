package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Prueba8 {

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

    @DisplayName("Test de Caja Negra con array")
    @Test
    void testFuncion8() {
    	int[][] tiempos = {{50,150,300},{250,250,100},{60,110,80},{150,50,200}};
    	ArrayList<String> alumnos = new ArrayList<String>();
    	alumnos.add("Marcos");
    	alumnos.add("Oscar");
    	alumnos.add("Enrique");
    	alumnos.add("Esperanza");
        assertNotEquals(true,
                funcion.funcion8(tiempos,alumnos));
    }// 700

    @DisplayName("Test de Caja Negra falso")
    @Test
    void testFuncion8_1() {
    	int[][] tiempos = {{}};
    	ArrayList<String> alumnos = new ArrayList<String>();
        assertNotEquals(false, funcion.funcion8(tiempos,alumnos));
    }
    
    @DisplayName ("Prueba de caja negra correcta: ")


	@Test

	void pruebaFuncion8_2(){

		ArrayList <String> alumnos = new ArrayList <String> ();
		alumnos.add("pablo");
		alumnos.add("anastasia");
		alumnos.add("pepa");
		//le pasamos tres alumnos y abajo indicamos los tiempos de cada uno en un array bidimensional.

		int [][] tiempos = {{500,500,500}, {100,100,100}, {500,500,500}};

		assertEquals(true, funcion.funcion8 (tiempos, alumnos));

		//es una prueba correcta, por que el resultado esperado coincide con la de la funci�n.
	}

}
