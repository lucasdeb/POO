import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Item> items;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> prestados;

    public Biblioteca(ArrayList<Item> stock){
        this.items= new ArrayList<Item>();
        for (Item item : stock) {
            this.items.add(item);
        }
        this.clientes= new ArrayList<Cliente>();
        this.prestados= new ArrayList<Item>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Item> getItemsDisponibles() {
        ArrayList<Item> aux= new ArrayList<Item>();
        for (Item item : this.items) {
            aux.add(item);
            for (Item prestado : this.prestados) {
                if (item == prestado) {
                    aux.remove(item);
                }
            }
        }
        return aux;
    }

    public void mostrarStock(){
        for (Item item : this.getItemsDisponibles()) {
            item.mostrarDetalles();
            System.out.println("DISPONIBLE\n");
        }
        for (Item prestado : this.prestados) {
            prestado.mostrarDetalles();
            System.out.println("PRESTADO\n");
        }
    }

    public void registrarCliente(Cliente persona){
        this.clientes.add(persona);
        System.out.printf("Se registro al cliente de nombre %s.\n", persona.getNombre());
    }

    public void prestarItem(Item item){
        boolean respuesta= true;
        for (Item itemStock : this.items) {
            if (itemStock == item) {
                respuesta= false;
                break;
            }
        }
        
        if (respuesta) {
            System.out.println("El item no se encuentra en esta biblioteca.");
        }
        else{
            respuesta= false;
            for (Item itemPrestado : this.prestados) {
                if (itemPrestado == item) {
                    respuesta= true;
                    break;
                }
            }

            if (respuesta) {
                System.out.println("El item ha sido prestado.");
            }
            else{
                this.prestados.add(item);
            }
        }
    }

    public void recibirItem(Item item){
        boolean respuesta= true;
        for (Item itemPrestado : this.prestados) {
            if (itemPrestado == item) {
                respuesta= false;
                break;
            }
        }
        
        if (respuesta) {
            System.out.println("El item no pertenece al stock.");
        }
        else{
            this.prestados.remove(item);
        }
    }
}
