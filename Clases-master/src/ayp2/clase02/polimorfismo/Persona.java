package ayp2.clase02.polimorfismo;

public class Persona {

    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;

    public Persona(String nombre, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + ", " + edad + ", " + direccion + ", " + telefono;
    }
}