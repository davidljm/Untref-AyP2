package ayp2.clase04.excepcionesUsuario;

public class InputDemo {

	public static void main(String[] args) {
		try {
			new Input().method();
		} catch (WrongInputException wie) {
			System.err.println(wie.getMessage());
		}
	}

}
