package colaDeProcesos;

public class Proceso implements Comparable<Proceso> {
	public enum Estado {
		FINALIZADO, LIBRE;
	}
	private String proceso;
	private Integer tiempoDeArribo;
	private Integer tiempoDeEjecuccion;
	private Integer prioridad;
	private Estado estado;

	public Proceso(String proceso, int tiempoDeArribo, int tiempoDeEjecuccion, int prioridad) {
		this.proceso = proceso;
		this.estado = Estado.LIBRE;
		this.tiempoDeArribo = tiempoDeArribo;
		this.tiempoDeEjecuccion = tiempoDeEjecuccion;
		this.prioridad = prioridad;
	}

	@Override
	public int compareTo(Proceso other) {
		if (this.prioridad == other.prioridad)
			return this.tiempoDeArribo.compareTo(other.tiempoDeArribo);
		else return this.prioridad.compareTo(other.prioridad);
	}
	@Override
	public String toString() {
		return this.proceso;
	}

	public void setStatus(Estado estado) {
		this.estado = estado;
	}

	public Integer getTiempoDeArribo() {
		return this.tiempoDeArribo;
	}
	
	public int getPrioridad() {
		return prioridad;
	}

	public long getT_ejecucion() {
		return tiempoDeEjecuccion;
	}
	
	public Estado getEstado() {
		return this.estado;
	}

}
