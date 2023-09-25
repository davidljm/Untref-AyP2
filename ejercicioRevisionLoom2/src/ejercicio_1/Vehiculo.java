package ejercicio_1;

public abstract class Vehiculo {
	protected int kilometros_recorridos;
	protected Persona chofer;
	public static int consumo_por_km = 2;
	protected double combustible;
	protected double max_combustible;

	public Vehiculo(Persona chofer, double combustible, double max_combustible) {
		this.chofer = chofer;
		this.combustible = combustible;
		this.max_combustible = max_combustible;
	}

	public abstract void agregarPersona(Persona pasajeroNuevo);

	public abstract void cambiarChofer(Persona choferNuevo);

	public final void setKilometrosRecorridos(int km) {
		if (!(combustible - this.max_combustible * km < 0)) {
			this.combustible = combustible - this.max_combustible * km;
			this.kilometros_recorridos = km;
		}
	}

	public final Persona getChofer() {
		return chofer;
	}

}
