package loom2;

public class App {

	public static void main(String[] args) {
		Autobus volvo = new Autobus(80, 30, 5);
		volvo.setChofer(new Persona("Andres"));
		volvo.getChofer();
		System.out.println("Cantidad actual de ocupantes: " + volvo.getCantidadActualPasajeros());
		volvo.setPasajeros("Pedro");
		System.out.println("Cantidad actual de ocupantes: " + volvo.getCantidadActualPasajeros());
		volvo.getNombrePasajeros();
		volvo.setPasajeros("Carlos");
		volvo.setPasajeros("Ana");
		System.out.println("Cantidad actual de ocupantes: " + volvo.getCantidadActualPasajeros());
		volvo.getNombrePasajeros();
		volvo.vaciarVehiculo();
		System.out.println("Cantidad actual de ocupantes: " + volvo.getCantidadActualPasajeros());
		volvo.getChofer();
		volvo.cambiarChofer(new Persona("Mario"));
		volvo.getChofer();
		System.out.println("Nivel combustible actual: " + volvo.getCombustible() + " litros");
		volvo.cargar();
		System.out.println("Nivel combustible actual: " + volvo.getCombustible() + " Litros");
		System.out.println("Cantidad de kilometros que puede recorrer: " + volvo.getCantidadKmRecorridos() + " km");
		System.out.println("Cantidad actual de ocupantes: " + volvo.getCantidadActualPasajeros());
		volvo.setPasajeros("Andrea");
		volvo.getNombrePasajeros();
		System.out.println("Cantidad actual de ocupantes: " + volvo.getCantidadActualPasajeros());
		volvo.setPasajeros("Ruth");
		volvo.setPasajeros("Kevin");
		volvo.setPasajeros("David");
		volvo.setPasajeros("Alan");
		volvo.getNombrePasajeros();
		System.out.println("Cantidad actual de ocupantes: " + volvo.getCantidadActualPasajeros());
		volvo.vaciarVehiculo();
		System.out.println("Cantidad actual de ocupantes: " + volvo.getCantidadActualPasajeros());
		volvo.vaciarVehiculo(); // error al querer vaciar el vehiculo ya que no tiene ocupantes
		volvo.setPasajeros("Gaspar");
		volvo.cambiarChofer(new Persona("Mauricio")); // (error al cambiar chofer porque tiene pasajeros)
		volvo.getChofer();

		// -------------------------------CARGA MOTOCICLETA--------------------------------------------

		Motocicleta jawa = new Motocicleta(15, 8);
		jawa.setChofer(new Persona("Rossi"));
		jawa.getChofer();
		jawa.acompanante = new Persona("Rojo");
		System.out.println("Nombre Acompañante: " + jawa.getAcompanante());
		jawa.acompanante = new Persona("Izquierdoz");
		System.out.println("Nombre Acompañante: " + jawa.getAcompanante());
		jawa.vaciarVehiculo();
		jawa.cambiarChofer(new Persona("Vazquez"));
		jawa.getChofer();
		jawa.acompanante = new Persona("Zeballos");
		System.out.println("Nombre Acompañante: " + jawa.getAcompanante());
		System.out.println("nivel combustible actual: " + jawa.getCombustible() + " Litros");
		jawa.cargar();
		System.out.println("nivel combustible actual: " + jawa.getCombustible() + " Litros");
		System.out.println("cantidad de kilometros que puede recorrer: " + jawa.getCantidadKmRecorridos() + " km");
		
	
	}

}
