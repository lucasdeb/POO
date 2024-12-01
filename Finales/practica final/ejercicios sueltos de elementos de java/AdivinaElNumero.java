import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100 (ambos inclusive)
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("Bienvenido al juego Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. Adivina cuál es.");

        while (!adivinado) {
            int intento = solicitarNumeroAlUsuario(scanner);
            intentos++;

            if (intento == numeroAleatorio) {
                adivinado = true;
            } else if (intento < numeroAleatorio) {
                System.out.println("El número es mayor. Sigue intentando.");
            } else {
                System.out.println("El número es menor. Sigue intentando.");
            }
        }

        System.out.println("¡Felicidades! Adivinaste el número " + numeroAleatorio + " en " + intentos + " intentos.");
        scanner.close();
    }

    private static int solicitarNumeroAlUsuario(Scanner scanner) {
        int intento;
        while (true) {
            try {
                System.out.print("Ingresa tu intento: ");
                intento = scanner.nextInt();
                break; // Si se ingresa un número válido, salimos del bucle
            } catch (java.util.InputMismatchException e) {
                System.out.println("Debes ingresar un número válido. Inténtalo nuevamente.");
                scanner.nextLine(); // Limpia el búfer del scanner para evitar un bucle infinito
            }
        }
        return intento;
    }
}
