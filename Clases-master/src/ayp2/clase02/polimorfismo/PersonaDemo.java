package ayp2.clase02.polimorfismo;

class PersonaDemo {

	public static void main(String[] args) {
		Persona[] personas = new Persona[3];
		personas[0] = new Persona("Juan", 25, "Caseros", "15 4455 6666");
		personas[1] = new Estudiante("Ana", 20, "Santos Lugares", "15 4556 7777", 8.0);
		personas[2] = new Empleado("Pedro", 29, "CABA", "15 4000 3333", 7000.0);
		printAll(personas);
	}

	public static void printAll(Persona[] personas) {
		for (int i = 0; i < personas.length; i++)
			if (personas[i] != null)
				System.out.println("[" + i + "] " + personas[i]);
	}
}
