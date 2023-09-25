package ayp2.clase09;

/**
 * Basado en la implementación de Wayne y Sedgewick:
 * 
 * http://algs4.cs.princeton.edu/14analysis/Mergesort.java.html
 */
public abstract class MergeSort {

	private static double[] merge(double[] a, double[] b) {
		double[] resultado = new double[a.length + b.length];

		int i = 0, j = 0;

		for (int k = 0; k < resultado.length; k++) {
			if (i >= a.length) {
				resultado[k] = b[j++];
			} else if (j >= b.length) {
				resultado[k] = a[i++];
			} else if (a[i] <= b[j]) {
				resultado[k] = a[i++];
			} else {
				resultado[k] = b[j++];
			}
		}
		return resultado;
	}

	public static double[] mergeSort(double[] array) {
		int n = array.length;
		
		if (n <= 1) {
			return array;
		}
		
		double[] a = new double[n / 2];
		for (int i = 0; i < a.length; i++) {
			a[i] = array[i];
		}

		double[] b = new double[n - n / 2];
		for (int i = 0; i < b.length; i++) {
			b[i] = array[i + n / 2];
		}
		
		return merge(mergeSort(a), mergeSort(b));
	}

}
