public class Auto extends Vehiculo {
    public Auto(String codigo, double costo) {
        super(codigo, costo);
    }

    @Override
    public int getCapacidad() {
        return 4;
    }
}
