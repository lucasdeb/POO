import java.util.Scanner;

public class Guionista extends Trabajador {
    
    public Guionista(){}
    public Guionista(String nombre, String apellido, String fecha, int dni){
        super(nombre, apellido, fecha, dni);
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("Este es un productor con las siguientes carateristicas:\n"+
        "Nombre: %s\nApellido: %s\nFecha de nacimiento: %s\nDNI: %d\n", super.getNombre(),
        super.getApellido(), super.getFechaNacimiento(), super.getDNI());
    }

    public String escribirGuion(){
        Scanner input= new Scanner(System.in);
        String guion= input.nextLine();
        return guion;
    }
}
