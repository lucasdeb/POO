public class Libro extends Item {
    private String autor;
    private String editorial;

    public Libro(String titulo, String fecha, int isbn, String autor, String editorial){
        super(titulo, fecha, isbn);
        this.autor= autor;
        this.editorial= editorial;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Este libro es aquel con la siguiente descripcion:\n"+
        "TITULO: %s\nFECHA: %s\nISBN: %d\nAUTOR: %s\nEDITORIAL: %s\n",
        super.getTitulo(), super.getFechaPublicacion(), super.getISBN(), this.autor, this.editorial);
    }

    @Override
    public void prestar() {
        System.out.println("Se presta un libro.");
        mostrarDetalles();
    }

    @Override
    public void devolver() {
        System.out.println("Se devuelve un libro.");
        mostrarDetalles();
    }
}
