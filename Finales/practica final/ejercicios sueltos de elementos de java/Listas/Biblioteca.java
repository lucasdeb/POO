import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca(){
        this.libros= new ArrayList<Libro>();
    }

    public ArrayList<Libro> obtenerListaLibros() {
        return this.libros;
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
        System.out.printf("Se agrego el libro %s, %s, %s, %d\n",
        libro.getTitulo(), libro.getAutor(), libro.getEditorial(), libro.getAnioPublicacion());
    }
    public void eliminarLibro(Libro libro){
        this.libros.remove(libro);
        System.out.printf("Se quito el libro %s, %s, %s, %d\n",
        libro.getTitulo(), libro.getAutor(), libro.getEditorial(), libro.getAnioPublicacion());
    }
    public void mostrarCatalogo(){
        for (Libro libro : this.libros) {
            System.out.printf("Libro: %s, %s, %s, %d\n",
            libro.getTitulo(), libro.getAutor(), libro.getEditorial(), libro.getAnioPublicacion());
        }
    }
}