public class Moto extends Vehiculo {
    
    public Moto(){}
    public Moto(String codigo){
        super(codigo, 1000, 2);
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Camioneta:\nCodigo unico: %s\nCosto de alquiler diario: %.2f\n",
        super.getCodigoUnico(), super.getCostoAlquiler());
    }
    @Override
    public void aplicarDescuento(int dias) {
        if (65 < super.getConductor().getEdad() && super.getConductor().getGenero().equals("Femenino")) {
            System.out.println((super.getCostoAlquiler()*dias)*0.8);
        }
        else if (70 < super.getConductor().getEdad() && super.getConductor().getGenero().equals("Masculino")) {
            System.out.println((super.getCostoAlquiler()*dias)*0.8);
        }
    }
}
