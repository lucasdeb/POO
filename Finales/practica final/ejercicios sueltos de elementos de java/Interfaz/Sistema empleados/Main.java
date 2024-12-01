public class Main {

    public static void main(String[] args) {
        EmpleadoTiempoCompleto persona= new EmpleadoTiempoCompleto("Pato", 10000);
        EmpleadoMedioTiempo persona2= new EmpleadoMedioTiempo("Cris", 7000);

        System.out.printf("Salario de %s: %.2f\n", persona.getNombre(), persona.calcularSalario());
        System.out.printf("Salario de %s: %.2f\n", persona2.getNombre(), persona2.calcularSalario());
    }
}