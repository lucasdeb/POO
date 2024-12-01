public class Editor extends Trabajador {
    
    public Editor(){}
    public Editor(String nombre, String apellido, String fecha, int dni){
        super(nombre, apellido, fecha, dni);
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Este es un productor con las siguientes carateristicas:\n"+
        "Nombre: %s\nApellido: %s\nFecha de nacimiento: %s\nDNI: %d\n", super.getNombre(),
        super.getApellido(), super.getFechaNacimiento(), super.getDNI());
    }

    public void editar(Pelicula peliculaCruda, int recorte){
        peliculaCruda.setDuracion(recorte);
        System.out.println("Se ha terminado de editar la cinta a una duracion de "+
        peliculaCruda.getDuracion());
    }
}
