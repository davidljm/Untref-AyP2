package ayp2.clase03.interfaces;

import java.util.Arrays;

public class CompararEstudiantesDemo {

	public static void main(String[] args) {
		Estudiante[] estudiantes = new Estudiante[4];
		estudiantes[0] = new Estudiante("Juan", 100, 10);
		estudiantes[1] = new Estudiante("Ana", 200, 10);
		estudiantes[2] = new Estudiante("Pedro", 25, 8);
		estudiantes[3] = new Estudiante("Sandra", 10, 9);

		Arrays.sort(estudiantes);

		for (int i = 0; i < estudiantes.length; i++) {
			System.out.println((estudiantes[i].toString()));
		}
	}
}
