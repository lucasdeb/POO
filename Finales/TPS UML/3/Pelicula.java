import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String sinopsis;
    private int anioProduccion;
    private int duracion;
    private Genero genero;
    private ArrayList<Trabajador> equipo;

    public Pelicula(){}
    public Pelicula(String nombre, String sinopsis, int anioProduccion, int duracion, Genero genero){
        this.nombre= nombre;
        this.sinopsis= sinopsis;
        this.anioProduccion= anioProduccion;
        this.duracion= duracion;
        this.genero= genero;
        this.equipo= new ArrayList<Trabajador>();
    }

    public String getNombre() {
        return nombre;
    }
    public Genero getGenero() {
        return genero;
    }
    public int getDuracion() {
        return duracion;
    }
    public int getAnioProduccion() {
        return anioProduccion;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public ArrayList<Trabajador> getEquipo() {
        return equipo;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public void setAnioProduccion(int anioProduccion) {
        this.anioProduccion = anioProduccion;
    }

    public void agregarMiembro(Trabajador miembro){
        this.equipo.add(miembro);
        System.out.println("Se añadio a un miembro.");
        miembro.mostrarInfo();
    }
}
