package ej4;

public class Demo {

	public static void main(String[] args) {
		Sensores a = new SensorTemperatura(4);
		a.tomarMuestra("20.5");
		a.mostrarPorPantalla();
		a.tomarMuestra("10.40");
		a.mostrarPorPantalla();
		a.tomarMuestra("15.30");
		a.mostrarPorPantalla();
		a.tomarMuestra("18.50");
		a.mostrarPorPantalla();
		Sensores b = new SensorHumedad(1);
		b.tomarMuestra("50.5");
		b.mostrarPorPantalla();
		a.mostrarPorPantalla();
		Sensores c = new SensorCantidadLluvia(4);
		c.tomarMuestra("55");
		c.mostrarPorPantalla();

	}

}
