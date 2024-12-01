public abstract class Trabajador {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int DNI;

    public Trabajador(){}
    public Trabajador(String nombre, String apellido, String fecha, int dni){
        this.nombre= nombre;
        this.apellido= apellido;
        this.fechaNacimiento= fecha;
        this.DNI= dni;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public int getDNI() {
        return DNI;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public abstract void mostrarInfo();
}
