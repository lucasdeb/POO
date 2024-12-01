import java.util.Random;
import java.util.Scanner;
public class Ejercicio{
    public static void main(String[] args){
        int objetivo;
        int miNum;
        Random aleatorio= new Random();
        Scanner objScanner= new Scanner(System.in);
        objetivo=aleatorio.nextInt(100)+1;
        System.out.print("Ingrese un intento: ");
        miNum=objScanner.nextInt();
        while(objetivo!=miNum){
            if(miNum<objetivo){
                System.out.println("El numero ingresado es menor. Sigue intentando");
            }else{
                System.out.println("El numero ingresado es mayor. Sigue intentando");
            }
            System.out.print("Ingrese un intento: ");
            miNum=objScanner.nextInt();
        }
        System.out.println("Acerto");
    }
}