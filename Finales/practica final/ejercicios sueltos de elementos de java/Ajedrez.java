public class Ajedrez {
    public static void main(String[] args) {
        char[][] tablero = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = 'X'; // Casillas negras
                } else {
                    tablero[i][j] = ' '; // Casillas blancas
                }
            }
        }

        // Imprimir el tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
