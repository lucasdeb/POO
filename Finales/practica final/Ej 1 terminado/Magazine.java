public class Magazine extends Item  implements Borrowable {
    // Atributos
    private int issueNumber;
    // Constructores
    public Magazine(){}
    public Magazine(String title, int pYear, int num){
        super(title, pYear);
        this.issueNumber= num;
    }
    // Getters y Setters
    public int getIssueNumber() {
        return this.issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    // Métodos restantes
    @Override
    public void displayDetails() {
        System.out.printf("Esta revista es aquella cuyo titulo es: %s, año de publicacion es: "+
        "%d, y numero de serie es: %d\n", super.getTitle(), super.getPublishYear(), this.issueNumber);
    }
    @Override
    public void borrow() {
        System.out.print("Se ha prestado una revista. ");
        displayDetails();
    }
    @Override
    public void returnItem() {
        System.out.print("Se ha devuelto una revista. ");
        displayDetails();
    }
}
