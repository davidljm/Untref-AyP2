package ayp2.clase02.polimorfismo;

public class Estudiante extends Persona {

    private double promedio;

    public Estudiante(String nombre, int edad, String direccion, String telefono, double promedio) {
        super(nombre, edad, direccion, telefono);
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + promedio;
    }
}