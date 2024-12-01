public class Empleado extends Usuario{
    private String puesto;
    private String sector;

    public Empleado(){}
    public Empleado(String nombre, String apellido, String mail, String puesto, String sector){
        super(nombre, apellido, mail);
        this.puesto= puesto;
        this.sector= sector;
    }

    public String getPuesto() {
        return this.puesto;
    }
    public String getSector() {
        return this.sector;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }

    public void procesarPedido(Pedido pedido){
        System.out.println("Productos y precios:");
        for (Producto producto : pedido.getProductosPedidos()) {
            System.out.printf("%s%10.2f\n", producto.getNombre(), producto.getPrecio());
        }
        System.out.printf("SUMA TOTAL aplicando descuentos: %4.2f\n", pedido.calcularTotal());
    }
}
