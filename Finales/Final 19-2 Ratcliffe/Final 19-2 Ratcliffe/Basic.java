public class Basic extends Socio{
    
    public Basic(String nombre){
        super(nombre, 100);
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("\nDATOS SOCIO BASIC:\nNOMBRE: %s\nCREDITOS: %d\nTITULOS:\n",
        super.getNombre(), super.getCreditos());
        for (Articulo titulo : super.getTitulos()) {
            System.out.printf("%s\n", titulo.getTitulo());
        }
    }
}