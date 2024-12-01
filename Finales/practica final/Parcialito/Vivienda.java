import java.util.ArrayList;

public abstract class Vivienda {
    private String propietario;
    private String direccion;
    private double metrosCuadrados;
    private int cantidadHabitaciones;
    private int cantidadBanios;
    private boolean tieneCochera;
    private ArrayList<Habitacion> habitaciones= new ArrayList<Habitacion>();
    private ArrayList<Banio> banios= new ArrayList<Banio>();

    public Vivienda(){}
    public Vivienda(String prop, String dir, double mtr2, int cantHab, int cantBan, boolean cochera){
        this.propietario= prop;
        this.direccion= dir;
        this.metrosCuadrados= mtr2;
        this.cantidadHabitaciones= cantHab;
        this.cantidadBanios= cantBan;
        this.tieneCochera= cochera;
    }

    public String getPropietario() {
        return this.propietario;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public double getMetrosCuadrados() {
        return this.metrosCuadrados;
    }
    public int getCantidadHabitaciones() {
        return this.cantidadHabitaciones;
    }
    public int getCantidadBanios() {
        return this.cantidadBanios;
    }
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    public ArrayList<Banio> getBanios() {
        return banios;
    }
    public boolean tieneCochera(){
        return this.tieneCochera;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }
    public void setTieneCochera(boolean tieneCochera) {
        this.tieneCochera = tieneCochera;
    }

    public void aniadirHabitacion(Habitacion habitacion){
        if (habitaciones.size() < cantidadHabitaciones) {
            this.habitaciones.add(habitacion);
            System.out.printf("Se aniadio la habitacion %s\n", habitacion.getNombreHabitacion());
        }
        else{
            throw new IndexOutOfBoundsException("Error, no se pueden ingresar mas elementos");
        }
    }
    public void aniadirBanio(Banio banio){
        if (banios.size() < cantidadBanios) {
            this.banios.add(banio);
            System.out.println("Se aniadio un banio");
        }
        else{
            throw new IndexOutOfBoundsException("Error, no se pueden ingresar mas elementos");
        }
    }
    public abstract void recolectorDeInformacion();
}
