package loom2;

public abstract class Vehiculo implements RecargarCombustible {
	/*
	 * Existen dos tipos de vehículos: las motocicletas, que llevan un chofer y un
	 * acompañante, y los autobuses, que llevan un chofer y varios pasajeros. Los
	 * vehículos deben conocer la cantidad de kilómetros recorridos(se debe poder
	 * actualizar ese valor), asignar y cambiar chofer. Cada vehículo particular
	 * deberá poder agregar un acompañante o diversos pasajeros, respectivamente. En
	 * caso del Autobús, no puede cambiar de chofer si hubiera pasajeros. En el caso
	 * de la Motocicleta, no puede hacerlo si hubiera un acompañante. Ademas de todo
	 * lo mencionado anteriormente todos los vehículos llevan un registro de su
	 * nivel de combustible y su nivel máximo(cada vehículo debe tener distinto
	 * nivel y máximo de combustible), agregar al código realizado, una clase o
	 * interfaz para recargar el combustible de un vehículo. Cada vehículo por
	 * kilómetro recorrido consume 2 litros de combustible
	 */

	private Persona chofer;
	private double cantKmRecorridos;
	private double capacidadDeTanque;
	private double nivelDeCombustible;
	private double combustibleACargar;
	public static final double consumoPorKilometro = 2;

	public Vehiculo(double capacidadDeTanque, double nivelDeCombustible) {
		this.capacidadDeTanque = capacidadDeTanque;
		this.nivelDeCombustible = nivelDeCombustible;

	}

	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}

	public void getChofer() {
		System.out.println("Chofer: " + this.chofer.getNombre());

	}

	public double getCombustible() {
		return this.nivelDeCombustible;

	}

	public void cargar() {
		combustibleACargar = this.capacidadDeTanque - this.getCombustible();
		this.nivelDeCombustible += this.combustibleACargar;
		System.out.println("Se carga " + this.combustibleACargar + " litros");
	}

	public abstract void vaciarVehiculo();

	public abstract boolean hayAPasajeros();

	public void cambiarChofer(Persona chofer) {
		if (this.hayAPasajeros())
			throw new Error("Hay pasajeros, no se puede cambiar el chofer.");
		System.out.println("Se cambio el chofer.");
		setChofer(chofer);
	}

	public double getCantidadKmRecorridos() {
		return (this.cantKmRecorridos += (this.getCombustible() / consumoPorKilometro));
	}

}