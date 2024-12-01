import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos= new ArrayList<Pedido>();
        Producto producto= new Producto("Milanesas", 1000);
        producto.mostrarDetalles();
        Producto producto2= new Producto("Yogurt", 350);
        producto2.mostrarDetalles();
        Producto producto3= new Producto("Papel higienico", 450.33);
        producto3.mostrarDetalles();

        Empleado empleado= new Empleado("Mauro", "Rodriguez", "maurod@gmail.nullcom", "Cajero", "Jubilados");

        Pedido pedido= new Pedido("Osvaldo", "Milano", "omilano@mac.com", 1347, true, empleado);
        Pedido pedido2= new Pedido("Patricio", "Ratcliffe", "patricioratcliffe@uca.edu.ar", 2475, false, empleado);
        pedido.agregarProducto(producto);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        pedido2.agregarProducto(producto);
        pedido2.agregarProducto(producto2);
        pedido2.agregarProducto(producto3);

        pedidos.add(pedido);
        pedidos.add(pedido2);

        for (Pedido pedido3 : pedidos) {
            pedido3.getCliente().hacerPedido(pedido3);
            System.out.println("");
            empleado.procesarPedido(pedido3);
        }
    }
}