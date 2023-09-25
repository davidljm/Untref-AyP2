package ej4;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SensorCantidadLluvia extends Sensores {
	int numeroDeMuestras = 0;

	public SensorCantidadLluvia(int cantidadMuestras) {
		super(cantidadMuestras);

	}

	int cantidadMuestras = 0;

	@Override
	public double tomarMuestra(String valor) {
		double val = Double.parseDouble(valor);
		this.arraySensores[numeroDeMuestras] = val;
		numeroDeMuestras++;
		return val;
	}

	@Override
	public void mostrarPorPantalla() {
		NumberFormat nf = new DecimalFormat("##.###");
		System.out.println("Lluvia: " + nf.format(this.arraySensores[numeroDeMuestras - 1]) + " mm");
	}

	@Override
	public double conectar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
