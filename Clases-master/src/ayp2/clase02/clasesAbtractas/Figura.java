package ayp2.clase02.clasesAbtractas;

public abstract class Figura {
	private String nombre;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	abstract public double area();

	abstract public double perimetro();

	final public boolean menorQue(Figura otraFigura) {
		return this.area() < otraFigura.area();
	}

	final public String toString() {
		return nombre + ", area=" + area() + ", perimetro=" + perimetro();
	}
}
