package ayp2.clase01.tests.calculadora;

public class Calculadora {
	private int resultado = 0;

	public void sumar(int valor) {
		resultado += valor;
	}

	public int obtenerResultado() {
		return resultado;
	}

	public void borrarMemoria() {
		resultado = 0;
	}
}
