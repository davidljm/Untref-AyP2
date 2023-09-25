package guia05;

public class ErrorNotaInvalida extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ErrorNotaInvalida (){
		super("Valor de nota de examen incorrecto");
	}

}
