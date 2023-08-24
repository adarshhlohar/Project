import java.util.*;
import java.lang.String;

public class Arralist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        al.add("Adarsh");
        al.add("mahesh");
        al.add("Sameer");
        al.add("Sachin");
        al.add(null);
        al.add("Dhiraj");
        al.add("Shaam");
        // al.addFirst("Suresh");   we cannot add element using addFirst Methode
        // al.addLast("Ramesh"); we cannot add element using addLast Methode
        al2.addAll(al);
        System.out.println(al2);
        System.out.println(al);
        // al.remove(3);
        al.add(2, "madje");
        System.out.println(al);

        // for (int i = 0; i < al.size(); i++) {
        // System.out.println(al.get(i));
        // }

        // Traversing using for loop
        System.out.println("Traversing using for loop");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + ", ");
        }

        System.out.println();
        // Traversing using for each
        System.out.println("Traversing using for each");

        for (String str : al) {
            System.out.print(str + ", ");
        }

        System.out.println();
        // Traversing using Iterator
        Iterator<String> itr = al.iterator();

        System.out.println("Using the iterator");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
