package guia00;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej2Test {
	Ej2 n = new Ej2();

	@Test
	void testNumero10() {
		assertEquals(23, n.sumaMultiplos(10));
	}

	@Test
	void testNumero16() {
		assertEquals(60, n.sumaMultiplos(16));
	}

	@Test
	void testNumero20() {
		assertEquals(98, n.sumaMultiplos(20));
	}

	@Test
	void testNumero12() {
		assertEquals(45, n.sumaMultiplos(12));
	}
	
	@Test
	void testNumero5() {
		assertEquals(8, n.sumaMultiplos(5));
	}


}
