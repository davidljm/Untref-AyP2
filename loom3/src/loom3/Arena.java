package loom3;


public class Arena implements Vendible {
	private static final double VOLUMEN_DE_VENTA = 1.25;
	private double stock;
	private TipoArena tipo;

	public Arena(double stock, TipoArena tipo) throws  tipoNoValidoException {
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

//	private void validarStock(double stock) throws stockNoValidoException {
//		if ((stock < VOLUMEN_DE_VENTA)) {
//			throw new stockNoValidoException("el stock debe ser mayor o igual a 1.25");
//		}
//	}
//
//	private void validarTipo(TipoArena tipo) throws IllegalArgumentException {
//		if (tipo.equals("FINA") || tipo.equals("GRUESA") || tipo.equals("MEDIA")) {
//			throw new IllegalArgumentException("el tipo de Arena es, FINA, GRUESA, MEDIA");
//		}

//	}
}