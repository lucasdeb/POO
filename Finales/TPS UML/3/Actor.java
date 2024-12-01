import java.util.ArrayList;

public class Actor extends Trabajador {
    private ArrayList<Personaje> papeles;

    public Actor(){}
    public Actor(String nombre, String apellido, String fecha, int dni, ArrayList<Personaje> pjs){
        super(nombre, apellido, fecha, dni);
        this.papeles= pjs;
    }
    
    public ArrayList<Personaje> getPapeles() {
        return papeles;
    }
    public void setPapeles(ArrayList<Personaje> papeles) {
        this.papeles = papeles;
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Este es un productor con las siguientes carateristicas:\n"+
        "Nombre: %s\nApellido: %s\nFecha de nacimiento: %s\nDNI: %d\nLos personajes que intepreta son:\n",
        super.getNombre(), super.getApellido(), super.getFechaNacimiento(), super.getDNI());
        for (Personaje personaje : papeles) {
            System.out.println(personaje.getNombre());
        }
    }

    public void actuar(String guion){
        System.out.println("El actor interpreta el guion. Este dice:");
        System.out.println(guion);
    }
}
