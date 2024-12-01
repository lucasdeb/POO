import java.util.Random;
import java.util.Scanner;

public class GeneradorContrasenias {

    // Función para generar una contrasenia aleatoria
    public static String generarContrasenia(int longitud, boolean incluirMayusculas, boolean incluirMinusculas,
            boolean incluirDigitos) {
        String caracteres = "";
        if (!incluirMayusculas && !incluirMinusculas && !incluirDigitos) {
            incluirDigitos = true; // Si nada está en true, incluir dígitos por defecto
        }
        if (incluirMayusculas)
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (incluirMinusculas)
            caracteres += "abcdefghijklmnopqrstuvwxyz";
        if (incluirDigitos)
            caracteres += "0123456789";

        Random random = new Random();
        String contrasenia = "";

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            contrasenia += caracteres.charAt(index);
        }

        return contrasenia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud deseada para la contrasenia: ");
        int longitudContrasenia = scanner.nextInt();

        System.out.print("¿Incluir letras mayúsculas? (true/false): ");
        boolean incluirMayusculas = scanner.nextBoolean();

        System.out.print("¿Incluir letras minúsculas? (true/false): ");
        boolean incluirMinusculas = scanner.nextBoolean();

        System.out.print("¿Incluir dígitos? (true/false): ");
        boolean incluirDigitos = scanner.nextBoolean();

        String contraseniaGenerada = generarContrasenia(longitudContrasenia, incluirMayusculas, incluirMinusculas,
                incluirDigitos);

        if (!contraseniaGenerada.isEmpty()) {
            System.out.println("Contrasenia generada: " + contraseniaGenerada);
        }

        scanner.close();
    }
}
