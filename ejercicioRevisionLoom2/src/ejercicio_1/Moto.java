package ejercicio_1;

public class Moto extends Vehiculo implements Tanque_de_combustible {
	private Persona acompañante = null;

	public Moto(Persona chofer, double combustible, double max_combustible) {
		super(chofer, combustible, max_combustible);
	}

	public void agregarPersona(Persona pasajeroNuevo) {
		this.acompañante = pasajeroNuevo;
	}

	public void cambiarChofer(Persona choferNuevo) {
		if (this.acompañante == null) {
			this.chofer = choferNuevo;
		}
	}

	public void cargarCombustible(double combustible) {
		if (this.combustible + combustible <= this.max_combustible) {
			this.combustible = this.combustible + combustible;
		} else {
			this.combustible = this.max_combustible;
		}
	}

}
