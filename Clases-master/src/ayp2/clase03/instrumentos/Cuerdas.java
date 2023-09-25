package ayp2.clase03.instrumentos;

public class Cuerdas implements Instrumento {

	@Override
	public void tocar(String pieza) {
		System.out.println("Tocando la pieza " + pieza);
	}

	@Override
	public String queEs() {
		return "Instrumento de cuerdas";
	}

	@Override
	public void afinar() {
		System.out.println("Afinando un instrumento de cuerdas");
	}
}
