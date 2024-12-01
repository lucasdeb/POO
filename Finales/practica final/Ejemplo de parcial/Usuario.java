public abstract class Usuario {
    private String nombre;
    private String apellido;
    private String email;

    public Usuario(){}
    public Usuario(String nombre, String apellido, String mail){
        this.nombre= nombre;
        this.apellido= apellido;
        this.email= mail;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getEmail() {
        return this.email;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
