import java.util.ArrayList;

public class Gimnasio {
    ArrayList<String> asistencia;
    String nombre;
    ArrayList<Clase> clasesDisponibles;

    public Gimnasio(String nombre) {
        this.asistencia = new ArrayList<String>();
        this.nombre = nombre;
        this.clasesDisponibles = new ArrayList<Clase>();
    }

    public void registrarAsistencia(Cliente cliente) {
        this.asistencia.add("Cliente ingreso: " + cliente);
    }

    public void mostrarAsistencias() {
        System.out.println(this.asistencia);
    }

    public void asignarInstructor(Instructor instructor, Clase clase) {
        clase.instructor = instructor;
        System.out.println("Instructor asignado con exito: " + instructor);
    }

    public void inscribirCliente(Cliente cliente, Clase clase) {
        cliente.agregarClase(clase);
    }

    public void calcularCosto(Cliente cliente) {
        switch (cliente.membresia) {
            case "Mensual":
                if (cliente.edad > 65 || cliente.edad < 18) {
                    System.out.println("Cuota mensual con descuento: $" + 12 * 0.8);
                } else {
                    System.out.println("Cuota mensual: $" + 12);
                }
                break;

            case "Semestral":
                if (cliente.edad > 65 || cliente.edad < 18) {
                    System.out.println("Cuota semestral con descuento: $" + (10 * 0.8));
                } else {
                    System.out.println("Cuota semestral: $" + 10);
                }
                break;

            case "Anual":
                if (cliente.edad > 65 || cliente.edad < 18) {
                    System.out.println("Cuota anual con descuento $:" + (8 * 0.8));
                } else {
                    System.out.println("Cuota anual $" + 8);
                }
                break;
        }
    }
}
