public class Premium extends Socio{

    public Premium(String nombre){
        super(nombre, 800);
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("\nDATOS SOCIO PREMIUM:\nNOMBRE: %s\nCREDITOS: %d\nTITULOS:\n",
        super.getNombre(), super.getCreditos());
        for (Articulo titulo : super.getTitulos()) {
            System.out.printf("%s\n", titulo.getTitulo());
        }
    }
}