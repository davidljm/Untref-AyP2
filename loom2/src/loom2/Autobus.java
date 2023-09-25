package loom2;

public class Autobus extends Vehiculo {
	private Persona[] pasajeros;
	private int cantidadActualPasajeros;
	private int maximaCantidadDePasajeros;

	public Autobus(double capacidadTanque, double nivelTanqueActual, int maximaCantidadDePasajeros) {
		super(capacidadTanque, nivelTanqueActual);
		this.maximaCantidadDePasajeros = maximaCantidadDePasajeros;
		this.cantidadActualPasajeros = 0;
		this.pasajeros = new Persona[this.maximaCantidadDePasajeros];
	}

	public int getCantidadActualPasajeros() {
		return this.cantidadActualPasajeros;
	}

	public void setPasajeros(String nombre) {
		if (!this.hayLugar())
			throw new Error("No hay lugar.");
		this.pasajeros[cantidadActualPasajeros] = new Persona(nombre);
		this.setCantidadActualAPasajeros(this.cantidadActualPasajeros + 1);
		System.out.println("Se agrego un pasajero");
	}

	public void getNombrePasajeros() {
		if (!this.hayAPasajeros())
			throw new Error("No hay pasajeros");
		for (int i = 0; i < this.cantidadActualPasajeros; i++) {
			System.out.println("Nombres Pasajeros/as: " + this.pasajeros[i].getNombre());
		}

	}

	@Override
	public boolean hayAPasajeros() {
		return this.cantidadActualPasajeros > 0;
	}

	private void setCantidadActualAPasajeros(int i) {
		this.cantidadActualPasajeros = i;
	}

	private Boolean hayLugar() {
		if (this.cantidadActualPasajeros < this.maximaCantidadDePasajeros)
			return Boolean.TRUE;
		return Boolean.FALSE;

	}

	@Override
	public void vaciarVehiculo() {
		if(!this.hayAPasajeros())
			throw new Error ("No hay pasajeros");
		for (int i = 0; i < this.cantidadActualPasajeros; i++) {
			this.pasajeros[i].setNombre(null);
		}
		this.cantidadActualPasajeros = 0;
	}

}
