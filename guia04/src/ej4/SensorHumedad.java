package ej4;

public class SensorHumedad extends Sensores {
	int numeroDeMuestras = 0;

	public SensorHumedad(int cantidadMuestras) {
		super(cantidadMuestras);

	}

	@Override
	public void mostrarPorPantalla() {

		System.out.println("Humedad: " + this.valor.replace(".", ",") + "%");

	}

	@Override
	public double tomarMuestra(String valor) {
		this.valor = valor;
		double val = Double.parseDouble(valor);
		this.arraySensores[numeroDeMuestras] = val;
		numeroDeMuestras++;
		return val;
	}

	@Override
	public double conectar() {
		// TODO Auto-generated method stub
		return 0;
	}

}