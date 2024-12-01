import java.util.ArrayList;

public class Tienda {
    private ArrayList<Socio> socios;
    private ArrayList<Articulo> articulos;

    public Tienda(){
        this.socios= new ArrayList<Socio>();
        //stock inicial
        this.articulos= new ArrayList<Articulo>();
        Libro libro1= new Libro(1,"LibroA",123, "Pedro", "A");
        Libro libro2= new Libro(2, "LibroB",1433, "Marcos", "B");
        Cd cd= new Cd(3,"CD","Luismi", "Spain", 120);
        Pelicula pelicula= new Pelicula(4,"Pelicula", 240, "Accion y suspenso en un bosque tenebroso");
        this.articulos.add(libro1);
        this.articulos.add(libro2);
        this.articulos.add(cd);
        this.articulos.add(pelicula);
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public ArrayList<Articulo> getArticulosDisponibles() {
        ArrayList<Articulo> articulosDisponibles= new ArrayList<Articulo>();
        for (Articulo articulo : this.articulos) {
            if (articulo.estaDisponible()) {
                articulosDisponibles.add(articulo);
            }
        }
        return articulosDisponibles;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void registrarSocio(Socio socio){
        this.socios.add(socio);
        System.out.printf("\nSe registro a %s\n", socio.getNombre());
    }

    public void agregarNuevoArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }

    public void prestar_recibirArticulo(Articulo item){
        for (Articulo articulo : this.articulos) {
            if (articulo.getID() == item.getID()) {
                articulo.setDisponible();
            }
        }
    }
}
