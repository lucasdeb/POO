import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Biblioteca crearBiblioteca(){
        Libro libro1= new Libro("A", "19/20/87", 12, "A", "A");
        Libro libro2= new Libro("B", null, 23, "B", null);
        Libro libro3= new Libro("C", null, 56, "C", null);
        Libro libro4= new Libro("D", null, 525, "D", null);
        Libro libro5= new Libro("E", null, 55, "E", null);
        Revista revista1= new Revista("F", null, 21, "F", 1456);
        Revista revista2= new Revista("G", null, 258,"G", 7485);
        Revista revista3= new Revista("H", null, 74, "H", 153);
        Revista revista4= new Revista("I", null, 10, "I", 5458);
        ArrayList<Item> stock= new ArrayList<Item>();
        stock.add(libro1);
        stock.add(libro2);
        stock.add(libro3);
        stock.add(libro4);
        stock.add(libro5);
        stock.add(revista1);
        stock.add(revista2);
        stock.add(revista3);
        stock.add(revista4);

        Biblioteca biblioteca= new Biblioteca(stock);
        return biblioteca;
    }

    public static Biblioteca opcionPrestamo(Biblioteca biblio, String nombre, int ISBN){
        for (Item itemDisp : biblio.getItemsDisponibles()) {
            if (ISBN == itemDisp.getISBN()) {
                Item item= itemDisp;
            }
        }

        for (Cliente persona : biblio.getClientes()) {
            if (persona.getNombre().equals(nombre)) {
                persona.tomarPrestado(item);
                System.out.println("\n");
                biblio.prestarItem(item);
            }
        }
        Biblioteca aux= biblio;
        return aux;
    }

    public static Biblioteca opcionDevolucion(Biblioteca biblio, String nombre, int ISBN){
        for (Cliente persona : biblio.getClientes()) {
            if (persona.getNombre().equals(nombre)) {
                persona.devolverItem(item);
                System.out.println("\n");
                biblio.recibirItem(item);
            }
        }
        Biblioteca aux= biblio;
        return aux;
    }


    public static void main(String[] args) {
        // En este tipo de ejs no se puede pero lo ideal es crear la entidad grande con ciclos
        Biblioteca biblioteca= crearBiblioteca();
        Scanner inputs= new Scanner(System.in);
        Libro libro1= new Libro("A", "19/20/87", 12, "A", "A");
        
        //System.out.println("Ingrese su nombre: ");
        //String nombre= inputs.nextLine();
        Cliente persona= new Cliente("Pato");
        biblioteca.registrarCliente(persona);
        biblioteca= opcionPrestamo(biblioteca, "Pato", libro1);
        biblioteca.mostrarStock();
        

    }
}