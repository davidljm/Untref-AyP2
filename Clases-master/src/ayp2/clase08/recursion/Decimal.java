package ayp2.clase08.recursion;

public class Decimal {

	public static void imprimirDecimal(int n) {
		if (n >= 10) {
			imprimirDecimal(n / 10);
		}

		System.out.print(n % 10);
	}

	private static final String DIGIT_TABLE = "0123456789abcdef";

	public static void imprimirEnBase(int n, int base) {
		if (n >= base) {
			imprimirEnBase(n / base, base);
		}

		System.out.print(DIGIT_TABLE.charAt(n % base));
	}

	public static void main(String[] args) {
		imprimirDecimal(127);
		System.out.println();
		imprimirEnBase(123, 2);
		System.out.println();
		imprimirEnBase(123, 8);
		System.out.println();
		imprimirEnBase(123, 16);
	}
}
