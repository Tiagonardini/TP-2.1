package clase;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String nombre() {
        return nombre;
    }

    public String apellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

    public boolean personaQueEmpiezaCon(String primeraLetraDelNombre) {
        return this.nombre.startsWith(primeraLetraDelNombre);
    }

    public boolean nombreCuyaCantidadDeLetrasEsPar() {
        return (nombre.length() % 2 == 0);
    }
}