import java.util.ArrayList;

public class Library {
    // Atributos
    private ArrayList<Item> items= new ArrayList<Item>();
    /* Al ser composicion, tiene que existir 
    una inicializacion de la lista de items */
    private ArrayList<Member> members;
    // Constructores
    public Library(){
        this.members= new ArrayList<Member>();
    }
    // Getters
    public ArrayList<Item> getItems() {
        return this.items;
    }
    public ArrayList<Member> getMembers() {
        return this.members;
    }
    // Métodos restantes
    public void addItem(Item item){
        this.items.add(item);
        System.out.print("Se añadio un item. ");
        item.displayDetails();
    }
    public void registerMember(Member member){
        this.members.add(member);
        System.out.printf("Se registro el miembro %s\n", member.getName());
    }
    // Habría que ver si tiene lógica retirar el item cuando está prestado
    public void lendItem(Item item){
        this.items.remove(item);
        System.out.println("Este item ha dejado de estar disponible hasta reincorporarse.");
    }
}
