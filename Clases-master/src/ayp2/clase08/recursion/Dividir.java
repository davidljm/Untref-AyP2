package ayp2.clase08.recursion;

public class Dividir {
	/***
	 * Escribir un método recursivo que devuelva el cociente y el resto 
	 * de la división entera mediante restas sucesivas.
	 * precondicion: el divisor no puede ser 0
	 * @param dividendo
	 * @param divisor
	 * @return Objeto de la clase DivisorYResto que tiene dos atributos, cociente y resto
	 */
	public static DivisorYResto dividir (int dividendo, int divisor) {
		DivisorYResto cyr = new DivisorYResto();
		DivisorYResto cyrAux;
		if (divisor == 0) {
			throw new ArithmeticException("Division por Cero");
		}
		if (dividendo < divisor) {
			cyr.setResto(dividendo);
			cyr.setCociente(0);
			return cyr;
		}
		
		cyrAux = dividir(dividendo-divisor, divisor);
		cyr.setCociente(1+cyrAux.getCociente());
		cyr.setResto(cyrAux.getResto());
		
		return cyr;
	}

	public static void main(String[] args) {
		DivisorYResto aux;
		
		aux = Dividir.dividir(17, 3);
		
		System.out.println("cociente: " + aux.getCociente());
		System.out.println("resto: " + aux.getResto());
	}
}
