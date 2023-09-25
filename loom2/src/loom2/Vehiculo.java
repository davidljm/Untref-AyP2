package loom2;

public abstract class Vehiculo implements RecargarCombustible {
	/*
	 * Existen dos tipos de veh�culos: las motocicletas, que llevan un chofer y un
	 * acompa�ante, y los autobuses, que llevan un chofer y varios pasajeros. Los
	 * veh�culos deben conocer la cantidad de kil�metros recorridos(se debe poder
	 * actualizar ese valor), asignar y cambiar chofer. Cada veh�culo particular
	 * deber� poder agregar un acompa�ante o diversos pasajeros, respectivamente. En
	 * caso del Autob�s, no puede cambiar de chofer si hubiera pasajeros. En el caso
	 * de la Motocicleta, no puede hacerlo si hubiera un acompa�ante. Ademas de todo
	 * lo mencionado anteriormente todos los veh�culos llevan un registro de su
	 * nivel de combustible y su nivel m�ximo(cada veh�culo debe tener distinto
	 * nivel y m�ximo de combustible), agregar al c�digo realizado, una clase o
	 * interfaz para recargar el combustible de un veh�culo. Cada veh�culo por
	 * kil�metro recorrido consume 2 litros de combustible
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