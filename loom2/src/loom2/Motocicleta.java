package loom2;

public class Motocicleta extends Vehiculo {

	public Persona acompanante;

	public Motocicleta(double capacidadTanque, double nivelTanqueActual) {
		super(capacidadTanque, nivelTanqueActual);
	}

	public String getAcompanante() {
		return acompanante.getNombre();

	}

	@Override
	public boolean hayAPasajeros() {

		return this.getAcompanante() != null;
	}

	@Override
	public void vaciarVehiculo() {
		if(!this.hayAPasajeros())
			throw new Error ("No hay pasajeros");
		System.out.println("Vehiculo sin acompañante");
		acompanante.setNombre(null);
	}

}