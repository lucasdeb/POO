package LifeGame;

import java.util.*;

public class Tablero {
    
    Celula[][] generarMapa(int tamanio) {
        Celula[][] mapa = new Celula[tamanio][tamanio];

        for(int x = 0; x<tamanio; x++) {
            for(int y = 0; y<tamanio; y++) {
                int[] pos = {x,y};
                Celula celula = new Celula(pos);
                mapa[x][y] = celula;
            }
        }

        mapa[0][1].setViva(true);
        mapa[0][5].setViva(true);
        mapa[1][1].setViva(true);
        mapa[1][2].setViva(true);
        mapa[3][0].setViva(true);
        mapa[3][3].setViva(true);
        mapa[4][1].setViva(true);
        mapa[4][4].setViva(true);
        mapa[5][1].setViva(true);

        System.out.println("Mapa generado exitosamente");

        return mapa;
    }
}