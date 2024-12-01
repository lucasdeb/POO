import java.util.ArrayList;

abstract class Clase {
    Instructor instructor;
    int cupo;
    String horario;
    ArrayList<Cliente> clientes;

    public Clase(Instructor instructor, int cupo, String horario) {
        this.instructor = instructor;
        this.cupo = cupo;
        this.horario = horario;
        this.clientes = new ArrayList<Cliente>();
    }

    public void suscribirNuevoCliente(Cliente cliente) {
        if (this.cupo > 0) {
            clientes.add(cliente);
            this.cupo -= 1;
            System.out.println(cliente + " agregado con exito!");
            System.out.println("Cupo: " + this.cupo);

        } else {
            System.out.println("No hay cupo para esta clase");
        }
    }

    public int getCupo(){
        return this.cupo;
    }

    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }


}
