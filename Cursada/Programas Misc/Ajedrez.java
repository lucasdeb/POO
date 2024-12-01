public class Ajedrez {
    public static void main(String[] args) {
        char[][] tablero = new char[8][8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = '■'; // Casillas negras
                } else {
                    tablero[i][j] = ' '; // Casillas blancas
                }
            }
        }

        // Imprimir el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; i < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
