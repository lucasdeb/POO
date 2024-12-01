package ParcialZork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppZork {
    public static void main(String[] args) {
        Juego juego = new Juego(null, null);
        juego.iniciar();
        juego.cambiarEscena("Baño");
    }
}

class Juego {
    Jugador jugador;
    List<Escena> escenas;

    Juego(String jugadorNombre, String EscenaDescripcion) {
        this.jugador = new Jugador(jugadorNombre);
        Escena escena = new Escena(EscenaDescripcion);
        this.escenas = new ArrayList<>( Arrays.asList( escena) );
    }

    void iniciar() {
        System.out.println("Inicio del juego");
    }

    void cambiarEscena(String nombreEscena) {
        System.out.println("Nueva escena" + nombreEscena);
    }
}

class Escena {
    String descripcion;
    List<Objeto> objetosEnEscena;
    List<Escena> salidas;

    public Escena(String descripcion) {
        this.descripcion = descripcion;
    }

    void agregarObjeto(Objeto objeto) {
        objetosEnEscena.add(objeto);
    }

    void agregarSalida(String direccion, Escena escena) {
        salidas.add(escena);

    }
}

class Jugador {
    String nombre;
    List<Objeto> inventario;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>();
    }

    void tomarObjeto(Objeto objeto) {
        inventario.add(objeto);
    }

    void usarObjeto(Objeto objeto) {
        inventario.remove(objeto);
    }
}

class Objeto {
    String nombre;
    String descripcion;

    Objeto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
