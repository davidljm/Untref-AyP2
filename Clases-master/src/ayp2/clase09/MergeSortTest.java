package ayp2.clase09;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

	@Test
	public void probarUnUnicoElemento() {
		double[] array = { 1.0 };
		double[] expected = { 1.0 };
		
		Assert.assertArrayEquals(expected, MergeSort.mergeSort(array), 0.001);
	}

	@Test
	public void probarUnArrayCualquieraTamañoImpar() {
		double[] array = { 4.0, 3.0, 5.0, 6.0, 2.0, 8.0, 1.0, 9.0, 7.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0 };
		
		Assert.assertArrayEquals(expected, MergeSort.mergeSort(array), 0.001);
	}
	
	@Test
	public void probarUnArrayCualquieraTamañoPar() {
		double[] array = { 4.0, 3.0, 5.0, 6.0, 10.0, 2.0, 8.0, 1.0, 9.0, 7.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0 };
		
		Assert.assertArrayEquals(expected, MergeSort.mergeSort(array), 0.001);
	}
}
