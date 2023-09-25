package ej4;

public class SensorTemperatura extends Sensores {
	int numeroDeMuestras = 0;
	String valor;

	public SensorTemperatura(int cantidadMuestras) {
		super(cantidadMuestras);
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
	public void mostrarPorPantalla() {

		System.out.println("Temperatura: " + this.valor.replace(".", ",") + " C°");
	}

	@Override
	public double conectar() {
		// TODO Auto-generated method stub
		return 0;
	}
}