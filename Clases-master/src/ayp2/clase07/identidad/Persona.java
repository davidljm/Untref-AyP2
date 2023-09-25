package ayp2.clase07.identidad;

import java.util.Objects;

public class Persona {
	private String dni;
	private String nombre;

	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Persona)) {
			return false;
		}
		Persona otherPersona = (Persona) other;
		return Objects.equals(this.dni, otherPersona.dni);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
}
