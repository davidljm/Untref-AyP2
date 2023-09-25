package ayp2.clase08.recursion;

public class Palindromo {

	public static boolean esPalindromo(String texto) {
		if (texto.length() <= 1) {
			return true;
		}

		char primero = texto.charAt(0);
		char ultimo = texto.charAt(texto.length() - 1);

		String interior = removerExtremos(texto);

		return (primero == ultimo) && esPalindromo(interior);
	}

	private static String removerExtremos(String texto) {
		return texto.substring(1, texto.length() - 1);
	}

}
