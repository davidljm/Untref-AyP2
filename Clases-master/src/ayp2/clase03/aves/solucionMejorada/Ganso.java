package ayp2.clase03.aves.solucionMejorada;

public class Ganso extends Ave {

	public Ganso() {
		setColor("Gris");
	}

	@Override
	public String mover() {
		return "Nadar, caminar y volar";
	}
}
