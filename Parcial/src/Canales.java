import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Canales {

	public static Map<String, TreeSet<String>> listar(ArrayList<Programa> entrada) {
		Map<String, TreeSet<String>> salida = new TreeMap<String, TreeSet<String>>();

		for (Programa p : entrada) {
			if (salida.containsKey(p.getCanal())) {
				salida.get(p.getCanal()).add(p.getNombre());
			} else {
				TreeSet<String> programa = new TreeSet<String>();
				programa.add(p.getNombre());
				salida.put(p.getCanal(), programa);
			}
		}
		return salida;
	}

	public static void main(String[] args) {
		ArrayList<Programa> p = new ArrayList<Programa>();
		p.add(new Programa("Sony", "Grey Anatomy"));
		p.add(new Programa("Fox", "24"));
		p.add(new Programa("Sony", "Scandal"));
		p.add(new Programa("Fox", "The Simpson"));
		p.add(new Programa("Universar", "Dr. House"));
		System.out.println(p);
		System.out.println(Canales.listar(p));
	}

}

class Programa {
	private String canal;
	private String nombre;

	public Programa(String canal, String nombre) {
		super();
		this.canal = canal;
		this.nombre = nombre;
	}

	public String getCanal() {
		return canal;
	}

	public String getNombre() {
		return nombre;
	}

	public String toString() {
		return this.canal + " " + this.nombre;
	}

}