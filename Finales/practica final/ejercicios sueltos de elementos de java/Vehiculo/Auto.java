public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo: Auto");
        System.out.println("Número de Puertas: " + numeroPuertas);
    }
}
