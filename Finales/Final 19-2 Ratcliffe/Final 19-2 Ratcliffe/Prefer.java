public class Prefer extends Socio{
    
    public Prefer(String nombre){
        super(nombre, 300);
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("\nDATOS SOCIO PREFER:\nNOMBRE: %s\nCREDITOS: %d\nTITULOS:\n",
        super.getNombre(), super.getCreditos());
        for (Articulo titulo : super.getTitulos()) {
            System.out.printf("%s\n", titulo.getTitulo());
        }
    }
}