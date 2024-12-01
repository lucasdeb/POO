public class Cliente extends Usuario{
    private double numeroDeCliente;
    private boolean jubilado;

    public Cliente(){}
    public Cliente(String nombre, String apellido, String mail, double numCliente, boolean jubilado){
        super(nombre, apellido, mail);
        this.numeroDeCliente= numCliente;
        this.jubilado= jubilado;
    }

    public double getNumeroDeCliente() {
        return this.numeroDeCliente;
    }
    public boolean esJubildado(){
        return this.jubilado;
    }
    public void setNumeroDeCliente(double numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }
    public void setJubilado(boolean jubilado) {
        this.jubilado = jubilado;
    }

    public void hacerPedido(Pedido pedido){
        System.out.println("Productos y precios:");
        if (this.jubilado) {
            System.out.println("Es jubilado, tiene descuento en todos los productos");
        }
        for (Producto producto : pedido.getProductosPedidos()) {
            if (this.jubilado) {
                System.out.printf("%s%10.2f\n", producto.getNombre(),
                producto.aplicarDescuento(14.5));
            }
            else{
                System.out.printf("%s%10.2f\n", producto.getNombre(), producto.getPrecio());
            }
        }
        System.out.printf("SUMA TOTAL: %4.2f\n", pedido.calcularTotal());
    }
}
