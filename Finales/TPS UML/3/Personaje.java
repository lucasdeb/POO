public class Personaje {
    private String nombre;
    private String descripcion;

    public Personaje(){}
    public Personaje(String nombre, String descripcion){
        this.nombre= nombre;
        this.descripcion= descripcion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
