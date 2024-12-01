import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner miScanner= new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre= miScanner.nextLine();
        System.out.print("Proyecto: ");
        String particularidad= miScanner.nextLine();
        System.out.print("Salario: ");
        double salario= miScanner.nextDouble();
        System.out.print("Antiguedad: ");
        int antiguedad= miScanner.nextInt();

        //Gerente persona= new Gerente(nombre, salario, antiguedad, particularidad);
        //Obrero persona= new Obrero(nombre, salario, antiguedad, particularidad);
        Asistente persona= new Asistente(nombre, salario, antiguedad, particularidad);

        persona.getInformacion();
    }
}
