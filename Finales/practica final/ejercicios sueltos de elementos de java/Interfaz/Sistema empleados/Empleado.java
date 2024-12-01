public abstract class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(){}
    public Empleado(String nombre, double salario){
        this.nombre= nombre;
        this.salarioBase= salario;
    }

    public String getNombre() {
        return nombre;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}
