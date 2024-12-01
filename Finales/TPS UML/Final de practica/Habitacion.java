import java.util.ArrayList;

public abstract class Habitacion implements IDescontable {
    private double precio;
    private int capacidad;
    private int numeroHabitacion;
    private ArrayList<Persona> usuarios;
    private Persona titular;
    private boolean ocupada;

    public Habitacion(){}
    public Habitacion(double precio, int numero){
        this.precio= precio;
        this.numeroHabitacion= numero;
        this.ocupada= false;
    }
    
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public double getPrecio() {
        return precio;
    }
    public boolean estaOcupada(){
        return ocupada;
    }
    public Persona getTitular() {
        return titular;
    }
    public ArrayList<Persona> getUsuarios() {
        return usuarios;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    public void setUsuarios(ArrayList<Persona> usuarios) {
        this.usuarios= usuarios;
        Persona mayor= usuarios.get(0);
        for (Persona usuario : usuarios) {
            if (usuario.getEdad() > mayor.getEdad()) {
                mayor= usuario;
            }
        }
        this.titular= mayor;
        this.setOcupada();
    }
    public void setOcupada() {
        this.ocupada = !(this.ocupada);
    }

    public abstract void mostrarInformacion();
    public abstract void aplicarDescuento(int edad);
}
