package ayp2.clase15.patrones;

import java.util.Stack;
/*
 * Esta clase agrega un logger a la clase Stack provista por Java, para registrar cada una de las 
 * operaciones que se realizan sobre las pilas
 */
public class PilaConLogger <T>{
	private String nombre; //nombre de la pila, para el registro
	private Stack<T> pila;
	LoggerSingleton logger = LoggerSingleton.getInstance();
	
	public PilaConLogger (String pNombre){
		pila = new Stack<T>();
		nombre = pNombre;
		logger.log("Creando la pila "+ nombre + "...");
	}
	
	public T desapilar(){
		T elemento;
		elemento = pila.pop();
		logger.log(nombre + " desapilando: " + elemento.toString());
		return elemento;
	}
	
	public void apilar(T elemento) {
		pila.push(elemento);
		logger.log(nombre + " apilando: " + elemento.toString());
	}
	
	public boolean pilaVacia() {
		return pila.isEmpty();
	}
}
