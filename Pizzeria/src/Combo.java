import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {
	private List<Producto> productos = new ArrayList<Producto>();

	@Override
	public double getPrecio() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPrecio();

		}
		return total * 0.80;
	}

	public Combo(String nombre) {
		super(nombre);

	}

	public void addProducto(Producto producto) {
		productos.add(producto);

	}

	@Override
	public String toString() {
		String aux = super.getNombre() + "\n";
		for (Producto producto : productos) {
			aux += producto.toString() + "\n";
		}
		return aux;
	}

}
