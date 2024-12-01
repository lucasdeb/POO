public class JuegoMobile extends Item implements IBorrowable {
    private int issueNumber;

    public JuegoMobile(){}
    public JuegoMobile(String titulo, int anio, int issueNum){
        super(titulo, anio);
        this.issueNumber= issueNum;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInformacion() {
        System.out.printf("\nEste juego de Movil es el de:\nTitulo: %s\nAnio: %d\nNumero de serie: %d\n",
        super.getTitulo(), super.getAnioPublicacion(), this.issueNumber);
    }
    @Override
    public void borrow() {
        System.out.println("Se ha prestado un juego de Movil");
        this.displayInformacion();
    }
    @Override
    public void returnItem() {
        System.out.println("Se ha devuelto un juego de Movil");
        this.displayInformacion();
    }
}
