package tiendaDeMateriales;

public class Arena implements Vendible {
	private static final double VOLUMEN_DE_VENTA = 1.25;
	private double stock;
	private TipoArena tipo;

	public Arena(double stock, TipoArena tipo) throws tipoNoValidoException {
		this.stock = stock;
		this.tipo = tipo;

	}

	@Override
	public void vender() {
		stock -= Arena.VOLUMEN_DE_VENTA;
	}

	@Override
	public String toString() {
		return "Arena" + "," + tipo + "," + stock;

	}

	@Override
	public boolean hayStock() {
		return (this.stock > 0.0);

	}

}