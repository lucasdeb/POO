import java.util.Random;
import java.util.Scanner;

public class generadorContraseñas {
    public static void main(String[] args){

        //inicializo 
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        //inputs
        System.out.print("Ingresar longitud de contraseña: ");
        int len = input.nextInt();
        System.out.print("Contiene MAYUSCULAS? (true/false): ");
        boolean mayusculas = input.nextBoolean();
        System.out.print("Contiene MINUSCULAS? (true/false): ");
        boolean minusculas = input.nextBoolean();
        System.out.print("Contiene DIGITOS? (true/false): ");
        boolean digitos = input.nextBoolean();
        
        generarContraseña(mayusculas, minusculas, digitos, len);
            
    }

    static String generarContraseña(boolean mayusculas, boolean minusculas, boolean digitos, int len){
        String contraseña = "";

        

        return contraseña;
    }
}
