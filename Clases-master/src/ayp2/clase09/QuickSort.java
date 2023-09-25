package ayp2.clase09;

/**
 * Basado en la implementación de Wayne y Sedgewick:
 *
 * https://algs4.cs.princeton.edu/23quicksort/Quick.java.html
 */
public abstract class QuickSort {

	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int inicio, int fin) {
		if (fin <= inicio) {
			return;
		}
		
		int ultimoIntercalado = inicio;
		
		for (int i = inicio + 1; i <= fin; i++) {
			if (array[i] < array[inicio]) {
				swap(array, ++ultimoIntercalado, i);
			}
		}
		
		swap(array, inicio, ultimoIntercalado);
		
		quickSort(array, inicio, ultimoIntercalado - 1);
		quickSort(array, ultimoIntercalado + 1, fin);
	}

	private static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}