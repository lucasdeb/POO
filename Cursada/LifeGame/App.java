package LifeGame;

public class App {
    public static void main(String[] args) throws Exception {
        Partida partida = new Partida(6);
        partida.play();

        int generaciones = 2;
        for(int x = 1; x <= generaciones; x++) {
            partida.imprimir(x);
            partida.evolucionar();
        }
    }
}
