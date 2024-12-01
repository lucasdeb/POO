package LifeGame;

public class Celula {
    int pos[];
    boolean viva = false;
    Celula[] vecinos = new Celula[8];

    Celula(int pos[]) {
        this.pos = pos;
    }

    void setViva(boolean viva) {
        this.viva = viva;
    }

    boolean getViva() {
        return viva;
    }

    int getVecinos(Celula[][] mapa) {
        int vecinosVivos = 0;

        try {
            vecinos[0] = mapa[ pos[0] - 1 ][ pos[1] - 1 ];
            if ( vecinos[0].getViva()  ) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            // No pasa nada
        } catch (java.lang.NullPointerException e2) {
            // No pasa nada
        }

        try {
            vecinos[1] = mapa[ pos[0] - 1 ][ pos[1] ];
            if ( vecinos[1].getViva()  ) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            // No pasa nada
        } catch (java.lang.NullPointerException e2) {
            // No pasa nada
        }

        try {
            vecinos[2] = mapa[ pos[0] - 1 ][ pos[1] + 1 ];
            if ( vecinos[2].getViva()  ) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            // No pasa nada
        } catch (java.lang.NullPointerException e2) {
            // No pasa nada
        }

        try {
            vecinos[3] = mapa[ pos[0] ][ pos[1] - 1 ];
            if ( vecinos[3].getViva()  ) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            // No pasa nada
        } catch (java.lang.NullPointerException e2) {
            // No pasa nada
        }

        try {
            vecinos[4] = mapa[ pos[0] ][ pos[1] + 1 ];
            if ( vecinos[4].getViva()  ) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            // No pasa nada
        } catch (java.lang.NullPointerException e2) {
            // No pasa nada
        }

        try {
            vecinos[5] = mapa[ pos[0] + 1 ][ pos[1] - 1 ];
            if ( vecinos[5].getViva()  ) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            // No pasa nada
        } catch (java.lang.NullPointerException e2) {
            // No pasa nada
        }

        try {
            vecinos[6] = mapa[ pos[0] + 1 ][ pos[1] ];
            if ( vecinos[6].getViva()  ) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            // No pasa nada
        } catch (java.lang.NullPointerException e2) {
            // No pasa nada
        }

        try {
            vecinos[7] = mapa[ pos[0] + 1 ][ pos[1] + 1 ];
            if ( vecinos[7].getViva()  ) {
                vecinosVivos++;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            // No pasa nada
        } catch (java.lang.NullPointerException e2) {
            // No pasa nada
        }

        return vecinosVivos;
    }
}