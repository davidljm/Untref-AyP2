package tdd;

public class Ej4 {
	/*
	 * Cada nuevo termino de la secuencia de Fibonacci se genera sumando los dos
	 * terminos anteriores. Empezando por 1 y 2, los primeros 10 terminos seran: 1,
	 * 2, 3, 5, 8, 13, 21, 34, 55, 89, ... Considerando los t�rminos de la sucesion
	 * de Fibonacci cuyos valores no superan los cuatro millones, halle la suma de
	 * los terminos de valor par.
	 * 
	 * 
	 * public String paresDeFibonacci(int limite) {
	 * 
	 * String secuencia = ""; int valor1 = 1; int valor2 = 2;
	 * 
	 * while (limite > 0) {
	 * 
	 * if (limite % 2 == 0) {
	 * 
	 * secuencia = agregarString(secuencia, valor1); valor1 = valor2 + valor1;
	 * 
	 * } else { secuencia = agregarString(secuencia, valor2);
	 * 
	 * valor2 = valor1 + valor2; }
	 * 
	 * limite--; }
	 * 
	 * return secuencia; }
	 * 
	 * private String agregarString(String secuencia, int valor) { if (valor % 2 ==
	 * 0) { secuencia += valor + ", "; } return secuencia; }
	 */
	public int devolverSuma(int i) {
		if (i == 1) {
			return 0;
		}
		// valorIni|1|2   |3             |6
		// 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34
		int suma = 2;
		int j=3;
		
		while(fibo(j)<4000000 && j<=i) {
			
			if (fibo(j) % 2 == 0) {
				suma += fibo(j);
			}
			j++;
		}
		
		

		return suma;
	}

	private int fibo(int n) {
		if (n <= 2) {
			return n;
		}

		return fibo(n - 1) + fibo(n - 2);
	}
}

