package ayp2.clase04.excepcionesUsuario;

class Input {

	void method() throws WrongInputException {
		throw new WrongInputException("Wrong input");
	}
}
