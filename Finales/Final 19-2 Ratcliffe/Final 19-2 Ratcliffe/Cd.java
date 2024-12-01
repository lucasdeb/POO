public class Cd extends Articulo{
    private String interprete;
    private String selloDiscografico;
    private int duracion;

    public Cd(int id, String titulo, String interprete, String sello, int duracion){
        super(id, titulo, 40);
        this.interprete= interprete;
        this.selloDiscografico= sello;
        this.duracion= duracion;
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("\nDATOS CD:\nTITULO: %s\nINTERPRETE: %s\nDURACION: %d\n\n",
        super.getTitulo(), this.interprete, this.duracion);
    }
}
