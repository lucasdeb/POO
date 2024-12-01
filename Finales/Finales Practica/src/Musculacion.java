import java.util.ArrayList;

public class Musculacion extends Clase {
    ArrayList<Cliente> clientes;

    public Musculacion(Instructor instructor, int cupo, String horario) {
        super(instructor, cupo, horario);
        this.clientes = new ArrayList<Cliente>();
    }

    @Override
    public void suscribirNuevoCliente(Cliente cliente) {
        super.suscribirNuevoCliente(cliente);
    }

    @Override
    public int getCupo() {
        return super.getCupo();
    }

    @Override
    public ArrayList<Cliente> getClientes() {
        return super.getClientes();
    }
}
