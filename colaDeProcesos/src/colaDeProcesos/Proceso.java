package colaDeProcesos;


public class Proceso implements Comparable<Proceso> {

	public enum Estado {
		ESPERA, FINALIZADO
	}

	/*
	 * Parametros:
	 */

	private String nombre;
	private Integer T_arribo;
	private final long T_ejecucion;
	private final Integer prioridad;
	private Estado status;

	public Proceso(String nombre, Integer T_arribo, Integer T_ejecucion, int prioridad) {

		this.T_ejecucion = T_ejecucion;
		this.setT_arribo(T_arribo);
		this.nombre = nombre;
		this.prioridad = prioridad;
		this.status = Estado.ESPERA;

	}

	/*
	 * @return devuelve el tiempo de ejecucion del proceso
	 */

	public long getT_ejecucion() {
		return T_ejecucion;
	}

	/*
	 * @pos: cambia el estado de proceso entre (ESPERA, FINALIZADO)
	 */

	public void setStatus(Estado estado) {
		this.status = estado;

	}

	/*
	 * @return devuelve el estado del proceso (ESPERA O FINALIZADO)
	 */

	public Estado getStatus() {
		return status;

	}

	/*
	 * @return devuelve el tiempo de arribo
	 */

	public Integer getT_arribo() {

		return T_arribo;
	}

	/*
	 * @pos cambia el tiempo de arrino
	 */

	public void setT_arribo(Integer t_arribo) {
		this.T_arribo = t_arribo;
	}
	/*
	 * @return devuelve nombre del proceso
	 */

	public String getNombre() {
		return nombre;
	}
	/*
	 * @pos cambia nombre de proceso por el indicado
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*
	 * @pos devuelve la prioridad
	 */

	public int getPrioridad() {
		return prioridad;
	}

	/*
	 * @pos compara el proceso por prioridad
	 */

	@Override
	public int compareTo(Proceso other) {

		if (this.prioridad == other.prioridad) {
			return this.T_arribo.compareTo(other.T_arribo);
		}

		return this.prioridad.compareTo(other.prioridad);
	}

}

