package geometria;

public class Triangulo extends Figuras {
	private double base;
	private double altura;

	public Triangulo(String nombre, double base, double altura) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double getArea() {
		return (this.altura * this.base) / 2;
	}
}
