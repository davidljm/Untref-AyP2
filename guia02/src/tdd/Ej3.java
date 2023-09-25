package tdd;

//Se desea utilizar la técnica de TDD para hallar el mayor de tres valores.
//La siguiente lista de casos conforman las sugerencias dadas por otros desarrolladores para realizar las pruebas.
//Lamentablemente,la lista contiene casos repetidos que no aportan información nueva.
//¿Podés identificar cuáles son los casos conceptualmente equivalentes?
//justificar cada uno de los casos seleccionados.


public class Ej3 {
	public int[] mayorMedioMenor(int a, int b, int c) {
		int[] v = new int[3];

		// v[0] mayor, v[1] medio, v[2] menor

		v[0] = mayor(mayor(a, b), c);
		v[2] = menor(menor(a, b), c);

		if (a < v[0] && a > v[2])
			v[1] = a;
		if (b < v[0] && b > v[2])
			v[1] = b;
		if (c < v[0] && c > v[2])
			v[1] = c;

		return v;
	}

	private int mayor(int a, int b) {
		if (a > b)
			return a;
		return b;
	}

	private int menor(int a, int b) {
		if (a < b)
			return a;
		return b;
	}

}
