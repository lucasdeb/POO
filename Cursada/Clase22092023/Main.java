package Clase22092023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresar a: ");
        int a = input.nextInt();
        System.out.print("Ingresar b: ");
        int b = input.nextInt();
        System.out.print("Ingresar operador (1: Sumar 2: Restar, 3: Multiplicar, 4: Dividir): ");
        int op = input.nextInt();

        Calculadora calculo = new Calculadora(a, b);

        switch (op) {
            case 1:
                System.out.println("Resultado: " + calculo.sumar(a, b));
                break;
            case 2:
                System.out.println("Resultado: " + calculo.restar(a, b));
                break;
            case 3:
                System.out.println("Resultado: " + calculo.multiplicar(a, b));
                break;
            case 4:
                System.out.println("Resultado: " + calculo.dividir(a, b));
                break;
        }
    }
}
