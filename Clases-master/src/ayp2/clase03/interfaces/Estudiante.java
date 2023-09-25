package ayp2.clase03.interfaces;

public class Estudiante implements Comparable<Estudiante> {
	private String nombre;
	private int legajo;
	private int nota;

	public Estudiante(String nombre, int legajo, int nota) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.nota = nota;
	}

	public String toString() {
		return "Nombre: " + nombre + "\tLegajo: " + legajo + "\tNota: " + nota;
	}

	@Override
	public int compareTo(Estudiante other) {
		if (this.nota < other.nota) {
			return -1;
		} else if (this.nota > other.nota) {
			return 1;
		}
		return this.nombre.compareTo(other.nombre);
	}
}
