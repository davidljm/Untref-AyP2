import java.util.Objects;

public class Personaje extends Competidor {
	
	private String nombreReal;

	public Personaje(TipoDeCompetidor tipo, String nombreReal, String nombreFicticio, double velocidad, double fuerza,
			double resistencia, double destreza) throws CaracteristicasEnNegativoException {

		super(tipo, nombreFicticio);
		// VERIFICAMOS SI LOS NUMEROS SON NEGATIVOS

		if (velocidad < 0 || fuerza < 0 || resistencia < 0 || destreza < 0) {

			throw new CaracteristicasEnNegativoException("Una o varias de las características está/n en negativo");
		}
		
		this.nombreReal = nombreReal;
		setValorCaracteristica(0, velocidad);
		setValorCaracteristica(1, fuerza);
		setValorCaracteristica(2, resistencia);
		setValorCaracteristica(3, destreza);

	}

	// DEVUELVE EL VALOR DE LA CARACTERISTICA SOLICITADA
	@Override
	protected double getValorCaracteristica(Caracteristica caracteristica) {

		return super.valorCaracteristicas[caracteristica.ordinal()];
	}

	@Override

	// DECLARAMOS QUE DOS OBJETOS DE TIPO PERSONAJE SON IGUALES SI SU NOMBRE
	// FICTICIO LO SON
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(super.getNombreFicticio(), other.getNombreFicticio());
	}

	public String getNombreReal() {
		return nombreReal;
	}

}