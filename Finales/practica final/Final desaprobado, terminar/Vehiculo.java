import java.util.ArrayList;

public abstract class Vehiculo implements IDescontable {
    private String codigoUnico;
    private double costoAlquiler;
    private boolean disponible;
    private int capacidad;
    private ArrayList<Persona> pasajeros;
    private Persona conductor;

    public Vehiculo(){}
    public Vehiculo(String codigo, double costoAlquiler, int capacidad){
        this.codigoUnico= codigo;
        this.costoAlquiler= costoAlquiler;
        this.capacidad= capacidad;
        this.disponible= true;
        this.pasajeros= new ArrayList<Persona>();
    }

    public int getCapacidad() {
        return capacidad;
    }
    public String getCodigoUnico() {
        return codigoUnico;
    }
    public Persona getConductor() {
        return conductor;
    }
    public double getCostoAlquiler() {
        return costoAlquiler;
    }
    public boolean estaDisponible(){
        return this.disponible;
    }
    public ArrayList<Persona> getPasajeros() {
        return pasajeros;
    }
    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }
    public void setDisponible() {
        this.disponible = !(this.disponible);
    }
    
    public void aniadirPasajero(Persona persona){
        this.pasajeros.add(persona);
    }

    public void vaciarPasajeros(){
        this.pasajeros.clear();
    }

    public abstract void mostrarDetalles();
    public abstract void aplicarDescuento(int edad);
}
