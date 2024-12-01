public class Triple extends Habitacion {
    
    public Triple(){}
    public Triple(double precio, int numero){
        super(precio, numero);
        super.setCapacidad(3);
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("Precio: %.2f\nNumero de habitacion: %d\n",
        super.getPrecio(), super.getNumeroHabitacion());
        if (super.estaOcupada()) {
            System.out.println("Informacion del cliente:");
            super.getTitular().verDatos();
        }
    }
    @Override
    public void aplicarDescuento(int edad) {
        if (super.getTitular().getEdad() >= Triple.EDAD) {
            double precioNuevo= ((double)super.getPrecio()) * 0.8;
            super.setPrecio(precioNuevo);
            System.out.println("Se hizo un 20% de descuento.");
        }
    }
}
