public class App {
    public static void main(String[] args) throws Exception {
        // Crear un instructor
        Instructor fran = new Instructor("Fran", "Yoga", "08:00 - 10:00");

        // Crear clases
        Clase yoga = new Yoga(fran, 2, "10:00 AM"); // Clase con 2 cupos
        Instructor maria = new Instructor("Maria", "Musculación", "09:00 - 11:00");
        Clase musculacion = new Musculacion(maria, 3, "11:00 AM"); // Clase con 3 cupos
        Gimnasio gimnasio = new Gimnasio("New Gym");

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", 1, 25, "Mensual", gimnasio);
        Cliente cliente2 = new Cliente("Ana", 2, 30, "Semestral", gimnasio);
        Cliente cliente3 = new Cliente("Luis", 3, 35, "Mensual", gimnasio);
        Cliente cliente4 = new Cliente("Sara", 4, 18, "Anual", gimnasio);

        // Inscribir clientes en la clase de Yoga
        System.out.println("\n--- Inscripción en clase de Yoga ---");
        cliente1.agregarClase(yoga); // Clase añadida correctamente.
        cliente2.agregarClase(yoga); // Clase añadida correctamente.
        cliente3.agregarClase(yoga); // No hay cupo para esta clase.

        // Inscribir clientes en la clase de Musculación
        System.out.println("\n--- Inscripción en clase de Musculación ---");
        cliente1.agregarClase(musculacion); // Clase añadida correctamente.
        cliente3.agregarClase(musculacion); // Clase añadida correctamente.
        cliente4.agregarClase(musculacion); // Clase añadida correctamente.
        cliente2.agregarClase(musculacion); // No hay cupo para esta clase.

        // Mostrar información de las clases
        System.out.println("\n--- Información de la clase de Yoga ---");
        System.out.println("Cupo restante: " + yoga.getCupo());
        System.out.println("Clientes inscritos: " + yoga.getClientes());

        System.out.println("\n--- Información de la clase de Musculación ---");
        System.out.println("Cupo restante: " + musculacion.getCupo());
        System.out.println("Clientes inscritos: " + musculacion.getClientes());

        // Registrar asistencia de clientes
        System.out.println("\n--- Registro de asistencia ---");
        cliente1.registrarAsistencia(gimnasio);
        cliente2.registrarAsistencia(gimnasio);
        cliente3.registrarAsistencia(gimnasio);

        // Mostrar asistencia registrada en el gimnasio
        System.out.println("\n--- Asistencia registrada en el gimnasio ---");
        gimnasio.mostrarAsistencias();
    }
}
