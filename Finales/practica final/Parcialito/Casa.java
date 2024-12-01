public class Casa extends Vivienda{
    private int cantidadDePisos;
    private boolean patio;

    public Casa(){}
    public Casa(String prop, String dir, double mtr2, int cantHab,
    int cantBan, boolean cochera, int cantPisos, boolean patio){
        super(prop, dir, mtr2, cantHab, cantBan, cochera);
        this.cantidadDePisos= cantPisos;
        this.patio= patio;
    }

    public int getCantidadDePisos() {
        return this.cantidadDePisos;
    }
    public boolean tienePatio(){
        return this.patio;
    }

    @Override
    public void recolectorDeInformacion() {
        System.out.println("La vivienda es una casa con los siguientes datos:");
        System.out.printf("Propietario: %s\nDireccion: %s\nMetros cuadrados: %.3f\n"+
        "Cantidad de habitaciones: %d\nCantidad de banios: %d\nTiene cochera: ",
        super.getPropietario(), super.getDireccion(), super.getMetrosCuadrados(),
        super.getCantidadHabitaciones(), super.getCantidadBanios());
        if (super.tieneCochera()) {
            System.out.print("Si\n");
        }else{
            System.out.print("No\n");
        }
        System.out.printf("Cantidad de pisos: %d\nTiene patio: ", this.getCantidadDePisos());
        if (this.tienePatio()) {
            System.out.print("Si\n");
        }else{
            System.out.print("No\n");
        }
        for (Habitacion habitacion : super.getHabitaciones()) {
            habitacion.recolectorDeInformacionH();
        }
        for (Banio banio : super.getBanios()) {
            banio.recolectorDeInformacionB();
        }
    }
}
