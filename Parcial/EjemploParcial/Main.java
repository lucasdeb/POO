package EjemploParcial;

import java.util.List;
import java.util.ArrayList;

interface Descuentable {
    Double aplicarDescuento(Double porcentajeDescuento);

}

class Producto implements Descuentable {
    String nombre;
    Double precio;

    public Producto(String nombre, Double i) {
        this.nombre = nombre;
        this.precio = i;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + "Precio: $" + precio);
    }

    @Override
    public Double aplicarDescuento(Double porcentajeDescuento) {
        if (porcentajeDescuento > 100 || porcentajeDescuento < 0) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100");
        } else {
            return precio - (precio * (porcentajeDescuento / 100));
        }

    }
}

class Pedido {
    List<Producto> productosPedidos = new ArrayList<>();;
    Cliente cliente;
    Empleado empleado;

    public Pedido(Cliente cliente, Empleado empleado) {
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public void agregarProducto(Producto producto) {
        if (cliente.Jubilado) {
            producto.aplicarDescuento(20.0);
        }
        productosPedidos.add(producto);
    }

    public Double calcularTotal() {
        Double suma = 0.0;
        for (Producto prod : productosPedidos) {
            suma += prod.getPrecio();
        }

        return suma;
    }

}

abstract class Usuario {
    String nombre;
    String apellido;
    String email;

    public Usuario(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

}

class Cliente extends Usuario {
    Double NumeroDeCliente;
    Boolean Jubilado;

    public Cliente(String nombre, String apellido, String email, Double i, Boolean Jubilado) {
        super(nombre, apellido, email);
        this.NumeroDeCliente = i;
        this.Jubilado = Jubilado;
    }

    void hacerPedido(Pedido pedido) {
        pedido.empleado.procesarPedido(pedido);
    }
}

class Empleado extends Usuario {
    String puesto;
    String sector;

    public Empleado(String nombre, String apellido, String email, String puesto, String sector) {
        super(nombre, apellido, email);
        this.puesto = puesto;
        this.sector = sector;
    }

    void procesarPedido(Pedido pedido) {
        System.out.println(pedido.calcularTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pablo", "Cardozo", "pablo@asd.com", 10.0, true);
        Empleado empleado = new Empleado("Facundo", "Rusalen", "fac@asd.com", "ASD", "asd");

        Pedido pedido = new Pedido(cliente, empleado);

        Producto productoLeche = new Producto("Leche", 100.0);
        Producto productoTomate = new Producto("Tomate", 25.0);

        pedido.agregarProducto(productoLeche);
        pedido.agregarProducto(productoTomate);

        pedido.cliente.hacerPedido(pedido);
    }
}
