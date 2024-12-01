import java.util.Random;
import java.util.Scanner;

public class adivinaElNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        int intentos = 0;

        while (true) {
            System.out.print("Ingresar numero: ");
            int newnum = input.nextInt();

            if (newnum == num) {
                System.out.println("Correcto!");
                System.out.println("Lo lograste en [" + intentos + "] intentos!");
                break;
            }

            else {
                intentos++;
                if (newnum > num) {
                    System.out.println("El numero es mayor!");
                } else {
                    System.out.println("El numero es menor!");
                }
            }
        }
    }

    static int ingreso() {
        try {
            
        } catch (Exception e) {
            System.out.println("No se pueden ingresar letras!");
        }
        return 0;
    }
}
