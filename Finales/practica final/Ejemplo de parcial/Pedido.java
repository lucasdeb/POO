import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productosPedidos;
    private Cliente cliente;
    private Empleado empleado;

    public Pedido(){
        this.cliente= new Cliente();
        this.productosPedidos= new ArrayList<Producto>();
    }
    public Pedido(String nombre, String apellido,
    String mail, double numCliente, boolean jubilado, Empleado empleado){
        this.cliente= new Cliente(nombre, apellido, mail, numCliente, jubilado);
        this.empleado= empleado;
        this.productosPedidos= new ArrayList<Producto>();
    }

    public ArrayList<Producto> getProductosPedidos() {
        return this.productosPedidos;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void agregarProducto(Producto producto){
        this.productosPedidos.add(producto);
        System.out.printf("Se añadio el producto %s\n", producto.getNombre());
    }
    public double calcularTotal(){
        double suma= 0;
        for (Producto producto : this.productosPedidos) {
            if (this.cliente.esJubildado()) {
                suma+= producto.aplicarDescuento(14.5);
            }
            else{
                suma+= producto.getPrecio();
            }
        }
        return suma;
    }
}
