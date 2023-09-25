package ayp2.clase15.patrones;

/*
 * Clase Logger que adapta el logger creado anteriormente a la nueva interfaz Loggeable
 * Importante: esta clase implementa los dos ayp2.clase15.patrones, por un lado SINGLETON y por otro
 * ADAPTER
 */
public class LoggerAdaptador implements Loggeable {
	
	private static LoggerAdaptador instancia; // para implementar Singleton
	
	private LoggerSingleton logger = LoggerSingleton.getInstance(); //logger legacy que vamos a adaptar
	
	/*
	 * Constructor privado
	 */
	private LoggerAdaptador() {
		logger.limpiar(); 
	}
	
	/*
	 * Acceso a la única instancia de LoggerAdptador
	 */
	public static LoggerAdaptador getInstance() {
		if (instancia == null) {
			instancia = new LoggerAdaptador();
		}		
		return instancia;
		
	};
	
	/*************************Implementación de la Interfaz Loggeable *********************************/
	/* 
	 * Todos los métodos delegan sus operaciones en LoggerSingleton
	 */
	@Override
	public void warning(String msg) {
		logger.log("WARNING: " + msg);
		
	}

	@Override
	public void notice(String msg) {
		logger.log("NOTICE: " + msg);
		
	}

	@Override
	public void error(String msg) {
		logger.log("ERROR: " + msg);
		
	}

	@Override
	public void info(String msg) {
		logger.log(msg);
		
	}
	
	@Override
	public void show() {
		logger.verLog();
	}

}
