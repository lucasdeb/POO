public class Book extends Item implements Borrowable {
    // Atributos
    private String author;
    private String ISBN;
    // Constructores
    public Book(){}
    public Book(String title, int pYear, String author, String isbn){
        super(title, pYear);
        this.author= author;
        this.ISBN= isbn;
    }
    // Getters y Setters
    public String getAuthor() {
        return this.author;
    }
    public String getISBN() {
        return this.ISBN;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(String isbn) {
        ISBN = isbn;
    }
    // Métodos restantes
    @Override
    public void displayDetails() {
        System.out.printf("Este libro es aquel cuyo titulo es: %s, año de publicacion es: "+
        "%d, autor es: %s, y el ISBN es: %s\n", super.getTitle(), super.getPublishYear(), 
        this.author, this.ISBN);
    }
    @Override
    public void borrow() {
        System.out.print("Se ha prestado un libro. ");
        displayDetails();
    }
    @Override
    public void returnItem() {
        System.out.print("Se ha devuelto un libro. ");
        displayDetails();
    }
}
