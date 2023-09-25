package ayp2.clase15.patrones;

import javax.swing.JOptionPane;

/*
 *  Clase Logger con fines didácticos para mostrar el patrón de diseño Singleton
 *  Según Wikipedia: En informática, se usa el término registro, log o historial de log para referirse
 *  a la grabación secuencial en un archivo o en una base de datos de todos los acontecimientos (eventos
 *  o acciones) que afectan a un proceso particular (aplicación, actividad de una red informática, etc.). 
 *  De esta forma constituye una evidencia del comportamiento del sistema.
 *  
 *  En nuestra clase de ejemplo no vamos a usar un archivo, vamos a agregar cada línea a un String, que 
 *  vamos a mostrar por pantalla, ya que el foco no está puesto en el desarrollo del logger en si, sino
 *  en el patrón de diseño Singleton
 */

public class LoggerSingleton {

	private static LoggerSingleton instancia;

	private int num; // para numerar cada entrada en el log
	private String log; // bitácora o registro, en un logger real debería ser un archivo o base de datos
	
	/*
	 * El constructor es privado, para poder controlar las instancias que se crean 
	 */
	private LoggerSingleton() {
		this.limpiar();
	}
	
	/*
	 * Este método estático nos va a permitir acceder a la única instancia del logger
	 * Nuestro logger es perezozo (hay otras formas de resolver un patrón singleton)
	 * ya que recién cuando se pide una instancia la crea si no lo hizo previamente
	 */
	public static LoggerSingleton getInstance() {
		if (instancia == null) {
			instancia = new LoggerSingleton();
		}		
		return instancia;
	}
	
	/*
	 * Método público que para que los usuarios del logger puedan registrar sus mensajes
	 */
	public void log(String msg) {
		log = log + num+": "+ msg+ "\n";
		num++;
	}
	
	@Override
	public String toString() {
		return log;
	}
	
	/*
	 * Método para limpiar el log, se usa para inicializar el log como un string vacío y 
	 * reiniciar la numeración de las líneas.
	 */
	public void limpiar() {
		this.log="";
		this.num = 0;
	}
	/*
	 * Muestra una ventana de diálogo con un mensaje tipo información 
	 * con el log registrado
	 */
	public void verLog() {
		JOptionPane.showMessageDialog(null, log, "Registro",1);		
	}
}


