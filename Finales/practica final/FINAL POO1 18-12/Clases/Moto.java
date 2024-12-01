public class Moto extends Vehiculo{
    public Moto(String codigo, double costo){
        super(codigo, costo);
    }

    @Override
    public int getCapacidad(){
        return 2;
    }
}
