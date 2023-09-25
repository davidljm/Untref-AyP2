import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaOrdenada {

	public List<Integer> listaOrdenada(List<Integer> a) {
		List<Integer> salida = new ArrayList<Integer>();
		Iterator<Integer> itr = a.iterator();
		Collections.sort(a);

		while (itr.hasNext()) {
			Integer aux = (Integer) itr.next();
			if (!a.contains(aux)) {
				salida.add(aux);
			}
		}
		return salida;

	}

}