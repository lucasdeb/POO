public class Departamento extends Vivienda{
    private int piso;
    private int cantidadAscensores;
    private boolean ascensor;
    private boolean tieneSum;
    private boolean seguridad;

    public Departamento(){}
    public Departamento(String prop, String dir, double mtr2, int cantHab,
    int cantBan, boolean cochera, int piso, boolean tieneSum, boolean seguridad){
        super(prop, dir, mtr2, cantHab, cantBan, cochera);
        this.piso= piso;
        this.tieneSum= tieneSum;
        this.seguridad= seguridad;
    }

    public int getPiso() {
        return this.piso;
    }
    public int getCantidadAscensores() {
        return this.cantidadAscensores;
    }
    public boolean tieneAscensor(){
        return this.ascensor;
    }
    public boolean tieneSum(){
        return this.tieneSum;
    }
    public boolean tieneSeguridad(){
        return this.seguridad;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    public void setAscensores(boolean ascensor, int cantidadAscensores) {
        if (ascensor ^ (cantidadAscensores != 0)) {
            throw new RuntimeException("Error logico, no puede no haber ascensores y que la cantidad sea mayor a 0, y viceversa!");
        }
        else{
            this.ascensor= ascensor;
            this.cantidadAscensores = cantidadAscensores;
        }
    }
    public void setTieneSum(boolean tieneSum) {
        this.tieneSum = tieneSum;
    }
    public void setSeguridad(boolean seguridad) {
        this.seguridad = seguridad;
    }

    @Override
    public void recolectorDeInformacion() {
        System.out.println("La vivienda es un departamento con los siguientes datos:");
        System.out.printf("Propietario: %s\nDireccion: %s\nMetros cuadrados: %.3f\n"+
        "Cantidad de habitaciones: %d\nCantidad de banios: %d\nTiene cochera: ",
        super.getPropietario(), super.getDireccion(), super.getMetrosCuadrados(),
        super.getCantidadHabitaciones(), super.getCantidadBanios());
        if (super.tieneCochera()) {
            System.out.print("Si\n");
        }else{
            System.out.print("No\n");
        }
        System.out.printf("Piso: %d\nTiene ascensor: ", this.getPiso());
        if (this.tieneAscensor()) {
            System.out.printf("Si\nCantidad de ascensores: %d\nTiene SUM: ", 
            this.getCantidadAscensores());
        }else{
            System.out.print("No\nTiene SUM: ");
        }
        if (this.tieneSum()) {
            System.out.print("Si\nTiene seguridad: ");
        }else{
            System.out.print("No\nTiene seguridad: ");
        }
        if (this.tieneSeguridad()) {
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