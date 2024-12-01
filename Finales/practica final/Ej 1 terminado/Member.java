import java.util.ArrayList;

public class Member {
    private String name;
    private ArrayList<Borrowable> borrowedItems;

    public Member(){}
    public Member(String name){
        this.name= name;
        this.borrowedItems= new ArrayList<Borrowable>();
    }

    public String getName() {
        return this.name;
    }
    public ArrayList<Borrowable> getBorrowedItems() {
        return this.borrowedItems;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void borrowItem(Borrowable item){
        this.borrowedItems.add(item);
        System.out.printf("%s tomo prestado un articulo. ", this.name);
        item.borrow();
    }
    public void returnItem(Borrowable item){
        this.borrowedItems.remove(item);
        System.out.printf("%s devolvio un articulo. ", this.name);
        item.returnItem();
    }
}
