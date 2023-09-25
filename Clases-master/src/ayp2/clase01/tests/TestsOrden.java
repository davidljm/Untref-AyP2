package ayp2.clase01.tests;

import org.junit.Assert;
import org.junit.Test;

public class TestsOrden {

	// Este método puede reutilizarse
	private boolean estaOrdenado(int[] arreglo) {
		boolean ordenado = true;
		for (int i = 1; i < arreglo.length && ordenado; i++)
			if (arreglo[i - 1] > arreglo[i])
				ordenado = false;
		return ordenado;
	}

	@Test
	public void pruebaOrdenado() {
		int[] arreglo = { 1, 2, 3, 4 };
		Assert.assertTrue(estaOrdenado(arreglo));
	}

}
