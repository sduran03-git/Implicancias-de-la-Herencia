public class EjemploHerencia {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
                "Ana González",
                "12.345.678-9",
                20,
                "Universitario",
                "Av. Francisco Salazar 01145, Temuco"
        );

        EstudianteDeportista deportista = new EstudianteDeportista(
                "Carlos Muñoz",
                "98.765.432-1",
                22,
                "Universitario",
                "Av. Francisco Salazar 01145, Temuco",
                "Atletismo",
                15
        );

        System.out.println("=== toString() ===");
        System.out.println(estudiante);
        System.out.println(deportista);

        System.out.println("\n=== metodo() ===");
        System.out.println(estudiante.metodo());
        System.out.println(deportista.metodo());

        System.out.println("\n=== Polimorfismo ===");
        Persona[] personas = { estudiante, deportista };
        for (Persona p : personas) {
            System.out.println(p.metodo());
        }
    }
}