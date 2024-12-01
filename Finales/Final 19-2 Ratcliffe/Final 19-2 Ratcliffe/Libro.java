public class Libro extends Articulo{
    private int ISBN;
    private String autor;
    private String editorial;

    public Libro(int id, String titulo, int isbn, String autor, String editorial){
        super(id, titulo, 20);
        this.ISBN= isbn;
        this.autor= autor;
        this.editorial= editorial;
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("\nDATOS LIBRO:\nTITULO: %s\nAUTOR: %s\nEDITORIAL: %s\n\n",
        super.getTitulo(), this.autor, this.editorial);
    }
}
