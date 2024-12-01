import java.util.ArrayList;

public class Member {
    private String name;
    private ArrayList<IBorrowable> borrowedItems;

    public Member(){}
    public Member(String nombre){
        this.borrowedItems= new ArrayList<IBorrowable>();
        this.name= nombre;
    }

    public String getName() {
        return name;
    }
    public ArrayList<IBorrowable> getBorrowedItems() {
        return borrowedItems;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void borrowItem(IBorrowable item){
        if (this.borrowedItems.contains(item)) {
            System.out.println("Ya tiene este libro");
        }
        else{
            System.out.printf("%s tomo prestado un item.\n", this.name);
            item.borrow();
            this.borrowedItems.add(item);
        }
    }

    public void returnItem(IBorrowable item){
        System.out.printf("%s devolvio un item.\n", this.name);
        item.returnItem();
        this.borrowedItems.remove(item);
    }
}
