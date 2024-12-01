public class MatrizSumas {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[] sumasFilas = new int[filas];
        int[] sumasColumnas = new int[columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumasFilas[i] += matriz[i][j];
                sumasColumnas[j] += matriz[i][j];
            }
        }

        System.out.println("Sumas de filas:");
        for (int suma : sumasFilas) {
            System.out.println(suma);
        }

        System.out.println("Sumas de columnas:");
        for (int suma : sumasColumnas) {
            System.out.println(suma);
        }
    }
}
