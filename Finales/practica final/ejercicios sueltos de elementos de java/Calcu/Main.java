import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculadora casio= new Calculadora();
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese dos enteros, separados con ENTER: ");
        int a= miScanner.nextInt();
        int b= miScanner.nextInt();
        System.out.print("Ingrese un caracter operador (+,-,*,/): ");
        char operador= miScanner.next().charAt(0);
        //HACER TRY CATCH
        switch(operador){
            case '+':
                System.out.println(casio.sumar(a, b));
                break;
            case '-':
                System.out.println(casio.restar(a, b));
                break;
            case '*':
                System.out.println(casio.multiplicar(a, b));
                break;
            case '/':
                boolean bandera= true;
                while(bandera){
                    try {
                        System.out.println(casio.dividir(a, b));
                        bandera= false;
                    } catch (ArithmeticException e) {
                        System.out.println("Esta intentando dividir por 0 "+e+", por favor ingrese otro numero: ");
                        b= miScanner.nextInt();
                        //bandera= true;
                    }
                }
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }
    }
}
