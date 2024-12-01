public class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int DNI;
    private int edad;

    public Persona(){}
    public Persona(String nombre, String apellido, String genero, int dni, int edad){
        this.nombre= nombre;
        this.apellido= apellido;
        this.genero= genero;
        this.DNI= dni;
        this.edad= edad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getGenero() {
        return genero;
    }
    public int getEdad() {
        return edad;
    }
    public int getDNI() {
        return DNI;
    }
    public String getApellido() {
        return apellido;
    }

    public void verDatos(){
        System.out.printf("Nombre: %s\nApellido: %s\nGenero: %s\nDNI: %d\nEdad: %d\n",
        this.nombre, this.apellido, this.genero, this.DNI, this.edad);
    }
}
