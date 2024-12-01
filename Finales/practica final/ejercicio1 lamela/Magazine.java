public class Magazine extends Item implements IBorrowable {
    private int issueNumber;

    Magazine(String title, int publishYear, int issueNumber){
        super(title, publishYear);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return this.issueNumber;
    }

    public void displayDetails(){
        String details = String.format("Book{title:%s, publishYear:%d, issueNumber:%d}", this.title, this.publishYear, this.issueNumber);

        System.out.println(details);
    }

    public void borrow(){
        String info = String.format("Magazine with issue number: %d is borrowed.", this.issueNumber);
        System.out.println(info);
    }

    public void returnItem(){
        String info = String.format("Magazine with issue number: %d is returned.", this.issueNumber);
        System.out.println(info);
    }
}
