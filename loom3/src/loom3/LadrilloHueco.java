package loom3;

public class LadrilloHueco implements Vendible {
	private static final int UNIDADES_DE_VENTA = 10;
	private int stock;
	private TipoLadrilloHueco tipo;

	public LadrilloHueco(int stock, TipoLadrilloHueco tipo) {
		this.stock = stock;
		this.tipo = tipo;
	}

	@Override
	public void vender() {
		stock -= LadrilloHueco.UNIDADES_DE_VENTA;
	}
	
	@Override
	public String toString() {
		return  "ladrilloHueco"+",tipo="+tipo+",stock="+stock;
 
	}

	@Override
	public boolean hayStock() {
		// TODO Auto-generated method stub
		return false;
	}

}