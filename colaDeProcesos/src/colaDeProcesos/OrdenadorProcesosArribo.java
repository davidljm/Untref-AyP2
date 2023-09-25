package colaDeProcesos;

import java.util.Comparator;

public class OrdenadorProcesosArribo implements Comparator< Proceso> {

	@Override
	public int compare(Proceso pro1, Proceso pro2) {
		int tiempoArribo=0;
		if (pro1.getT_arribo() > pro2.getT_arribo()) {
			return 1;
		}
		else if (pro1.getT_arribo() < pro2.getT_arribo()) {
			return -1;
		}
		
		return tiempoArribo;
	}
	
}