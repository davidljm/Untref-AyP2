import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NumerosEncontrados {

	public static void main(String[] args) {
		NumerosEncontrados ej3 = new NumerosEncontrados();
		System.out.println(ej3.contarNumerosDelArchivo());
	}

	public int contarNumerosDelArchivo() {
		int counter = 0;
		BufferedReader fr = null;
		try {
			fr = new BufferedReader(new FileReader("prueba.txt"));
			String linea = fr.readLine();
			while (linea != null) {
				StringTokenizer st = new StringTokenizer(linea);
				while (st.hasMoreTokens()) {
					String palabras = st.nextToken();
					try {
						Integer.parseInt(palabras);

						counter++;
					} catch (NumberFormatException nfe) {

					}

				}

				linea = fr.readLine();
			}

		} catch (IOException e) {
			System.err.println("ha ocurrido un error con el archivo");
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e2) {
				System.err.println("ha ocurrido un error al cerrar el archivo");
			}
		}
		return counter;

	}
}