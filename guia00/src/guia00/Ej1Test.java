package guia00;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1Test {

	Ej1 n = new Ej1();

	@Test
	void testNumero1() {
		assertEquals(false, n.esPrimo(1));

	}

	@Test
	void testNumero2() {
		assertEquals(true, n.esPrimo(2));
	}

	@Test
	void testNumero3() {
		assertEquals(true, n.esPrimo(3));
	}

	@Test
	void testNumero15() {
		assertEquals(false, n.esPrimo(15));
	}
	
	@Test
	void testNumero7() {
		assertEquals(true, n.esPrimo(7));
	}

	@Test
	void testNumero100() {
		assertEquals(false, n.esPrimo(100));
	}

}
