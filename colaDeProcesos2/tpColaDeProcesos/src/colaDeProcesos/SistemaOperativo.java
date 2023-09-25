package colaDeProcesos;

import java.util.ArrayList;
import java.util.PriorityQueue;

import colaDeProcesos.Proceso.Estado;

public class SistemaOperativo {
	/**
	 * cola priorizadda por prioridad, a igual prioridad, prioriza por tiempo de
	 * arribo.
	 */
	private PriorityQueue<Proceso> colaProcesos = new PriorityQueue<Proceso>();
	/**
	 * cola priorizadda por tiempo de arribo.
	 */
	private PriorityQueue<Proceso> colaArribo;
	/**
	 * lista de procesos que fueron terminados de procesar.
	 */
	private ArrayList<Proceso> procesosSalida;
	private long tiempoProcesador;
	private Procesador procesador;

	/**
	 * @param colaArribo cola prorizada por tiempo de arribo
	 */
	public SistemaOperativo(PriorityQueue<Proceso> colaArribo) {
		this.tiempoProcesador = 0;
		this.colaArribo = colaArribo;
		this.procesosSalida = new ArrayList<Proceso>();
		this.procesador = new Procesador(procesosSalida);
	}
	
	/**
	 * Se ejecuta la simulacion durante el tiempo pasado como parametro, en cada
	 * ciclo, se desencola los procesos de la colaArribo segun si el tiempo de
	 * arribo coincide con el tiempo de proceso actual y se encola en colaProcesos
	 * solo si el proceso no esta terminado. Tambien si el procesador esta libre
	 * comienza a procesar un proceso de la colaProcesos. El procesador procesa en
	 * cada ciclo el proceso que tiene asignado.
	 * 
	 * @param tiempo duracion de la simulacion
	 */

	public void simular(long tiempo) {
		Proceso procesoActual = null;
		for (; tiempoProcesador <= tiempo; tiempoProcesador++) {
			while (!colaArribo.isEmpty() && colaArribo.peek().getTiempoDeArribo() == tiempoProcesador) {
						procesoActual = colaArribo.poll();
						if(procesoActual.getEstado()==Estado.LIBRE) {
						colaProcesos.add(procesoActual);	
					}
			}
		
			if (procesador.getStatus() == Procesador.Estado.LIBRE) {
				if (!colaProcesos.isEmpty()) {
					procesador.procesar(colaProcesos.poll());
				}
			}
			procesador.pulsoClock();
		}
	}

	public ArrayList<Proceso> listarProcesosSalida() {
		return procesosSalida;
	}

}
//if(colaArribo.peek().getTiempoDeArribo() == tiempoProcesador) {
//	procesosSalida.add(colaArribo.poll());
//   } else colaProcesos.add(procesoActual);