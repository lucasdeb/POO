import java.util.ArrayList;

public class BibliotecaDeJuegos {
    private ArrayList<Item> items;
    private ArrayList<Member> members;

    public BibliotecaDeJuegos(){
        this.items= new ArrayList<Item>();
        this.members= new ArrayList<Member>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    public ArrayList<Member> getMembers() {
        return members;
    }
    //Sin setters porque se agregan uno a uno
    public void addItem(Item item){
        this.items.add(item);
        System.out.println("Se ha agregado un item a la coleccion:");
        item.displayInformacion();
    }
    public void removeItem(Item item){
        this.items.remove(item);
        System.out.println("Se ha retirado un item de la coleccion:");
        item.displayInformacion();
    }
    public void registerMember(Member member){
        this.members.add(member);
        System.out.printf("Se ha registrado al miembro: %s", member.getName());
    }
}
