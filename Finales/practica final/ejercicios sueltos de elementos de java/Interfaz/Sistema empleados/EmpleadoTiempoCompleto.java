public class EmpleadoTiempoCompleto extends Empleado{
    final double RAZON_DE_BONIFICACION= 0.3;

    public EmpleadoTiempoCompleto(){}
    public EmpleadoTiempoCompleto(String nombre, double salario){
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        double salario= (1 + this.RAZON_DE_BONIFICACION) * super.getSalarioBase();
        return salario;
    }
}
