package tiendaDeMateriales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Inventario {

	List<Vendible> materialesList = new LinkedList<Vendible>();
	FileReader fr = null;
	BufferedReader br = null;

	/*
	 * Post: lee un archivo, y crea una lista de vendibles
	 */

	public List<Vendible> leerListaInventario() throws IOException, ExcepcionNoHayArchivo, stockNegativoException {

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			fr = new FileReader("src/entrada_de_materiales.in");
			br = new BufferedReader(fr);
			// Lectura del fichero
			String linea = br.readLine();
			while ((linea != null)) {
				String[] datos;
				datos = linea.split(",");
				if (datos[0].equals("LadrilloHueco")) {
					try {
						int stock = Integer.parseInt(datos[2].trim());
						stockNegativo(stock);
						materialesList.add(new LadrilloHueco(stock, TipoLadrilloHueco.valueOf(datos[1].trim())));
					} catch (stockNegativoException e) {
						System.err.println("Error, stock negativo ingresado, ingresaste ");

					} catch (IllegalArgumentException e2) {
						System.err.println("Error al leer archivo, tipo invalido, ingresaste " + datos[1].trim());

					}

				} else if (datos[0].equals("Arena")) {
					try {
						double stock = Double.parseDouble(datos[2].trim());
						stockNegativo(stock);
						materialesList.add(new Arena(stock, TipoArena.valueOf(datos[1].trim())));
					} catch (stockNegativoException e) {
						System.err.println("Error al leer archivo, tipo invalido, ingresaste ");

					} catch (IllegalArgumentException e2) {
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
		return materialesList;
	}
	/*
	 * post: vende materiales si hay stock disponible
	 */

	public void vender() {
		for (Vendible vendible : materialesList) {
			if (vendible.hayStock() == true) {
				vendible.vender();
			}
		}
	}
	/*
	 * post crea un archivo, y guarda el stock actualizado (evitando los materiales
	 * con stock 0 o con tipo erroneo)
	 */

	public void stockActualizado() throws IOException {
		FileWriter fw = new FileWriter("src/salida_de_materiales.out");
		for (Vendible vendible : materialesList) {
			if (vendible.hayStock() == true) {
				fw.write(vendible.toString() + "\n");

			}
		}
		fw.close();
	}

	public void stockNegativo(int stock) throws stockNegativoException {
		if (stock < 0) {
			System.err.println("Error al leer archivo, stock negativo ingresado");
		}

	}

	public void stockNegativo(double stock) throws stockNegativoException {
		if (stock < 0) {
			System.err.println("Error al leer archivo, stock negativo ingresado");
		}

	}

}