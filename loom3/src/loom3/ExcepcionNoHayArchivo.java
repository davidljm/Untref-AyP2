package loom3;

public class ExcepcionNoHayArchivo extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionNoHayArchivo(String detalle, Exception causa) {

		super(detalle, causa);
	}
}