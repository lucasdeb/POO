import java.util.ArrayList;

public class Agencia {
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Persona> clientes;

    public Agencia(){
        this.vehiculos= new ArrayList<Vehiculo>();
        String codigo;
        Moto auxM;
        for (int i = 1; i <= 5; i++) {
            codigo= "M"+i;
            auxM= new Moto(codigo);
            this.vehiculos.add(auxM);
        }

        Auto auxA;
        for (int i = 1; i <= 8; i++) {
            codigo= "A"+i;
            auxA= new Auto(codigo);
            this.vehiculos.add(auxA);
        }

        Camioneta auxC;
        for (int i = 1; i <= 3; i++) {
            codigo= "C"+i;
            auxC= new Camioneta(codigo);
            this.vehiculos.add(auxC);
        }
        
        this.clientes= new ArrayList<Persona>();
    }

    public ArrayList<Persona> getClientes() {
        return clientes;
    }
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void registrarClientes(ArrayList<Persona> personas){
        for (Persona persona : personas) {
            this.clientes.add(persona);
        }
    }

    public void sistemaConcesionVehiculo(ArrayList<Persona> personas){
        boolean posible= false;
        for (Vehiculo vehiculo : this.vehiculos) {
            if(vehiculo.getCapacidad() == personas.size() && vehiculo.estaDisponible()){
                int mayor= 0;

                for (Persona persona : personas) {
                    if (persona.getEdad() > mayor) {
                        mayor= persona.getEdad();
                        vehiculo.setConductor(persona);
                    }
                }

                for (Persona persona : personas) {
                    if (vehiculo.getConductor() != persona) {
                        vehiculo.aniadirPasajero(persona);
                    }
                }

                posible= true;
                vehiculo.setDisponible();
                break;
            }
        }
        if (!posible) {
            System.out.println("ERROR, no hay vehiculos disponibles.");
        }
    }


    public void recibirVehiculo(Vehiculo transporte, int dias){
        for (Vehiculo vehiculo : this.vehiculos) {
            if (transporte == vehiculo) {
                vehiculo.aplicarDescuento(dias);
                vehiculo.vaciarPasajeros();
                vehiculo.setDisponible();
            }
        }
    }

    public void mostrarRegistro(){
        System.out.println("Vehiculos en stock:");
        for (Vehiculo vehiculo : this.vehiculos) {
            if (vehiculo.estaDisponible()) {
                System.out.printf("%s - DISPONIBLE\n", vehiculo.getCodigoUnico());
            }
            else{
                System.out.printf("%s - %s\n", vehiculo.getCodigoUnico(), vehiculo.getConductor().getNombre());
            }
        }
    }


}
