package ayp2.clase15.patrones;

import java.util.EmptyStackException;
import java.util.Stack;

public class PilaConLoggerAdaptador <T>{
	private String nombre; //nombre de la pila, para el registro
	private Stack<T> pila;
	LoggerAdaptador logger = LoggerAdaptador.getInstance();
	
	public PilaConLoggerAdaptador (String pNombre){
		pila = new Stack<T>();
		nombre = pNombre;
		logger.notice("Creando la pila "+ nombre + "...");
	}
	
	public T desapilar(){
		T elemento = null;
		try {
			elemento = pila.pop();
			logger.info(nombre + " desapilando: " + elemento.toString());
		} catch (EmptyStackException e) {
			logger.warning(nombre + " pila vacia");
		}
		return elemento;
	}
	
	public T verTope(){
		T elemento = null;
		try {
			elemento = pila.peek();
		} catch (EmptyStackException e) {
			logger.warning(nombre + " pila vacia");
		}
		return elemento;
	}
	
	public void apilar(T elemento) {
		pila.push(elemento);
		logger.info(nombre + " apilando: " + elemento.toString());
	}
	
	public boolean pilaVacia() {
		return pila.isEmpty();
	}
}


