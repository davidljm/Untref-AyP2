package geometria;
import java.text.DecimalFormat;

public abstract class Figuras {
	private String nombre;
	DecimalFormat df = new DecimalFormat("#.00");

	public Figuras(String nombre) {
		this.nombre = nombre;
	}

	abstract public double getArea();

	final public String toString() {
		return "Area" + " " + nombre + ":" + " " + df.format(getArea());

	}
}
