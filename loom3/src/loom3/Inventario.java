package loom3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Inventario {

	List<Vendible> listaMateriales = new LinkedList<Vendible>();
	FileReader fr = null;
	BufferedReader br = null;

	/*
	 * Post: lee un archivo, y crea una lista de vendibles
	 */

	public List<Vendible> leerListaInventario() throws IOException, ExcepcionNoHayArchivo {

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			fr = new FileReader("EntradaMateriales.in");
			br = new BufferedReader(fr);
			// Lectura del fichero
			String linea = br.readLine();
			while ((linea != null)) {
				String[] datos;
				datos = linea.split(",");
				if (datos[0].equals("LadrilloHueco")) {
					try {
						listaMateriales.add(new LadrilloHueco(Integer.parseInt(datos[2].trim()),
								TipoLadrilloHueco.valueOf(datos[1].trim())));
					} catch (IllegalArgumentException e) {
						System.err.println("Error al leer archivo, tipo invalido, ingresaste " + datos[1].trim());

					}

				} else if (datos[0].equals("Arena")) {
					try {
						listaMateriales.add(
								new Arena(Double.parseDouble(datos[2].trim()), TipoArena.valueOf(datos[1].trim())));
					} catch (IllegalArgumentException e) {
						System.err.println("Error al leer archivo, tipo invalido, ingresaste " + datos[1].trim());

					}

				}
				linea = br.readLine();
			}
		} catch (IOException e) {

			throw new ExcepcionNoHayArchivo("no se puede leer el archivo de vendibles", e);

		} finally {

			// En el finaly cerramos el fichero, para asegurarnos
			// que el cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (fr != null) {
					fr.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return listaMateriales;
	}
	/*
	 * post: vende materiales si hay stock disponible
	 */

	public void vender() {
		for (Vendible vendible : listaMateriales) {
			if (vendible.hayStock() == true) {
				vendible.vender();
			}
		}
	}
	/*
	 * post crea un archivo, y guarda el stock actualizado (evitando los materiales
	 * con stock 0 o con tipo erroneo)
	 */

	public void escribirStockActualizado() throws IOException {
		FileWriter escrito = new FileWriter("SalidaMateriales.out");
		for (Vendible vendible : listaMateriales) {
			if (vendible.hayStock() == true) {
				escrito.write(vendible.toString() + "\n");

			}
		}
		escrito.close();
	}
}