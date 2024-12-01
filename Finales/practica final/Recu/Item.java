public abstract class Item {
    private String titulo;
    private int anioPublicacion;

    public Item(){}
    public Item(String titulo, int anio){
        this.titulo= titulo;
        this.anioPublicacion= anio;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public abstract void displayInformacion();
}
