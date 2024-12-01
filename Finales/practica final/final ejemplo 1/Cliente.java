import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<IPrestable> items;

    public Cliente(String nombre){
        this.nombre= nombre;
        this.items= new ArrayList<IPrestable>();
    }

    public String getNombre() {
        return nombre;
    }

    public void tomarPrestado(IPrestable item){
        items.add(item);
        item.prestar();
    }

    public void devolverItem(IPrestable item){
        items.remove(item);
        item.devolver();
    }
}
