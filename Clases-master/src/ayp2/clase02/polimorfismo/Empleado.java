package ayp2.clase02.polimorfismo;

public class Empleado extends Persona {

    private double sueldo;

    public Empleado(String nombre, int edad, String direccion, String telefono, double sueldo) {
        super(nombre, edad, direccion, telefono);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + sueldo;
    }
}