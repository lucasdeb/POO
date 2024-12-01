public class Empleado{
    private String nombre;
    private double salario;
    private int antiguedad;

    public Empleado(){}
    public Empleado(String nom, double sal, int ant){
        this.nombre= nom;
        this.salario= sal;
        this.antiguedad= ant;
    }

    public String getNombre(){
        return nombre;
    }
    public double getSalario(){
        return salario;
    }
    public int getAntiguedad(){
        return antiguedad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void getInformacion(){
        System.out.printf("El nombre es %s, el salario es %.2f, su antiguedad es %d,", this.getNombre(), this.getSalario(), this.getAntiguedad());
    }
}