import java.util.ArrayList;

public abstract class Socio {
    private String nombre;
    private ArrayList<Articulo> titulos;
    private int creditos;

    public Socio(String nombre, int creditos){
        this.nombre= nombre;
        this.creditos= creditos;
        this.titulos= new ArrayList<Articulo>();
    }

    public int getCreditos() {
        return creditos;
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Articulo> getTitulos() {
        return titulos;
    }
    
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void alquilar(Articulo articulo){
        this.titulos.add(articulo);
    }

    public void devolver(Articulo articulo){
        this.titulos.remove(articulo);
    }

    public abstract void mostrarDatos();
}
