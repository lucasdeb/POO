package Clase29092023;
import java.util.ArrayList;

public class biblioteca {
    private ArrayList <Libro> libros;

    public Biblioteca(){
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }
}
