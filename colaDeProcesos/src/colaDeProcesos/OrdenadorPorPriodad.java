package colaDeProcesos;

import java.util.Comparator;

public class OrdenadorPorPriodad implements Comparator<Proceso> {
	
	/*
	 * Implementa el metodo compareTo() de la clase proceso el cual compara por prioridad.
	 */

	@Override
	public int compare(Proceso p1, Proceso p2) {
		return p1.compareTo(p2);
	}

}