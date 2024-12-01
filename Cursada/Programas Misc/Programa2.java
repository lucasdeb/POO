public class Programa2 {
    public static void main(String[] args) {
        // Arreglos de diferentes tipos de datos
        int[] numeros = {10, 20, 30, 40, 50};
        float[] valoresDecimales = {3.14f, 1.618f, 2.718f};
        boolean[] opciones = {true, false, true};
        String[] nombres = {"Ale", "Andrea", "Alejo","Ariel"};
        char[] letras = {'A', 'B', 'C'};

        // Imprimir los elementos de los arreglos
        System.out.println("Arreglo de numeros:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Arreglo de valores decimales:");
        for (float valor : valoresDecimales) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.println("Arreglo de opciones:");
        for (boolean opcion : opciones) {
            System.out.print(opcion + " ");
        }
        System.out.println();

        System.out.println("Arreglo de nombres:");
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
        System.out.println();

        System.out.println("Arreglo de letras:");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println();
    }
}
