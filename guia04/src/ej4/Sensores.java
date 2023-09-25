package ej4;

public abstract class Sensores {
	public String valor = "0";
	public int cantidadMuestras;
	double arraySensores[];

	public Sensores(int cantidadMuestras) {
		this.cantidadMuestras = cantidadMuestras;
		this.arraySensores = new double[cantidadMuestras];

	}

	public abstract double tomarMuestra(String valor);

	public abstract void mostrarPorPantalla();
	
	public abstract double conectar();

}
