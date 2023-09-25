package ayp2.clase03.aves.solucionMejorada;

public class AvesDemo {

	public static void main(String[] args) {
		Ganso unGanso = new Ganso();
		Pingüino unPingüino = new Pingüino();

		Ave[] aves = new Ave[2];
		aves[0] = unGanso;
		aves[1] = unPingüino;

		for (int i = 0; i < aves.length; i++) {
			System.out.println(aves[i].getColor());
			System.out.println(aves[i].mover());
		}
	}
}
