import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class OrdenadorPorCaracteristica implements Comparator<Competidor> {
	private List<Caracteristica> caracteristicas = new ArrayList<Caracteristica>();
	private boolean orden;
	public OrdenadorPorCaracteristica(List<Caracteristica> caracteristicas, boolean orden) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public int compare(Competidor o1, Competidor o2) {
		int resultado = 0;
		Caracteristica caracteristica = null;
		Iterator <Caracteristica> itr = caracteristicas.iterator();
		while (itr.hasNext() && resultado == 0) {
			caracteristica = itr.next();
			resultado = Double.compare(o1.getValorCaracteristica(caracteristica), o2.getValorCaracteristica(caracteristica));
		}
		if (orden) {
			resultado *= -1;
		}
		return resultado;
	}
}
