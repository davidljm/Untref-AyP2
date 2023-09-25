package geometria;

public class Elipse extends Figuras {
	private double radioMenor;
	private double radioMayor;

	public Elipse(String nombre, double radioMenor, double radioMayor) {
		super(nombre);
		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;
	}

	@Override
	public double getArea() {
		return this.radioMayor * this.radioMenor * Math.PI;
	}
}
