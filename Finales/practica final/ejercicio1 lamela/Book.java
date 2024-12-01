public class Book extends Item implements IBorrowable{
    private String author;
    private String ISBN;

    Book(String title, int publishYear, String author, String ISBN) {
        super(title, publishYear);
        this.author = author;
        this. ISBN = ISBN;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void displayDetails(){
        String details = String.format("Book{title:%s, publishYear:%d, author:%s, ISBN:%s}", this.title, this.publishYear, this.author, this.ISBN);

        System.out.println(details);
    }

    public void borrow(){
        String info = String.format("Book with ISBN: %s is borrowed.", this.ISBN);
        System.out.println(info);
    }

    public void returnItem(){
        String info = String.format("Book with ISBN: %s is returned.", this.ISBN);
        System.out.println(info);
    }
    
}
