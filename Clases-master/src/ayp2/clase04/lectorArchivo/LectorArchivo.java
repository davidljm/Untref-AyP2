package ayp2.clase04.lectorArchivo;

import java.io.BufferedReader;
import java.io.FileReader;

public class LectorArchivo {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("No se ha especificado ningún archivo.");
		}
		for (int i = 0; i < args.length; i++) {
			imprimirArchivo(args[i]);
		}
	}

	public static void imprimirArchivo(String fileName) {
		System.out.println("FILE: " + fileName);

		try {
			FileReader archivo = new FileReader(fileName);
			BufferedReader lector = new BufferedReader(archivo);
			String oneLine;
			while ((oneLine = lector.readLine()) != null) {
				System.out.println(oneLine);
			}
			if (lector != null) {
				lector.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
