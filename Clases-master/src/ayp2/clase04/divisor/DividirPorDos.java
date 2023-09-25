package ayp2.clase04.divisor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DividirPorDos {
	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Ingresar un número entero: ");

		try {
			int x = Integer.parseInt(in.readLine());
			System.out.println("La mitad de " + x + " es " + (x / 2));
		} catch (Exception excepcion) {
			System.err.println(excepcion);
		}
	}
}
