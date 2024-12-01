public class Genero {
    private String tipo;
    private String descripcion;

    public Genero(){}
    public Genero(String tipo, String descripcion){
        this.tipo= tipo;
        this.descripcion= descripcion;
    }

    public String getTipo() {
        return tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
