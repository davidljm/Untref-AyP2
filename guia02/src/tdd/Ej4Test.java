package tdd;

import static org.junit.jupiter.api.Assertions.*;

class Ej4Test {

	@org.junit.Test
	public void fibonacciUnSoloTermino() {
		Ej4 numero = new Ej4();
		
		assertEquals(0, numero.devolverSuma(1));
		
	}
	@org.junit.Test
	public void fibonacciTerminoDos() {
		Ej4 numero = new Ej4();
		
		assertEquals(2, numero.devolverSuma(2));
		
	}
	@org.junit.Test
	public void fibonacciTerminoTres() {
		Ej4 numero = new Ej4();
		
		assertEquals(2, numero.devolverSuma(3));
	
	}
	@org.junit.Test
	public void fibonacciTerminoCinco() {
		Ej4 numero = new Ej4();
		
		assertEquals(10, numero.devolverSuma(5));
	
	}
	@org.junit.Test
	public void fibonacciTerminoDiez() {
		Ej4 numero = new Ej4();
		
		assertEquals(44, numero.devolverSuma(10));
	
	}
	@org.junit.Test
	public void fibonacciTermino4M() {
		Ej4 numero = new Ej4();
		
		assertEquals(4613732, numero.devolverSuma(34));
	
	}

}
