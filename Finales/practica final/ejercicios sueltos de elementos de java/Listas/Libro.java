public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int anioPublicacion;

    public Libro(String titulo, String autor, String editorial, int anio){
        this.titulo= titulo;
        this.autor= autor;
        this.editorial= editorial;
        this.anioPublicacion= anio;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public String getEditorial() {
        return this.editorial;
    }
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
