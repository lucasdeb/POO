public class Main {
    public static void main(String[] args){

        //creo la library
        Library library = new Library();

        //creo books
        Book book1 = new Book("ABC", 2000, "Pablo Lamela", "abc" );
        Book book2 = new Book("DEF", 2010, "Juan Gonzalez", "def" );
        Book book3 = new Book("GHI", 2020, "Milagros Soler", "ghi" );

        //creo magazines
        Magazine magazine1 = new Magazine("Muy Interesante", 1980, 123);
        Magazine magazine2 = new Magazine("La Nacion", 1980, 456);

        //creo miembros
        Member member1 = new Member("Pedro Garcia");
        Member member2 = new Member("Ramiro Lopez");

        //registro algunos items y miembros
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);
        library.addItem(magazine1);
        library.addItem(magazine2);
        
        library.registerMember(member1);
        library.registerMember(member2);


        //muestro info sobre un book y una magazine
        book1.displayDetails();
        magazine1.displayDetails();

        System.out.println("------------------------------------------------------");

        //tomo prestado un book
        member1.borrowItem(book2);
        member1.borrowItem(book2);

        System.out.println("------------------------------------------------------");

        //devuelvo el book
        member1.returnItem(book2);
    }
    
}
