public class Productor extends Trabajador {
    
    public Productor(){}
    public Productor(String nombre, String apellido, String fecha, int dni){
        super(nombre, apellido, fecha, dni);
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Este es un productor con las siguientes carateristicas:\n"+
        "Nombre: %s\nApellido: %s\nFecha de nacimiento: %s\nDNI: %d\n", super.getNombre(),
        super.getApellido(), super.getFechaNacimiento(), super.getDNI());
    }

    public Pelicula producir(String guion, String nombre, String sinopsis, int anioProduccion, int duracion, Genero genero){
        System.out.println("El productor entrega la cinta de acuerdo al siguiente guion:");
        System.out.println(guion);
        Pelicula pelicula= new Pelicula(nombre, sinopsis, anioProduccion, duracion, genero);
        return pelicula;
    }
}
