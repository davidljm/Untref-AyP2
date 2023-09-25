import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class union {
	public <T> List<T> union(List<T> a, List<T> b) {
		List<T> salida = new ArrayList<T>();
		ListIterator<T> itr = a.listIterator();
		while (itr.hasNext()) {
			T aux = itr.next();
			if (!b.contains(aux)) {
				salida.add(aux);
			}
		}
		return salida;

	}
}
