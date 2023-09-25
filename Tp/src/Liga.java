import java.util.*;

public class Liga extends Competidor {

	private ArrayList<Competidor> competidores = new ArrayList<Competidor>();

	public Liga(TipoDeCompetidor tipo, String nombreLiga) {

		super(tipo, nombreLiga);

	}

	public void agregarCompetidor(Competidor competidor) throws NoSePuedeAgregarDistintosTiposDeCompetidoresException {

		if (super.getTipoDeCompetidor() != competidor.getTipoDeCompetidor()) {
			throw new NoSePuedeAgregarDistintosTiposDeCompetidoresException("El competidor no es del tipo de la Liga");

		}
		
		this.competidores.add(competidor);
		this.actualizarCaracteristica(competidor);

	}

	@Override
	protected double getValorCaracteristica(Caracteristica caracteristica) {

		return super.valorCaracteristicas[caracteristica.ordinal()] / competidores.size();
	}

	private void actualizarCaracteristica(Competidor competidor) {
		Caracteristica[] caracteristicas = Caracteristica.values();

		for (Caracteristica caracteristica : caracteristicas) {
			double valorCaracteristica = this.getValorCaracteristica(caracteristica)
					+ competidor.getValorCaracteristica(caracteristica);
			super.setValorCaracteristica(caracteristica.ordinal(), valorCaracteristica);

		}
	}
	
	
	public boolean esDelMismoTipo() {
		return this.competidores.get(0).esDelMismoTipo();
	}
	

}