import java.util.Scanner;

public class RegistroAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[8]; // Vector para almacenar nombres de alumnos
        int[] edades = new int[8]; // Vector para almacenar edades de alumnos
        int contadorAlumnos = 0;
        System.out.println("Registro de Alumnos - Ingrese 'salir' para finalizar.");
        while (true) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }
            try {
                System.out.print("Ingrese la edad del alumno: ");
                int edad = Integer.parseInt(scanner.nextLine());

                nombres[contadorAlumnos] = nombre;
                edades[contadorAlumnos] = edad;
                contadorAlumnos++;

                if (contadorAlumnos == 5) {
                    System.out.println("Se ha alcanzado el límite de registros (100).");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese una edad válida.");
            }
        }
        System.out.println("Lista de Alumnos Registrados:");
        for (int i = 0; i < contadorAlumnos; i++) {
            System.out.println((i + 1) + ". Nombre: " + nombres[i] + ", Edad: " + edades[i]);
        }
    }
}
