package ayp2.clase01.comparador;

public class Comparador {

	/**
	 * Devuelve el menor de dos números
	 */
	public static int minimo(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	/**
	 * Devuelve el menor de tres números
	 */
	public static int minimo(int a, int b, int c) {
		int minimoParcial = minimo(a, b);
		return minimo(minimoParcial, c);
	}

	public static void main(String[] args) {
		int a = 11;
		int b = 6;
		int c = 4;

		int d = minimo(a, b);

		System.out.println("Valor mínimo = " + d);

		int e = minimo(a, b, c);

		System.out.println("Valor mínimo = " + e);
	}
}
