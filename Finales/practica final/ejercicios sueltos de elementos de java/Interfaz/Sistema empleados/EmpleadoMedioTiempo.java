public class EmpleadoMedioTiempo extends Empleado{

    
    public EmpleadoMedioTiempo(){}
    public EmpleadoMedioTiempo(String nombre, double salario){
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        double salario= super.getSalarioBase();
        return salario;
    }
}