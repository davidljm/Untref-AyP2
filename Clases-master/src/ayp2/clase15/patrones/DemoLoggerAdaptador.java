package ayp2.clase15.patrones;

public class DemoLoggerAdaptador {
	public static void main(String[] args) {
		PilaConLoggerAdaptador <Integer> pila1 = new PilaConLoggerAdaptador<Integer>("P1");
		PilaConLoggerAdaptador <String> pila2 = new PilaConLoggerAdaptador<String>("P2");
		LoggerAdaptador logger = LoggerAdaptador.getInstance();
		
		pila1.apilar(1);pila2.apilar("uno");pila1.apilar(2);
		pila2.apilar("dos");pila1.apilar(3);pila2.apilar("tres");
		
		while(!pila1.pilaVacia()) {
			pila1.desapilar();
		}
		
		while(!pila2.pilaVacia()) {
			pila2.desapilar();
		}
		
		pila1.verTope();
		pila2.verTope();
		
		pila1.desapilar();
		pila2.desapilar();
		
		
		logger.show();
	}

}
