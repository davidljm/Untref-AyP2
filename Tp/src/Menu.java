import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	Map<Integer, Competidor> mapHeroes = new HashMap<Integer, Competidor>();
	Map<Integer, Liga> mapLigasHeroes = new HashMap<Integer, Liga>();
	Map<Integer, Competidor> mapVillanos = new HashMap<Integer, Competidor>();
	Map<Integer, Liga> mapLigasVillanos = new HashMap<Integer, Liga>();
	int indiceHeroes, indiceVillanos, indiceLigasHeroes, indiceLigasVillanos;
	ArrayList<Competidor> conjuntoDeCompetidores = new ArrayList<Competidor>();

	public static void main(String[] args) {
		Menu menu = new Menu();
		try {
			menu.cargarArchivoDeCompetidor("C:/Users/dmule/eclipse-workspace/Tp/personajes.in");
			menu.cargarArchivoDeLiga("C:/Users/dmule/eclipse-workspace/Tp/ligas.in");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		menu.menuPrincipal();

	}

	private void menuPrincipal() {

		int opcion = 0;
		do {
			try {
				System.out.println("\t.: Bienvenidos a Heroes y Villanos :.");
				System.out.println("1. Realizacion de combates.");
				System.out.println("2. Personajes que vencen al Personaje Elegido.");

				System.out.println("3. Salir del juego.");
				opcion = scanner.nextInt();
				switch (opcion) {
				case 1:
					menuCombates();
					break;

				case 2:
					menuDeVencedores();

					break;

				case 3:
					scanner.close();
					System.out.println("HAS SALIDO DEL JUEGO");
					System.exit(0);

				}

			} catch (IOException e) {
				System.err.println(" ==> Opcion invalida. Por favor vuelva a ingresar numero de opcion <==\n");
				scanner.next();
			}

		} while (opcion != 5);

	}

	private void menuCombates() throws IOException {

		int opcionCombate = 0;
		try {

			do {
				System.out.println("\n\t [ MENU DE COMBATE ]");
				System.out.println("1. Personaje vs Personaje");
				System.out.println("2. Personaje vs Liga");
				System.out.println("3. Liga vs Liga");
				System.out.println("4. <== Volver a menu anterior");

				opcionCombate = scanner.nextInt();
				switch (opcionCombate) {
				case 1:
					competirPersonajeVsPersonaje();
					break;
				case 2:
					menuLigaVsPersonaje();
					break;
				case 3:
					competirLigaVsLiga();
					break;
				case 4:
					menuPrincipal();
				}

			} while (opcionCombate != 4);
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	private void competirPersonajeVsPersonaje() throws IOException {

		{
			int nHeroe, nVillano;
			Caracteristica caracteristica = null;
			try {
				System.out.println("\n\t [ LISTADO DE HÃ‰ROES ]\n");
				mostrarHeroes();
				System.out.println("\n# Elegir HEROE:\n");
				nHeroe = scanner.nextInt();
				System.out.println("\n\t [ LISTADO DE VILLANOS ]\n");
				mostrarVillanos();
				System.out.println("\n# Elegir VILLANO: \n");
				nVillano = scanner.nextInt();
				System.out.println("\n# Elegir Caracter­stica para combatir: ");
				caracteristica = menuSeleccionarCaracteristica();
				combatirPersonajeVsPersonaje(nHeroe, nVillano, caracteristica);
			} catch (IOException e) {
				System.err.print("Datos Incorrectos");
			}

		}
	}

	private void competirLigaHeroeVsVillano() throws IOException {

		int nLigaHeroe, nVillano;
		Caracteristica caracteristica = null;
		try {

			mostrarLigasHeroes();
			System.out.println("\n# Elegir LIGA de HEROES:\n");
			nLigaHeroe = scanner.nextInt();
			System.out.println("\n\t [ LISTADO DE VILLANOS ]\n");
			mostrarVillanos();
			System.out.println("\n# Elegir VILLANO:\n");
			nVillano = scanner.nextInt();
			System.out.println("\n# Elegir Caracteristica para combatir: ");
			caracteristica = menuSeleccionarCaracteristica();
			combatirLigaDeHeroesVsVillano(nLigaHeroe, nVillano, caracteristica);
		} catch (IOException e) {
			System.err.print("Datos Incorrectos");
		}
		;
	}

	private void competirHeroeVsLigaDeVillano() throws IOException {

		int nHeroe, nLigaVillano;
		Caracteristica caracteristica = null;
		try {
			mostrarHeroes();
			System.out.println("\n# Elegir HEROE:\n");
			nHeroe = scanner.nextInt();
			mostrarLigasVillanos();
			System.out.println("\n# Elegir LIGA de VILLANOS:\n");
			nLigaVillano = scanner.nextInt();
			System.out.println("\n# Elegir Caracteristica para combatir: ");
			caracteristica = menuSeleccionarCaracteristica();
			combatirHeroeVsLigaDeVillano(nHeroe, nLigaVillano, caracteristica);
		} catch (IOException e) {
			System.err.print("Datos Incorrectos");
		}

	}

	private void competirLigaVsLiga() throws IOException {

		int nLigaHeroe, nLigaVillano;
		Caracteristica caracteristica = null;
		try {
			mostrarLigasHeroes();
			System.out.println("\n# Elegir LIGA de HEROES: \n");
			nLigaHeroe = scanner.nextInt();
			mostrarLigasVillanos();
			System.out.println("\n# Elegir LIGA de VILLANOS:\n");
			nLigaVillano = scanner.nextInt();
			System.out.println("\n# Elegir Caracteristica para combatir: ");
			caracteristica = menuSeleccionarCaracteristica();
			combatirLigaDeHeroeVsLigaDeVillano(nLigaHeroe, nLigaVillano, caracteristica);
		} catch (IOException e) {
			System.err.print("Datos Incorrectos");
		}

	}

	private Caracteristica menuSeleccionarCaracteristica() {
		Caracteristica caracteristica = null;

		int opcion = 0;
		System.out.println("-- Seleccione la CARACTERISTICA --");
		System.out.println("1. Velocidad");
		System.out.println("2. Fuerza");
		System.out.println("3. Resistencia");
		System.out.println("4. Destreza");
		System.out.println("5. Volver a Menu ");
		opcion = scanner.nextInt();
		switch (opcion) {
		case 1:
			caracteristica = Caracteristica.VELOCIDAD;
			System.out.println("-- La caracteristica seleccionada es: " + caracteristica + " --"); {
			break;
		}
		case 2:
			caracteristica = Caracteristica.FUERZA;
			System.out.println("-- La caracteristica seleccionada es: " + caracteristica + " --"); {
			break;
		}
		case 3:
			caracteristica = Caracteristica.RESISTENCIA;
			System.out.println("-- La caracteristica seleccionada es: " + caracteristica + " --"); {
			break;
		}
		case 4:
			caracteristica = Caracteristica.DESTREZA;
			System.out.println("-- La primer caracteristica seleccionada es: " + caracteristica + " --"); {
			break;
		}
		case 5:
			menuPrincipal();
		}

		return caracteristica;
	}

	private void combatirPersonajeVsPersonaje(int nHeroe, int nVillano, Caracteristica nCaracteristica)
			throws IOException {
		boolean resultado;
		resultado = buscarHeroe(nHeroe).esGanador(buscarVillano(nVillano), nCaracteristica);
		if (resultado) {
			System.out.println(
					"\n\t*** El Ganador del combate es: " + mapHeroes.get(nHeroe).getNombreFicticio() + " ***\n");
		} else {

			System.out.println("\n\t*** El Retador: " + mapHeroes.get(nHeroe).getNombreFicticio()
					+ " no pudo ganarle a " + mapVillanos.get(nVillano).getNombreFicticio());
		}
	}

	private void combatirLigaDeHeroesVsVillano(int nLigaHeroe, int nVillano, Caracteristica nCaracteristica)
			throws IOException {
		boolean resultado;
		resultado = buscarLigaHeroe(nLigaHeroe).esGanador(buscarVillano(nVillano), nCaracteristica);
		if (resultado) {
			System.out.println("\n\t*** El Ganador del combate es: "
					+ mapLigasHeroes.get(nLigaHeroe).getNombreFicticio() + " ***\n");
		} else {

			System.out.println("\n\t*** El Retador: " + mapLigasHeroes.get(nLigaHeroe).getNombreFicticio()
					+ " no pudo ganarle a " + mapVillanos.get(nVillano).getNombreFicticio());
		}
	}

	private void combatirHeroeVsLigaDeVillano(int nHeroe, int nLigaVillano, Caracteristica nCaracteristica)
			throws IOException {
		boolean resultado;
		resultado = buscarHeroe(nHeroe).esGanador(buscarLigaVillano(nLigaVillano), nCaracteristica);
		if (resultado) {
			System.out.println(
					"\n\t*** El Ganador del combate es: " + mapHeroes.get(nHeroe).getNombreFicticio() + " ***\n");
		} else {

			System.out.println("\n\t*** El Retador: " + mapHeroes.get(nHeroe).getNombreFicticio()
					+ " no pudo ganarle a " + mapLigasVillanos.get(nLigaVillano).getNombreFicticio());
		}
	}

	private void combatirLigaDeHeroeVsLigaDeVillano(int nLigaHeroe, int nLigaVillano, Caracteristica nCaracteristica)
			throws IOException {
		boolean resultado;
		resultado = buscarLigaHeroe(nLigaHeroe).esGanador(buscarLigaVillano(nLigaVillano), nCaracteristica);
		if (resultado) {
			System.out.println("\n\t*** El Ganador del combate es: "
					+ mapLigasHeroes.get(nLigaHeroe).getNombreFicticio() + " ***\n");
		} else {

			System.out.println("\n\t*** El Retador: " + mapLigasHeroes.get(nLigaHeroe).getNombreFicticio()
					+ " no pudo ganarle a " + mapLigasVillanos.get(nLigaVillano).getNombreFicticio());
		}
	}

	private void cargarArchivoDeCompetidor(String archivo) throws FileNotFoundException {
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea;
		try {

			while ((linea = lector.readLine()) != null) {

				linea = linea.trim();
				crearCompetidorCargadoPorArchivo(linea);

			}

		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				lector.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	private void cargarArchivoDeLiga(String archivo) throws FileNotFoundException {
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea;
		try {

			while ((linea = lector.readLine()) != null) {

				linea = linea.trim();
				crearLigaCargadaPorArchivo(linea);

			}

		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				lector.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	private void menuLigaVsPersonaje() throws IOException {

		int opcionML = 0;
		try {
			do {
				System.out.println("\n\t [ LIGA vs PERSONAJE ]");
				System.out.println("1. Liga Heroe vs Villano");
				System.out.println("2. Heroe vs Liga Villano");
				System.out.println("3. <== Volver a menu anterior");
				opcionML = scanner.nextInt();
				switch (opcionML) {
				case 1:
					competirLigaHeroeVsVillano();
					break;
				case 2:
					competirHeroeVsLigaDeVillano();
					break;
				case 3:
					break;
				}

			} while (opcionML != 3);
		} catch (IOException e) {
			System.err.println(e);
		}

	}

	private Competidor crearCompetidorCargadoPorArchivo(String linea) {

		Competidor competidor;
		String nombreReal, nombreFicticio;
		int valVelocidad, valFuerza, valResistencia, valDestreza;
		linea = linea.trim();

		String[] lineaLeida = linea.split(",");
		TipoDeCompetidor tipo = TipoDeCompetidor.valueOf(lineaLeida[0].toUpperCase());

		nombreReal = lineaLeida[1].trim();
		nombreFicticio = lineaLeida[2].trim();
		valVelocidad = Integer.parseInt((lineaLeida[3]).trim());
		valFuerza = Integer.parseInt((lineaLeida[4]).trim());
		valResistencia = Integer.parseInt((lineaLeida[5]).trim());
		valDestreza = Integer.parseInt((lineaLeida[6]).trim());

		if (lineaLeida[0].toUpperCase().equals("HEROE"))
			competidor = cargarHeroeEnMapa(tipo, nombreReal, nombreFicticio, valVelocidad, valFuerza, valResistencia,
					valDestreza);
		else
			competidor = cargarVillanoEnMapa(tipo, nombreReal, nombreFicticio, valVelocidad, valFuerza, valResistencia,
					valDestreza);

		conjuntoDeCompetidores.add(competidor);

		return competidor;
	}

	private Competidor cargarHeroeEnMapa(TipoDeCompetidor tipo, String nombreReal, String nombreFicticio,
			int valVelocidad, int valFuerza, int valResistencia, int valDestreza) {
		Competidor competidor = null;
		try {
			competidor = new Personaje(tipo, nombreReal, nombreFicticio, valVelocidad, valFuerza, valResistencia,
					valDestreza);
		} catch (CaracteristicasEnNegativoException e) {

			e.printStackTrace();
		}
		mapHeroes.put(indiceHeroes, competidor);
		indiceHeroes++;
		return competidor;
	}

	private Competidor cargarVillanoEnMapa(TipoDeCompetidor tipo, String nombreReal, String nombreFicticio,
			int valVelocidad, int valFuerza, int valResistencia, int valDestreza) {
		Competidor competidor = null;
		try {
			competidor = new Personaje(tipo, nombreReal, nombreFicticio, valVelocidad, valFuerza, valResistencia,
					valDestreza);
		} catch (CaracteristicasEnNegativoException e) {

			e.printStackTrace();
		}
		mapVillanos.put(indiceVillanos, competidor);
		indiceVillanos++;
		return competidor;
	}

	private Liga crearLigaCargadaPorArchivo(String linea) {

		Liga liga;

		linea = linea.trim();

		String[] lineaLeida = linea.split(",");

		TipoDeCompetidor tipo = TipoDeCompetidor.valueOf(lineaLeida[0].toUpperCase());

		String nombreLiga = lineaLeida[1].trim();

		liga = new Liga(tipo, nombreLiga);

		for (int i = 2; i < lineaLeida.length; i++) {

			String nombreFicticio = lineaLeida[i].trim();
			for (Competidor competidor : conjuntoDeCompetidores) {
				if (competidor.getNombreFicticio().equals(nombreFicticio))
					try {
						liga.agregarCompetidor(competidor);
					} catch (NoSePuedeAgregarDistintosTiposDeCompetidoresException e) {

						e.printStackTrace();
					}
			}
		}
		if (liga.esDelMismoTipo()) {
			mapLigasHeroes.put(indiceLigasHeroes, liga);
			indiceLigasHeroes++;
		} else {
			mapLigasVillanos.put(indiceLigasVillanos, liga);
			indiceLigasVillanos++;
		}
		conjuntoDeCompetidores.add(liga);

		return liga;
	}

	private void mostrarHeroes() {
		for (Entry<Integer, Competidor> competidor : mapHeroes.entrySet()) {
			System.out.println(competidor.getKey() + " -> " + competidor.getValue().getNombreFicticio());
		}
	}

	private void mostrarVillanos() {
		for (Entry<Integer, Competidor> competidor : mapVillanos.entrySet()) {
			System.out.println(competidor.getKey() + " --> " + competidor.getValue().getNombreFicticio());
		}
	}

	private void mostrarLigasHeroes() {
		System.out.println("\n\t [ LISTADO LIGAS DE HEROES ]\n");
		for (Entry<Integer, Liga> competidor : mapLigasHeroes.entrySet()) {
			System.out.println(competidor.getKey() + " --> " + competidor.getValue().getNombreFicticio());
		}
	}

	private void mostrarLigasVillanos() {
		System.out.println("\n\t [ LISTADO LIGAS DE VILLANOS ]\n");
		for (Entry<Integer, Liga> competidor : mapLigasVillanos.entrySet()) {
			System.out.println(competidor.getKey() + " --> " + competidor.getValue().getNombreFicticio());
		}
	}

	private Competidor buscarHeroe(int heroeBuscado) {
		return mapHeroes.get(heroeBuscado);
	}

	private Competidor buscarLigaHeroe(int heroeBuscado) {
		return mapLigasHeroes.get(heroeBuscado);
	}

	private Competidor buscarVillano(int villanoBuscado) {
		return mapVillanos.get(villanoBuscado);
	}

	private Competidor buscarLigaVillano(int villanoBuscado) {
		return mapLigasVillanos.get(villanoBuscado);
	}

	private void competidoresQueVenzanA(Competidor competidorAVencer, Caracteristica caracteristica) {
		System.out.println("\n Los siguientes competidores vencen a " + competidorAVencer.getNombreFicticio()
				+ " por la siguiente caracteristica " + caracteristica + ": \n");
		for (Competidor competidor : conjuntoDeCompetidores) {
			if (competidor.esGanador(competidorAVencer, caracteristica)) {
				System.out.println("-> " + competidor.getNombreFicticio());
			}
		}
	}

	private void menuDeVencedores() {

		Competidor competidorAVencer = null;
		Caracteristica caracteristica = null;
		int opcionML = 0;

		System.out.println("\n\t [Seleccionar Tipo de Competidor a Vencer]");
		System.out.println("1. Liga");
		System.out.println("2. Competidor");
		opcionML = scanner.nextInt();
		switch (opcionML) {
		case 1:
			competidorAVencer = seleccionarLiga(scanner);
			System.out.println("\n#- Liga seleccionada correctamente -#");
			caracteristica = menuSeleccionarCaracteristica();
			System.out.println("\n-- La caracteristica seleccionada es: " + caracteristica + " --");
			competidoresQueVenzanA(competidorAVencer, caracteristica);
			break;
		case 2:
			competidorAVencer = seleccionarCompetidor(scanner);
			System.out.println("\n#- Competidor seleccionado correctamente -#");
			System.out.println("\n-- Seleccione la caracteristica para empezar a combatir --");
			caracteristica = menuSeleccionarCaracteristica();
			System.out.println("\n-- La caracteristica seleccionada es: " + caracteristica + " --");
			competidoresQueVenzanA(competidorAVencer, caracteristica);
			break;
		case 3:
			break;
		}

	}

	private Competidor seleccionarLiga(Scanner menuDeVencedores) {
		Competidor competidorAVencer = null;
		int sbLiga = 0;

		System.out.println("\n\t [Seleccionar Tipo de Liga]");
		System.out.println("1. Liga de Heroes");
		System.out.println("2. Liga de Villanos");
		sbLiga = menuDeVencedores.nextInt();
		switch (sbLiga) {
		case 1:
			mostrarLigasHeroes();
			System.out.println("\n Indique Liga a Vencer (Indice): ");
			sbLiga = menuDeVencedores.nextInt();
			competidorAVencer = buscarLigaHeroe(sbLiga);
			break;
		case 2:
			mostrarLigasVillanos();
			System.out.println("\n Indique Liga a Vencer (Indice): ");
			sbLiga = menuDeVencedores.nextInt();
			competidorAVencer = buscarLigaVillano(sbLiga);
			break;
		}
		return competidorAVencer;
	}

	private Competidor seleccionarCompetidor(Scanner menuDeVencedores) {
		Competidor competidorAVencer = null;
		int sbCompetidor = 0;

		System.out.println("\n\t [Seleccionar Tipo de Competidor]");
		System.out.println("1. Heroe");
		System.out.println("2. Villano");
		sbCompetidor = menuDeVencedores.nextInt();
		switch (sbCompetidor) {
		case 1:
			mostrarHeroes();
			System.out.println("\n Indique Heroe a Vencer (Indice): ");
			sbCompetidor = menuDeVencedores.nextInt();
			competidorAVencer = buscarHeroe(sbCompetidor);
			break;
		case 2:
			mostrarVillanos();
			System.out.println("\n Indique Villano a Vencer (Indice): ");
			sbCompetidor = menuDeVencedores.nextInt();
			competidorAVencer = buscarVillano(sbCompetidor);
			break;
		case 3:
			break;
		}
		return competidorAVencer;

	}

}
