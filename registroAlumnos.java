import java.util.Scanner;

public class registroAlumnos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int arrEdad[] = new int[100];
        String arrNom[] = new String[100];
        int i=0;

        System.out.print("Ingresar nombre del alumno: ");
        String nombre = input.nextLine();

        System.out.print("Ingresar edad del alumno: ");
        int edad = input.nextInt();


        while("salir".equals(nombre) == false){
            try {
                arrNom[i] = nombre;
                arrEdad[i] = edad;
            } catch (Exception e) {
                System.out.println("Cargaste mal los datos");
            }
            i+=1;
            System.out.print("Ingresar nombre del alumno: ");
            nombre = input.nextLine();

            System.out.print("Ingresar edad del alumno: ");
            edad = input.nextInt();
        }
    }
}
