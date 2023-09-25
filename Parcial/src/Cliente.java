import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String cuil;
	private Tipo tipoDeCliente;
	List<Double> factura =  new ArrayList<Double>();

	public Cliente(String cuil, Tipo tipoDeCliente) {
		this.cuil = cuil;
		this.tipoDeCliente = tipoDeCliente;

	}

	public void comprar() {
		

	}

	public double calcularFacturaTotal() {

	}

}
