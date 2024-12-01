public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String genero;
    private int edad;

    public Persona(String nombre, String apellido, String dni, String genero, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.edad = edad;
    }

    public String toString(){
        return this.nombre + " " + this.apellido;
    }

}
