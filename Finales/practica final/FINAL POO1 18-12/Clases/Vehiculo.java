import java.util.ArrayList;

public abstract class Vehiculo {
    private String codigo;
    private String estado;
    private Chofer chofer;
    private ArrayList<Acompaniante> acompaniantes;
    private double costo;
    private int capacidad;
    private int diasAlquilado;

    public Vehiculo(String codigo, double costo){
        this.codigo = codigo;
        this.estado = "Disponible";
        this.costo = costo;
        this.acompaniantes = new ArrayList<Acompaniante>();
    }

    public String getEstado(){
        return this.estado;
    }

    public Chofer getChofer(){
        return this.chofer;
    }

    public abstract int getCapacidad();

    public String getCodigo(){
        return this.codigo;
    }

    public double getCosto(){
        return this.costo;
    }

    public int getDiasAlquilado(){
        return this.diasAlquilado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void devolverVehiculo(int cantidadDias){
        this.estado = "Disponible";
        this.chofer = null;
        this.acompaniantes.clear();
        System.out.println("El vehiculo " + this.codigo + " ha sido devuelto");
        // System.out.println("El costo del alquiler es de " + this.calcularCosto() + " pesos");
    }

    // public double calcularCosto(){
    //     if ((this.chofer.getEdad() >= 70 && this.chofer.getGenero().equals("Masculino") || this.chofer.getEdad() >= 65 && this.chofer.getGenero().equals("Femenino")){
    //         return this.costo * this.diasAlquilado() * 0.2;
    //     }
    //     return this.costo * this.diasAlquilado();
    // }

    public void setAcompaniantes(ArrayList<Acompaniante> acompaniantes){
        for (Acompaniante acompaniante : acompaniantes) {
            this.acompaniantes.add(acompaniante);
        }
    }

    public void setChofer(Chofer chofer){
        this.chofer = chofer;
    }

    public String toString(){
        if (this.chofer == null){
            return this.getCodigo() + " - " + this.getEstado();
        }
        return this.getCodigo() + " - " + this.getChofer();
    }
}
