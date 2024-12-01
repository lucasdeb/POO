import java.util.ArrayList;

public class Library {
    private ArrayList<Item> items;
    private ArrayList<Member> members;

    Library(){
        items = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void registerMember(Member member){
        members.add(member);
    }
}
