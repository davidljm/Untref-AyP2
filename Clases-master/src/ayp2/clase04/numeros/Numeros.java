package ayp2.clase04.numeros;

public class Numeros {

	public static void main(String[] args) {
		int[] lista = new int[5];

		try {
			for (int i = 0; i < 8; i++) {
				lista[i] = i + 2;
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println(e);
		} finally {
			System.out.println("Esto se imprime siempre");
		}
	}

}