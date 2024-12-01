import java.util.ArrayList;

public class Member {
    private String name;
    private ArrayList<IBorrowable> borrowedItems;

    Member(String name) {
        this.name = name;
        borrowedItems = new ArrayList<>();
    }

    public void borrowItem(IBorrowable item){
        if(!borrowedItems.contains(item)){
            item.borrow();
            borrowedItems.add(item);
        }
        else{
            System.out.println("You've already borrowed that item.");
        }
    }

    public void returnItem(IBorrowable item){
        if(borrowedItems.contains(item)){
            item.returnItem();
            borrowedItems.remove(item);
        }
    }

}
