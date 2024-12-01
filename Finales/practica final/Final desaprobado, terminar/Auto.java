public class Auto extends Vehiculo {
    
    public Auto(){}
    public Auto(String codigo){
        super(codigo, 2000, 4);
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Camioneta:\nCodigo unico: %s\nCosto de alquiler diario: %.2f\n",
        super.getCodigoUnico(), super.getCostoAlquiler());
    }
    @Override
    public void aplicarDescuento(int dias) {
        if (65 < super.getConductor().getEdad() && super.getConductor().getGenero() == "Femenino") {
            System.out.println((super.getCostoAlquiler()*dias)*0.8);
        }
        else if (70 < super.getConductor().getEdad() && super.getConductor().getGenero() == "Masculino") {
            System.out.println((super.getCostoAlquiler()*dias)*0.8);
        }
    }
}
