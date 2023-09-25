package tiendaDeMateriales;

public class LadrilloHueco implements Vendible {
	private static final int UNIDADES_DE_VENTA = 10;
	private int stock;
	private TipoLadrilloHueco tipo;

	public LadrilloHueco(int stock, TipoLadrilloHueco tipo) {
		hayStock();
		this.stock = stock;
		this.tipo = tipo;
	}

	@Override
	public void vender() {
		stock -= LadrilloHueco.UNIDADES_DE_VENTA;
	}

	@Override
	public String toString() {

		return "LadrilloHueco" + "," + tipo + "," + stock;
	}

	@Override
	public boolean hayStock() {

		return (this.stock > 0);

	}
}