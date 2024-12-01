package Parcial;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", 1925, "Scott Fitzgerald", "1234567890");
        Magazine magazine1 = new Magazine("Top Gear", 2020, 37);

        library.addItem(book1);
        library.addItem(magazine1);

        Member member1 = new Member("Lucas Debarbieri");
        library.registerMember(member1);

        book1.displayDetails();
        magazine1.displayDetails();

        System.out.println("\nBorrows:");
        member1.borrowItem(book1);
        member1.borrowItem(magazine1);

        System.out.println("\nRetornaron:");
        member1.returnItem(book1);
        member1.returnItem(magazine1);

        // otro ejemplo

        Library library2 = new Library();

        Book libro = new Book("7 Habits of Highly Effective People", 2017, "Me olvide LOL", "12345678900");
        Book libro1 = new Book("How to Make Money", 2012, "Lucas Debarbieri", "125678900");
        Magazine magazine = new Magazine("Coding Daily", 2021, 20);

        library2.addItem(magazine);
        library2.addItem(libro);
        library2.addItem(libro1);

        Member member = new Member("Messi");
        library.registerMember(member);

        libro.displayDetails();
        libro1.displayDetails();
        magazine.displayDetails();

        System.out.println("\nBorrows:");
        member.borrowItem(libro);
        member.borrowItem(libro1);
        member.borrowItem(magazine);

        System.out.println("\nRetornaron:");
        member.returnItem(libro);
        member.returnItem(libro1);
        member.returnItem(magazine1);

    }
}

abstract class Item {
    String title;
    int publishYear;

    public Item(String title, int publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }

    int getPublishYear() {
        return publishYear;
    }

    String getTitle() {
        return title;
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Publish Year: " + publishYear);
    }
}

class Book extends Item implements Borrowable {
    String author;
    String ISBN;

    public Book(String title, int publishYear, String author, String ISBN) {
        super(title, publishYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    String getISBN() {
        return ISBN;
    }

    String getAuthor() {
        return author;
    }

    @Override
    public void borrow() {
        System.out.println("You borrowed: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("You returned: " + title);
    }

}

interface Borrowable {
    void borrow();

    void returnItem();
}

class Magazine extends Item implements Borrowable {
    int issueNumber;

    public Magazine(String title, int publishYear, int issueNumber) {
        super(title, publishYear);
        this.issueNumber = issueNumber;
    }

    int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void borrow() {
        System.out.println("You borrowed: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("You returned: " + title);
    }

}

class Member {
    String name;
    List<Borrowable> borrowedItems;

    public Member(String name) {
        this.borrowedItems = new ArrayList<>();
        this.name = name;
    }

    void borrowItem(Borrowable item) {
        item.borrow();
        borrowedItems.add(item);
    }

    void returnItem(Borrowable item) {
        item.returnItem();
        borrowedItems.remove(item);
    }

}

class Library {
    List<Item> items;
    List<Member> members;

    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    void addItem(Item item) {
        items.add(item);
    }

    void registerMember(Member member) {
        members.add(member);
    }

}