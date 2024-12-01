package LifeGame;

public class Partida { 
    Celula[][] mapa;
    int tamanio;

    Partida(int tamanio) {
        this.tamanio = tamanio;
        this.mapa = new Celula[tamanio][tamanio];
        // Tablero tablero = new Tablero();
        // mapa = tablero.generarMapa(tamanio);
    }


    void play() { // Todo lo de esta funcion se podria poner directamente en el constructor
        
        Tablero tablero = new Tablero();
        mapa = tablero.generarMapa(tamanio);
        
        // System.out.println( mapa[2][2].getVecinos(mapa) );
    }

    
    public void imprimir(int generaciones) {
        System.out.println("Generacion N°" + generaciones);

        for(int x = 0; x < tamanio; x++) {
            for(int y = 0; y < tamanio; y++) {
                if ( mapa[x][y].getViva() ) {
                    System.out.print("+ ");
                } else {
                    System.out.print("- ");
                }
                
            }
            System.out.println();
        }
    }

    int[][] getVecinosVivos(int tamanio) {
        int[][] vecinosVivos = new int[tamanio][tamanio];

        for(int x = 0; x < tamanio; x++) {
            for(int y = 0; y < tamanio; y++) {
                vecinosVivos[x][y] = mapa[x][y].getVecinos(mapa);
            }
        }

        return vecinosVivos;
    }

    void evolucionar() {
        int[][] vecinosVivos = getVecinosVivos(tamanio);

        for(int x = 0; x < tamanio; x++) {
            for(int y = 0; y < tamanio; y++) {
                // System.out.println(vecinosVivos[x][y]);
                if ( mapa[x][y].getViva() ) {
                    if ( vecinosVivos[x][y] < 2 || vecinosVivos[x][y] > 3 ) {
                        mapa[x][y].setViva(false);
                    } 
                } else {
                    if ( vecinosVivos[x][y] == 3 ) {
                        mapa[x][y].setViva(true);
                    }
                }
            }
        }

        System.out.println();
    }
}