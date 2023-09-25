package ayp2.clase01.sumador;

public class Sumador {

	/**
	 * Suma dos enteros.
	 */
	public static int sumar(int a, int b) {
		return a + b;
	}

	/**
	 * Suma dos decimales.
	 */
	public static double sumar(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		int a = 11;
		int b = 6;
		int c = sumar(a, b);
		System.out.println(a + " + " + b + " = " + c);

		double d = 4.5;
		double e = 5.3;
		double f = sumar(d, e);
		System.out.println(d + " + " + e + " = " + f);
	}
}
