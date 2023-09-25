public abstract class Competidor {

	private TipoDeCompetidor tipo;
	private String nombreFicticio;
	protected double[] valorCaracteristicas;

	public Competidor(TipoDeCompetidor tipo, String nombreFicticio) {

		this.tipo = tipo;
		this.nombreFicticio = nombreFicticio;
		this.valorCaracteristicas = new double[Caracteristica.values().length];
	}

	public String getNombreFicticio() {
		return nombreFicticio;
	}

	protected abstract double getValorCaracteristica(Caracteristica caracteristica);

	protected void setValorCaracteristica(int posicion, double valorCaracteristica) {

		this.valorCaracteristicas[posicion] = valorCaracteristica;

	}

	public TipoDeCompetidor getTipoDeCompetidor() {
		return this.tipo;
	}

	public boolean esGanador(Competidor competidor, Caracteristica caracteristica) {
		int cantDeComparaciones = 1;
		Caracteristica[] caracteristicas = Caracteristica.values();
		int maxComparaciones = caracteristicas.length;

		while (cantDeComparaciones <= maxComparaciones
				&& this.getValorCaracteristica(caracteristica) == competidor.getValorCaracteristica(caracteristica)) {
			cantDeComparaciones++;
			caracteristica = caracteristicas[(caracteristica.ordinal() + 1) % maxComparaciones];
		}

		return this.getValorCaracteristica(caracteristica) > competidor.getValorCaracteristica(caracteristica);

	}

	public boolean esDelMismoTipo() {
		return this.getTipoDeCompetidor().equals(getTipoDeCompetidor());
	}

}