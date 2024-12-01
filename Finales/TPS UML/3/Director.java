public class Director extends Trabajador {
    
    public Director(){}
    public Director(String nombre, String apellido, String fecha, int dni){
        super(nombre, apellido, fecha, dni);
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Este es un productor con las siguientes carateristicas:\n"+
        "Nombre: %s\nApellido: %s\nFecha de nacimiento: %s\nDNI: %d\n", super.getNombre(),
        super.getApellido(), super.getFechaNacimiento(), super.getDNI());
    }

    public void dirigir(String guion, Pelicula peliculaCruda){
        System.out.printf("El director dirige la pelicula: %s,"+
        "de acuerdo al siguiente guion:\n%s\n", peliculaCruda.getNombre(), guion);
    }
}
