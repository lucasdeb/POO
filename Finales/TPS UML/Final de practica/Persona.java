public class Persona {
    private String nombre;
    private String apellido;
    private int DNI;
    private int edad;

    public Persona(){}
    public Persona(String nombre, String apellido, int dni, int edad){
        this.nombre= nombre;
        this.apellido= apellido;
        this.DNI= dni;
        this.edad= edad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDNI() {
        return DNI;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDNI(int dni) {
        this.DNI = dni;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void verDatos(){
        System.out.printf("Nombre: %s\nApellido: %s\nDNI: %d\nEdad: %d\n",
        this.nombre, this.apellido, this.DNI, this.edad);
    }
}
