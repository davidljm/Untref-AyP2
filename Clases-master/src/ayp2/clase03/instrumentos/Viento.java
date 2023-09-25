package ayp2.clase03.instrumentos;

public class Viento implements Instrumento {

	@Override
	public void tocar(String pieza) {
		System.out.println("Tocando la pieza " + pieza);
	}

	@Override
	public String queEs() {
		return "Instrumento de viento";
	}

	@Override
	public void afinar() {
		System.out.println("Afinando un instrumento de viento");
	}
}
