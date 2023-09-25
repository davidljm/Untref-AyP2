package tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ej3Test {
	Ej3 ej = new Ej3 ();
	
	@Test
	public void x123Test() {
		int[] esperado = { 3, 2, 1 };
		int[] obtenido = ej.mayorMedioMenor(1, 2, 3);
		assertArrayEquals(esperado, obtenido);
	}

	@Test
	public void x132Test() {
		int[] esperado = { 3, 2, 1 };
		int[] obtenido = ej.mayorMedioMenor(1, 3, 2);
		assertArrayEquals(esperado, obtenido);
	}

	@Test
	public void x213Test() {
		int[] esperado = { 3, 2, 1 };
		int[] obtenido = ej.mayorMedioMenor(2, 1, 3);
		assertArrayEquals(esperado, obtenido);
	}

	@Test
	public void x231Test() {
		int[] esperado = { 3, 2, 1 };
		int[] obtenido = ej.mayorMedioMenor(2, 3, 1);
		assertArrayEquals(esperado, obtenido);
	}

	@Test
	public void x321Test() {
		int[] esperado = { 3, 2, 1 };
		int[] obtenido = ej.mayorMedioMenor(3, 2, 1);
		assertArrayEquals(esperado, obtenido);
	}

	@Test
	public void x312Test() {
		int[] esperado = { 3, 2, 1 };
		int[] obtenido = ej.mayorMedioMenor(3, 1, 2);
		assertArrayEquals(esperado, obtenido);
	}


}
