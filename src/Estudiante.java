public class Estudiante extends Persona {

    protected final String nivelAcademico;
    protected final String direccionEscuela;

    public Estudiante(String nombre, String rut, int edad,
                      String nivelAcademico, String direccionEscuela) {
        super(nombre, rut, edad);
        this.nivelAcademico   = nivelAcademico;
        this.direccionEscuela = direccionEscuela;
    }

    @Override
    protected String metodo() {
        return "Soy un objeto de la clase Estudiante.";
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Estudiante [nivelAcademico=" + nivelAcademico +
                ", direccionEscuela=" + direccionEscuela + "]";
    }
}