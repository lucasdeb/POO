public class Pelicula extends Articulo{
    private int duracion;
    private String sinopsis;
    
    public Pelicula(int id, String titulo, int duracion, String sinopsis){
        super(id, titulo, 60);
        this.duracion= duracion;
        this.sinopsis= sinopsis;
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("\nDATOS PELICULA:\nTITULO: %s\nSINOPSIS: %s\nDURACION: %d\n\n",
        super.getTitulo(), this.sinopsis, this.duracion);
    }
}
