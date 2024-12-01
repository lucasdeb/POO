import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Agencia agencia = new Agencia();
        // agencia.mostrarVehiculos();
        try {
            
            System.out.println("Ingrese la cantidad de personas que van a alquilar (2, 4 o 6): ");
            int cantidadPersonas = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Para la cantidad de personas, se necesita un vehiculo con capacidad de " + cantidadPersonas + " personas. Ingrese el codigo del vehiculo que desea alquilar: ");
            agencia.getVehiculosDisponibles(cantidadPersonas);
            String codigo = scanner.nextLine();
            
            System.out.println("Ingrese el nombre del chofer:");
            String nombreChofer = scanner.nextLine();
            System.out.println("Ingrese el apellido del chofer: ");
            String apellidoChofer = scanner.nextLine();
            System.out.println("Ingrese el dni del chofer: ");
            String dniChofer = scanner.nextLine();
            System.out.println("Ingrese el genero del chofer:");
            String generoChofer = scanner.nextLine();
            System.out.println("Ingrese la edad del chofer: ");
            int edadChofer = scanner.nextInt();
            scanner.nextLine();
            Chofer chofer = new Chofer(nombreChofer, apellidoChofer, dniChofer, generoChofer, edadChofer);
            ArrayList<Acompaniante> acompaniantes = new ArrayList<Acompaniante>();
            for (int i = 1; i < cantidadPersonas; i++) {
                System.out.println("Ingrese el nombre del acompaniante " + (i + 1) + ":");
                String nombreAcompaniante = scanner.nextLine();
                System.out.println("Ingrese el apellido del acompaniante " + (i + 1) + ":");
                String apellidoAcompaniante = scanner.nextLine();
                System.out.println("Ingrese el dni del acompaniante " + (i + 1) + ":");
                String dniAcompaniante = scanner.nextLine();
                System.out.println("Ingrese el genero del acompaniante " + (i + 1) + ":");
                String generoAcompaniante = scanner.nextLine();
                System.out.println("Ingrese la edad del acompaniante " + (i + 1) + ":");
                int edadAcompaniante = scanner.nextInt();
                scanner.nextLine();
                Acompaniante acompaniante = new Acompaniante(nombreAcompaniante, apellidoAcompaniante, dniAcompaniante, generoAcompaniante, edadAcompaniante);
                acompaniantes.add(acompaniante);
            }
            agencia.alquilarVehiculo(codigo,chofer, acompaniantes);
            agencia.mostrarVehiculos();

            System.out.println("Ingrese el codigo del vehiculo que desea devolver: ");
            codigo = scanner.nextLine();
            agencia.devolverVehiculo(codigo);
            agencia.mostrarVehiculos();

        } catch (InputMismatchException e){
            System.out.println("Error: Debe ingresar un numero");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
