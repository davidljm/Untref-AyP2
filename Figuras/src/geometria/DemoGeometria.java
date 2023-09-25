package geometria;

public class DemoGeometria {

	public static void main(String[] args) {
		Figuras[] figuras = new Figuras[10];
		figuras[0] = new Cuadrado("Cuadrado", 5);
		figuras[1] = new Circulo("Circulo", 1);
		figuras[2] = new Cuadrado("Cuadrado", 3);
		figuras[3] = new Rectangulo("Rectangulo", 2, 3);
		figuras[4] = new Elipse("Elipse", 1, 2);
		figuras[5] = new Triangulo("Triangulo", 2, 3);
		figuras[6] = new Cuadrado("Cuadrado", 2);
		figuras[7] = new Elipse("Elipse", 2, 3);
		figuras[8] = new Circulo("Circulo", 2);
		figuras[9] = new Rectangulo("Rectangulo", 1, 3);

		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i].toString());
		}

	}

}
