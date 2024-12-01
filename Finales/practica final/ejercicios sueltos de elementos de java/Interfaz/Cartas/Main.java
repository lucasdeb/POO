import java.util.Scanner;

public class Main {
    public static boolean cartaValida(int num,String color){
        boolean expresion= ( color.equals("Rojo") ||
        color.equals("Azul") || color.equals("Verde") ||
        color.equals("Amarillo") ) && ( num >= 1 && num <= 10 );
        return expresion;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numeroCarta=-1;
        String colorCarta;
        CartaNormal[] cartasNormales= new CartaNormal[40];
        int contN= 0;
        CartaEspecial[] cartasEspeciales= new CartaEspecial[10];
        int contE= 0;
        while (numeroCarta != 0 && contN < 40 && contE < 10) {
            System.out.println("Ingrese numero de carta (1 - 10)");
            numeroCarta= scan.nextInt();
            System.out.println("Ingrese color de carta (Rojo/Azul/Verde/Amarillo)");
            colorCarta= scan.next();
            boolean bandera= cartaValida(numeroCarta, colorCarta);
            while (!bandera && numeroCarta != 0) {
                System.out.println("Alguno de los datos no es valido, ingrese nuevamente.\nPrimero numero, luego color");
                numeroCarta= scan.nextInt();
                colorCarta= scan.next();
                bandera= cartaValida(numeroCarta, colorCarta);
            }
            if (colorCarta.equals("Amarillo") && (numeroCarta > 0 && numeroCarta < 5)) {
                cartasEspeciales[contE]= new CartaEspecial(numeroCarta, colorCarta);
                contE++;
            }
            else if ((!colorCarta.equals("Amarillo")) && (numeroCarta != 0)) {
                cartasNormales[contN]= new CartaNormal(numeroCarta, colorCarta);
                contN++;
            }
            else{
                System.out.println("Carta no existente.");
            }
        }
        System.out.println("Veremos los efectos de las cartas especiales.");
        for (CartaEspecial cartaEspecial : cartasEspeciales) {
            cartaEspecial.efecto();
        }
        System.out.println("Veremos los efectos de las cartas normales.");
        for (CartaNormal cartaNormal : cartasNormales) {
            cartaNormal.efecto();
        }
    }
}