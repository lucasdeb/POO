public class Main{
    public static void main(String[] args) {
        Biblioteca biblioteca= new Biblioteca();
        Libro libro= new Libro("A", "A", "A", 0);
        Libro libro2= new Libro("B", "B", "B", 1);
        Libro libro3= new Libro("C", "C", "C", 2);

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.mostrarCatalogo();

        biblioteca.eliminarLibro(libro2);

        System.out.println("Otra version de mostrar catalogo");
        for (Libro item : biblioteca.obtenerListaLibros()) {
            System.out.printf("Libro: %s, %s, %s, %d\n",
            item.getTitulo(), item.getAutor(), item.getEditorial(), item.getAnioPublicacion());
        }
        //System.out.println(biblioteca.obtenerListaLibros());
    }
}