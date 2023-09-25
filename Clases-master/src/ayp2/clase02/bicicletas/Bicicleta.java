package ayp2.clase02.bicicletas;

public class Bicicleta {
	static String marca = "Trek";
	private int cadencia;
	private int velocidad = 0;
	private int marcha = 1;

	public Bicicleta(int cadencia, int velocidad, int marcha) {
		this.cadencia = cadencia;
		this.velocidad = velocidad;
		this.marcha = marcha;
	}

	public void setCadencia(int valor) {
		cadencia = valor;
	}

	public void setMarcha(int valor) {
		marcha = valor;
	}

	public void acelerar(int incremento) {
		velocidad = velocidad + incremento;
	}

	public void frenar(int decremento) {
		velocidad = velocidad - decremento;
	}

	public String toString() {
		return "cadencia:" + cadencia + " velocidad:" + velocidad + " marcha:" + marcha + " marca:" + marca;
	}
}
