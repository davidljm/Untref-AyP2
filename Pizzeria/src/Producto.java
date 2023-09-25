public abstract class Producto {
	private double precio;
	private String nombre;

	public Producto(String nombre, double precio) {
		this.precio = precio;
		this.nombre = nombre;

	}

	public Producto(String nombre) {
		this(nombre, 0);
	}

	@Override
	public String toString() {
		return "Producto: " + nombre + " Precio $" + getPrecio();
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {

		return this.nombre;
	}
}