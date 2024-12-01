import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Objeto> inventario= new ArrayList<Objeto>();

    public Jugador(){}
    public Jugador(String nombre){
        this.nombre= nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public ArrayList<Objeto> getInventario() {
        return this.inventario;
    }

    public void tomarObjeto(Objeto objeto){
        this.inventario.add(objeto);
        System.out.printf("Se ha encontrado el objeto %s\n", objeto.getNombre());
    }
    public void usarObjeto(Objeto objeto){
        this.inventario.remove(objeto);
        System.out.printf("Se ha usado el objeto %s. %s\n",
        objeto.getNombre(), objeto.getDescripcion());
    }
}
