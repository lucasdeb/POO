public class Camioneta extends Vehiculo{
    public Camioneta(String codigo, double costo) {
        super(codigo, costo);
    }

    @Override
    public int getCapacidad() {
        return 5;
    }
}
