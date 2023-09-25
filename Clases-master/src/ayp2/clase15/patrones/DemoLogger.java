package ayp2.clase15.patrones;

/*
 * Demo para ver como funciona nuestro logger Singleton. Se crean dos pilas, y cada una registra
 * en el logger cada operación que se realiza sobre ella.
 * Al final se muestra el registro, donde se observa el orden en que se registró cada operación
 */
public class DemoLogger {
	public static void main(String[] args) {
		PilaConLogger <Integer> pila1 = new PilaConLogger<Integer>("P1");
		PilaConLogger <String> pila2 = new PilaConLogger<String>("P2");
		LoggerSingleton logger = LoggerSingleton.getInstance();
		
		pila1.apilar(1);pila2.apilar("uno");pila1.apilar(2);
		pila2.apilar("dos");pila1.apilar(3);pila2.apilar("tres");
		
		while(!pila1.pilaVacia()) {
			pila1.desapilar();
		}
		
		while(!pila2.pilaVacia()) {
			pila2.desapilar();
		}
		
		//pila1.desapilar();
		

		logger.verLog();
	}
}
