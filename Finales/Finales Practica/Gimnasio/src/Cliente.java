import java.util.ArrayList;

public class Cliente {
    String nombre;
    int Id;
    int edad;
    String membresia;
    Gimnasio gimnasio;
    ArrayList<Clase> clases;

    public Cliente(String nombre, int Id, int edad, String membresia, Gimnasio gimnasio) {
        this.nombre = nombre;
        this.Id = Id;
        this.edad = edad;
        this.membresia = membresia;
        this.gimnasio = gimnasio;
        this.clases = new ArrayList<Clase>();
    }

    public void getNombre(String nombre) {
        System.out.println(nombre);
    }

    public void getId(int Id) {
        System.out.println(Id);
    }

    public void getEdad(int edad) {
        System.out.println(edad);
    }

    public void getMembresia(String membresia) {
        System.out.println(membresia);
    }

    public void agregarClase(Clase clase) {
        this.clases.add(clase);
        clase.suscribirNuevoCliente(this);

    }

    public void registrarAsistencia(Gimnasio gimnasio) {
        this.gimnasio.registrarAsistencia(this);
    }

}
