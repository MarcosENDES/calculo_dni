/**
 * 
 */
package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ControladorDNITest {

	ControladorDNI controlador;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//System.out.println("@BeforeAll");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		//.out.println("@BeforeEach");
		controlador = new ControladorDNI();
	}
	
	// Prueba para verificar que el calculo de la letra del DNI es correcto
	@Test
	void testEsValidoDNI() {
		// Caso de prueba válido
		String dniCorrecto = "11111111H";
		assertTrue(controlador.esValido(dniCorrecto));
	}

	@Test
	@DisplayName("Validacion incorrecta")
	void testEsFalsoDNI() {
		String dniFalso = "11111111R";
		
		assertFalse(controlador.esValido(dniFalso));
	}

	@Test
	@DisplayName("Validacion de entradas validas para DNI")
	void testEsValido_DNIEntradasInvalidas() {
		assertFalse(controlador.esValido(null), "Un DNI nulo fue reconocido como valido");
	}
	
	@Test
	@DisplayName("Un dni demasiado corto")
	void testDNIcorto() {
		assertFalse(controlador.esValido("11111111H"), "El dni es demasiado corto y fue");
	}
	
	@Test
	@DisplayName("DNI con caracteres no numéricos")
	void testDNIconCaracteres() {
		
	}
}
