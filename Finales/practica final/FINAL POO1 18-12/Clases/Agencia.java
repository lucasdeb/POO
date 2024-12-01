import java.util.ArrayList;

public class Agencia {
    private ArrayList<Vehiculo> vehiculos;

    public Agencia() {
        this.vehiculos = new ArrayList<Vehiculo>();
        for(int i = 0; i < 5; i++) {
            String codigo = "M" + (i+1);
            this.vehiculos.add(new Moto(codigo, 1000.0));
        }
        for(int i = 0; i < 8; i++) {
            String codigo = "A" + (i+1);
            this.vehiculos.add(new Auto(codigo, 2000.0));
        }
        for(int i = 0; i < 3; i++) {
            String codigo = "C" + (i+1);
            this.vehiculos.add(new Camioneta(codigo,  3000.0));
        }
    }

    public void mostrarVehiculos(){
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public void getVehiculosDisponibles(int cantidadPersonas) {
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getEstado().equals("Disponible") && cantidadPersonas == vehiculo.getCapacidad()) {
                System.out.println(vehiculo);
            }
        }
    }

    public void alquilarVehiculo(String codigo, Chofer chofer, ArrayList<Acompaniante> acompaniantes) {
        // System.out.println(acompaniantes.size());
        // System.out.println(vehiculo.getCapacidad());
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getCodigo().equals(codigo)) {
                vehiculo.setEstado("Alquilado");
                vehiculo.setChofer(chofer);
                vehiculo.setAcompaniantes(acompaniantes);
                System.out.println("El vehiculo " + vehiculo.getCodigo() + " ha sido alquilado");
            }
        }
    }

    public void devolverVehiculo(String codigo) {
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getCodigo().equals(codigo) && vehiculo.getEstado().equals("Alquilado")) {
                vehiculo.devolverVehiculo(vehiculo.getDiasAlquilado());
                break;
            } else {
                throw new RuntimeException("El vehiculo " + codigo + " no se puede devolver porque no esta alquilado");
            }
        }
    }
}
