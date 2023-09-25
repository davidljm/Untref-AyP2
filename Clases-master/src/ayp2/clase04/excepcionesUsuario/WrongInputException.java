package ayp2.clase04.excepcionesUsuario;

public class WrongInputException extends Exception {

	private static final long serialVersionUID = 1L;

	WrongInputException(String message) {
		super(message);
	}
}
