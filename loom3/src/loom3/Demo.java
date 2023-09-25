package loom3;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException, ExcepcionNoHayArchivo, tipoNoValidoException {
		Inventario a = new Inventario();
		a.leerListaInventario();
		a.vender();
		a.escribirStockActualizado();;

	}

}
