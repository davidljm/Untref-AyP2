package ayp2.clase15.patrones;

public interface Loggeable {
	/*
	 * Los mensaje se registran precedidos de WARNING: 
	 */
	public void warning(String msg);
	
	/*
	 * Los mensaje se registran precedidos de NOTICE: 
	 */
	public void notice(String msg);
	
	/*
	 * Los mensaje se registran precedidos de ERROR: 
	 */
	public void error(String msg);
	
	/*
	 * Los mensaje se registran sin ninguna etiqueta especial: 
	 */
	public void info(String msg);
	
	/*
	 * Muestra los mensaje de log
	 */
	public void show();
;}
