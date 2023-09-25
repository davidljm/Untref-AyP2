package ayp2.clase03.aves.solucionIncorrecta;

public class Ave {
	String color;
	String tipo;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		if (this.tipo == "Ganso") {
			return color;
		} else if (this.tipo == "Pinguino") {
			return "El pingüino es de color " + color;
		}
		return "Tipo invalido";
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public String mover() {
		if (this.tipo == "Ganso") {
			return "Nadar, caminar y volar";
		} else if (this.tipo == "Pinguino") {
			return "Caminar y nadar";
		}
		return "Tipo invalido";
	}
}