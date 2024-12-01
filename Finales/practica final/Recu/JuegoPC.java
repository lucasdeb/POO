public class JuegoPC extends Item implements IBorrowable {
    private String autor;

    public JuegoPC(){}
    public JuegoPC(String titulo, int anio, String autor){
        super(titulo, anio);
        this.autor= autor;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void displayInformacion() {
        System.out.printf("\nEste juego de PC es el de:\nTitulo: %s\nAnio: %d\nAutor: %s\n",
        super.getTitulo(), super.getAnioPublicacion(), this.autor);
    }
    @Override
    public void borrow() {
        System.out.println("Se ha prestado un juego de PC.");
        this.displayInformacion();
    }
    @Override
    public void returnItem() {
        System.out.println("Se ha devuelto un juego de PC.");
        this.displayInformacion();
    }
}
