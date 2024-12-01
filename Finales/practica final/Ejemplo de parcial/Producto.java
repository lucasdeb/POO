public class Producto implements Descuentable{
    private String nombre;
    private double precio;

    public Producto(){}
    public Producto(String nombre, double precio){
        this.nombre= nombre;
        this.precio= precio;
    }

    public String getNombre() {
        return this.nombre;
    }
    public double getPrecio() {
        return this.precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarDetalles(){
        System.out.printf("El nombre del producto es %s y su precio es: $%f\n",
        this.nombre, this.precio);
    }
    @Override
    public double aplicarDescuento(double porcentajeDescuento) {
        double precioNuevo= this.precio - ((porcentajeDescuento/100) * this.precio);
        return precioNuevo;
    }
}
