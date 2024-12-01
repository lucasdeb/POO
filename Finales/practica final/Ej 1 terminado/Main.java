public class Main{
    public static void main(String[] args) {
        System.out.println("\n");
        Library biblioteca= new Library();
        Book libro= new Book("Un camino", 112070, "Pedro", "1233efs3533");
        Book libro2= new Book("Un paraiso", 91560, "Cristian", "1648bde7522");
        Book libro3= new Book("Un monte", 102357, "Raul", "1549kjp1647");
        Magazine revista= new Magazine("Campamento, articulos y demas", 61297, 12675412);
        Magazine revista2= new Magazine("Cocina, articulos y demas", 50496, 14965498);
        biblioteca.addItem(libro);
        biblioteca.addItem(libro2);
        biblioteca.addItem(libro3);
        biblioteca.addItem(revista);
        biblioteca.addItem(revista2);
        /* for (Item item : biblioteca.getItems()) {
            item.displayDetails();
        } */
        Member miembro= new Member("Patricio");
        Member miembro2= new Member("Juan");
        Member miembro3= new Member("Santiago");
        biblioteca.registerMember(miembro);
        biblioteca.registerMember(miembro2);
        biblioteca.registerMember(miembro3);
        /* for (Member member : biblioteca.getMembers()) {
            System.out.printf("%s\n", member.getName());
        } */
        boolean noDisponible= true;
        for (Item item : biblioteca.getItems()) {
            if (item == libro) {
                miembro.borrowItem(libro);
                biblioteca.lendItem(libro);
                noDisponible= false;
                break;
            }
        }
        if (noDisponible) {
            System.out.println("Esta intentando tomar prestado un artículo no disponible");
        }
        noDisponible= true;
        for (Item item : biblioteca.getItems()) {
            if (item == libro2) {
                miembro.borrowItem(libro2);
                biblioteca.lendItem(libro2);
                noDisponible= false;
                break;
            }
        }
        if (noDisponible) {
            System.out.println("Esta intentando tomar prestado un artículo no disponible");
        }
        noDisponible= true;
        for (Item item : biblioteca.getItems()) {
            if (item == revista2) {
                miembro2.borrowItem(revista2);
                biblioteca.lendItem(revista2);
                noDisponible= false;
                break;
            }
        }
        if (noDisponible) {
            System.out.println("Esta intentando tomar prestado un artículo no disponible");
        }
        noDisponible= true;
        /* for (Borrowable item : miembro.getBorrowedItems()) {
            System.out.println(item);
        } */
        for (Item item : biblioteca.getItems()) {
            if (item == revista2) {
                miembro3.borrowItem(revista2);
                biblioteca.lendItem(revista2);
                noDisponible= false;
                break;
            }
        }
        if (noDisponible) {
            System.out.println("Esta intentando tomar prestado un artículo no disponible");
        }
        miembro2.returnItem(revista2);
        biblioteca.addItem(revista2);
        noDisponible= true;
        for (Item item : biblioteca.getItems()) {
            if (item == revista2) {
                miembro3.borrowItem(revista2);
                biblioteca.lendItem(revista2);
                noDisponible= false;
                break;
            }
        }
        if (noDisponible) {
            System.out.println("Esta intentando tomar prestado un artículo no disponible");
        }
    }
}