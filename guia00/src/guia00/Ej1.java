package guia00;

public class Ej1 {
	public int numero;
	public int contador;
	public boolean esPrimo = false;

	public boolean esPrimo(int numero) {

		for (int i = 1; i <= numero; i++) {
			if ((numero % i) == 0) {
				contador++;
			}
		}

		if (contador == 2) {
			esPrimo = true;
		} else {
			esPrimo = false;
		}

		return esPrimo;
	}
}
