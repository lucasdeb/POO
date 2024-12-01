public abstract class Item implements IPrestable{
    private String titulo;
    private String fechaPublicacion;
    private int ISBN;

    public Item(String titulo, String fecha, int isbn){
        this.titulo= titulo;
        this.fechaPublicacion= fecha;
        this.ISBN= isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public int getISBN() {
        return ISBN;
    }

    public abstract void mostrarDetalles();
    public abstract void devolver();
    public abstract void prestar();
}
