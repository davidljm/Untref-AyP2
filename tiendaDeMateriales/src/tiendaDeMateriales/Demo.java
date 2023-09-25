package tiendaDeMateriales;

import java.io.IOException;

public class Demo {

	public static void main(String[] args)
			throws IOException, ExcepcionNoHayArchivo, tipoNoValidoException, stockNegativoException {
		Inventario a = new Inventario();
		a.leerListaInventario();
		a.vender();
		a.stockActualizado();
		;

	}

}
