package ayp2.clase02.bicicletas;

public class MountainBike extends Bicicleta {

	// Agrega un campo
	public int alturaAsiento;

	public MountainBike(int altura, int cadencia, int velocidad, int marcha) {
		super(cadencia, velocidad, marcha);
		this.alturaAsiento = altura;
	}

	// Agrega un método
	public void setAltura(int altura) {
		this.alturaAsiento = altura;
	}
}
