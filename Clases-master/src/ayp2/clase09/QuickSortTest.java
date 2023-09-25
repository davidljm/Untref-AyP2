package ayp2.clase09;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

	@Test
	public void probarUnUnicoElemento() {
		int[] array = { 1 };
		int[] expected = { 1 };
		QuickSort.quickSort(array);
		Assert.assertArrayEquals(expected, array);
	}

	@Test
	public void probarUnArrayCualquieraTamañoImpar() {
		int[] array = { 4, 3, 5, 6, 2, 8, 1, 9, 7 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		QuickSort.quickSort(array);
		Assert.assertArrayEquals(expected, array);
	}
	
	@Test
	public void probarUnArrayCualquieraTamañoPar() {
		int[] array = { 4, 3, 5, 6, 10, 2, 8, 1, 9, 7 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		QuickSort.quickSort(array);
		Assert.assertArrayEquals(expected, array);
	}
}
