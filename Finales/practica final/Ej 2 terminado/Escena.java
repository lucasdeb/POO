import java.util.HashMap;
import java.util.ArrayList;

public class Escena {
    private String descripcion;
    private ArrayList<Objeto> objetosEnEscena= new ArrayList<Objeto>();
    private HashMap<String, Escena> salidas= new HashMap<String, Escena>();
    /* El formato de las salidas son las posibles nuevas escenas a las que puede cambiar,
    es decir las escenas que estan conectadas, donde la key sería la puerta que lleva a esa nueva escena */

    public Escena(){}
    public Escena(String descripcion){
        this.descripcion= descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public HashMap<String, Escena> getSalidas() {
        return this.salidas;
    }
    public ArrayList<Objeto> getObjetosEnEscena() {
        return this.objetosEnEscena;
    }

    public void agregarObjeto(Objeto objeto){
        this.objetosEnEscena.add(objeto);
        System.out.printf("Ha aparecido el objeto %s\n", objeto.getNombre());
    }
    public void agregarSalida(String direccion, Escena escena){
        this.salidas.put(direccion, escena);
        System.out.println("Se ha agregado una salida");
    }
}
