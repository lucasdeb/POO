public class Revista extends Item {
    private String marca;
    private int numeroSerie;

    public Revista(String titulo, String fecha, int isbn, String marca, int numSerie){
        super(titulo, fecha, isbn);
        this.marca= marca;
        this.numeroSerie= numSerie;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Esta revista es aquella con la siguiente descripcion:\n"+
        "TITULO: %s\nFECHA: %s\nISBN: %d\nMARCA: %s\nNUMERO DE SERIE: %d\n",
        super.getTitulo(), super.getFechaPublicacion(), super.getISBN(), this.marca, this.numeroSerie);
    }

    @Override
    public void prestar() {
        System.out.println("Se presta una revista.");
        mostrarDetalles();
    }

    @Override
    public void devolver() {
        System.out.println("Se devuelve una revista.");
        mostrarDetalles();
    }
}
