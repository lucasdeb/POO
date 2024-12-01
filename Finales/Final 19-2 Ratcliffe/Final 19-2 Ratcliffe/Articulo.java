public abstract class Articulo {
    private int ID;
    private String titulo;
    private int costo;
    private boolean disponible;

    public Articulo(int id, String titulo, int costo){
        this.ID= id;
        this.titulo= titulo;
        this.costo= costo;
        this.disponible= true;
    }

    public int getID() {
        return ID;
    }
    public int getCosto() {
        return costo;
    }
    public String getTitulo() {
        return titulo;
    }
    
    public boolean estaDisponible(){
        return disponible;
    }

    public void setDisponible() {
        this.disponible = !(this.disponible);
    }

    public abstract void mostrarDatos();
}
