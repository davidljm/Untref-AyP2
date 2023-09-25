package ayp2.clase03.aves.solucionMejorada;

public class Pingüino extends Ave {
	public Pingüino() {
		setColor("Blanco y negro");
	}

	public String getColor() {
		return "El pingüino es de color " + super.getColor();
	}

	public String patinar() {
		return "Patinando sobre la panza";
	}

	@Override
	public String mover() {
		return "Caminar y nadar";
	}

}