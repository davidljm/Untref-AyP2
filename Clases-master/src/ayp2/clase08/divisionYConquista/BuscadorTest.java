package ayp2.clase08.divisionYConquista;

import org.junit.Assert;
import org.junit.Test;

public class BuscadorTest {
	
	@Test
	public void probarUnaListaVacia() {
		int[] array = {};
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 1));
	}
	
	@Test
	public void probarUnaListaConUnElementoEncontrado() {
		int[] array = { 1 };
		Assert.assertEquals(0, Buscador.busquedaBinaria(array, 1));
	}

	@Test
	public void probarUnaListaConUnElementoNoEncontrado() {
		int[] array = { 1 };
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 2));
	}

	@Test
	public void probarElementosIncluidosAUnaListaDeTamañoImpar() {
		int[] array = { 1, 2, 3, 5, 8, 13, 21 };
		Assert.assertEquals(0, Buscador.busquedaBinaria(array, 1));
		Assert.assertEquals(1, Buscador.busquedaBinaria(array, 2));
		Assert.assertEquals(2, Buscador.busquedaBinaria(array, 3));
		Assert.assertEquals(3, Buscador.busquedaBinaria(array, 5));
		Assert.assertEquals(4, Buscador.busquedaBinaria(array, 8));
		Assert.assertEquals(5, Buscador.busquedaBinaria(array, 13));
		Assert.assertEquals(6, Buscador.busquedaBinaria(array, 21));
	}

	@Test
	public void probarElementosIncluidosALaListaDeTamañoPar() {
		int[] array = { 1, 2, 3, 5, 8, 13 };
		Assert.assertEquals(0, Buscador.busquedaBinaria(array, 1));
		Assert.assertEquals(1, Buscador.busquedaBinaria(array, 2));
		Assert.assertEquals(2, Buscador.busquedaBinaria(array, 3));
		Assert.assertEquals(3, Buscador.busquedaBinaria(array, 5));
		Assert.assertEquals(4, Buscador.busquedaBinaria(array, 8));
		Assert.assertEquals(5, Buscador.busquedaBinaria(array, 13));
	}
	
	@Test
	public void probarElementosNoIncluidosAUnaListaDeTamañoImpar() {
		int[] array = { 1, 2, 3, 5, 8, 13, 21 };
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 0));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 4));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 6));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 7));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 9));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 10));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 11));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 12));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 14));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 17));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 20));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 22));
	}
	@Test
	public void probarElementosNoIncluidosAUnaListaDeTamañoPar() {
		int[] array = { 1, 2, 3, 5, 8, 13 };
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 0));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 4));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 6));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 7));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 9));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 10));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 11));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 12));
		Assert.assertEquals(-1, Buscador.busquedaBinaria(array, 14));
	}
}
