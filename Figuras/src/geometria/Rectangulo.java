package geometria;

public class Rectangulo extends Figuras {
	private double ladoMenor;
	private double ladoMayor;

	public Rectangulo(String nombre, double ladoMenor, double ladoMayor) {
		super(nombre);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}

	@Override
	public double getArea() {
		return this.ladoMayor * this.ladoMenor;
	}

}
