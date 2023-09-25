package colaDeProcesos;

import java.util.Comparator;

public class OrdenadorProcesosArribo implements Comparator<Proceso> {

	@Override
	public int compare(Proceso o1, Proceso o2) {
		return o1.getTiempoDeArribo().compareTo(o2.getTiempoDeArribo()) ;
	}

}
