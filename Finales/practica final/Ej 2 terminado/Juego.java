import java.util.HashMap;
import java.util.Scanner;

public class Juego{
    private Jugador jugador;
    private HashMap<String, Escena> escenas= new HashMap<String, Escena>();

    public Juego(){}
    
    public Jugador getJugador() {
        return this.jugador;
    }
    public HashMap<String, Escena> getEscenas() {
        return this.escenas;
    }

    public void iniciar(){
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        String nombre= myScanner.next();
        this.jugador= new Jugador(nombre);
        /* El primer nivel será un Bosque, y ya tendremos definidas sus cosas, 
        los siguientes niveles serían definidos en el Main */
        Escena primerNivel= new Escena("Bosque");
        primerNivel.agregarSalida("Norte", new Escena("Desierto"));
        primerNivel.agregarSalida("Sur", new Escena("Selva"));
        primerNivel.agregarSalida("Este", new Escena("Sierras"));
        primerNivel.agregarObjeto(new Objeto("Ramas", "Sirve para una fogata"));
        primerNivel.agregarObjeto(new Objeto("Piedra", "Sirve para sacar filo"));
        primerNivel.agregarObjeto(new Objeto("Frutas", "Te quita el hambre"));
        this.escenas.put("Bosque", primerNivel);
    }
    public void cambiarEscena(String nombreEscena){
        this.escenas.clear();
        Escena nuevaEscena= new Escena(nombreEscena);
        this.escenas.put(nombreEscena, nuevaEscena);
        System.out.printf("%s ha avanzado a %s\n", jugador.getNombre(), nombreEscena);
    }
}