import java.util.*;
import java.lang.String;
class Book{
    String name;
    boolean isAvail;
    double price;
    int id;

    Book(String name, boolean isAvail, double price,int id){
        this.name = name;
        this.isAvail = isAvail;
        this.price = price;
        this.id = id;
    }
}


public class ArrayListUserDefineEg {
    public static void main(String[] args) {
        // Creating object of Book class
        Book b1 = new Book("Core Java", true, 1103.3, 1);
        Book b2 = new Book("Advance Java", false, 2003.3, 2);
        Book b3 = new Book("JavaScript", true, 2103.3, 3);
        Book b4 = new Book("SQL", true, 503.3, 4);
        Book b5 = new Book("CPP", true, 1703.3, 5);
        Book b6 = new Book("Spring", true, 703.3, 6);

        // creating arraylist
        ArrayList<Book> al = new ArrayList<>();
        al.add(b6);   //Adding book object
        al.add(b3);
        al.add(b4);
        al.add(b2);
        al.add(b1);
        al.add(b5);

        al.add(new Book("The Multiverse Adarsh", false, 10000, 7));

        // Collections.sort(al);

        Iterator<Book> itr = al.iterator();
        while (itr.hasNext()) {
            Book b = (Book) itr.next();
            System.out.println(b.name + " " + b.price + " " + b.isAvail + " " + b.id);
        }

    }
}
