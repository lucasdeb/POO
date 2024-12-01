import java.util.Scanner;
import java.time.LocalDate;

public class CalculadoraEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su anio de nacimiento: ");
        int anioNacimiento = scanner.nextInt();
        int anioActual = LocalDate.now().getYear();
        int edad = anioActual - anioNacimiento;
        System.out.println("Su edad es: " + edad + " anios.");
    }
}
