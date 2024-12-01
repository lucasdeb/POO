import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresar N1: ");
        double n1 = input.nextDouble();

        System.out.print("Ingresar N2: ");
        double n2 = input.nextDouble();

        System.out.print("Ingresar operador: ");
        int op = input.nextInt();

        switch(op){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                try {
                    if (n2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                } catch (ArithmeticException e) {
                    System.out.println("No se puede dividir por 0");
                }
                break;
            case 4:
                System.out.println(n1*n2);
                break;
        }
    }
}
