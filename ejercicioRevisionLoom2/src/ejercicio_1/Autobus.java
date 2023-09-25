package ejercicio_1;

import java.util.ArrayList;

public class Autobus extends Vehiculo implements Tanque_de_combustible{
	private ArrayList<Persona> pasajeros;

	public Autobus(Persona chofer, double combustible, double max_combustible) {
		super(chofer, combustible, max_combustible);
	}

	public void agregarPersona(Persona pasajeroNuevo) {
		this.pasajeros.add(pasajeroNuevo);
	}
	
	public void cambiarChofer(Persona choferNuevo) {
		if(this.pasajeros.isEmpty()) {
			this.chofer = choferNuevo;
		}
	}
	
	public void cargarCombustible(double combustible) {
		if(this.combustible + combustible <= this.max_combustible) {
			this.combustible = this.combustible + combustible;
		} else {
			this.combustible = this.max_combustible;
		}
	}
	
}
