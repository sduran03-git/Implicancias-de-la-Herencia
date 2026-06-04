public abstract class Persona {

    protected final String nombre;
    protected final String rut;
    private final int edad;

    public Persona(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut    = rut;
        this.edad   = edad;
    }

    protected abstract String metodo();

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + "]";
    }
}