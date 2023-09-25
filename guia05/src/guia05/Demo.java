package guia05;

public class Demo {

	public static void main(String[] args) throws NullPointerException, ErrorNotaInvalida, ErrorNumeroDeLegajo {
		Examen examen = null;
		Examen examen2 = null;
		Examen examen3 = null;

		try {
			examen = new Examen(" 02-05-22", " Franco", 10500);
			examen.setNota(7);
			examen2 = new Examen(" 08-05-22", " David", 15000);
			examen2.setNota(15);
			examen3 = new Examen(" 06-05-22", " Nico", 12000);
			examen3.setNota(8);

		} catch (ErrorNotaInvalida e1) {
			System.err.println(e1);
		} catch (ErrorNumeroDeLegajo e2) {
			System.err.println(e2);
		} catch (NullPointerException e3) {
			System.err.println("Error variable vacia");
		}

		System.out.println(examen.toString());
		System.out.println(examen2.toString());
		System.out.println(examen3.toString());

	}

}
