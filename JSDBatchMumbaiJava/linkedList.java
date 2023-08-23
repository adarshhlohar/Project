import java.util.*;
import java.lang.String;

public class linkedList {

    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<>();
        LinkedList<String> al2 = new LinkedList<>();
        al.add("Adarsh");
        al.add("mahesh");
        al.add("Sameer");
        al.add("Sachin");
        al.add(null);
        al.add("Dhiraj");
        al.add("Shaam");

        al2.addAll(al);
        System.out.println(al2);
        System.out.println(al);
        // al.remove(3);
        al.add(2, "madje");
        System.out.println(al);

        // Traversing using for loop
        for (int i = 0; i < al.size(); i++) {
        System.out.print(al.get(i) + ", ");
        }

        // Traversing using for each 
        System.out.println();

        for (String str : al) {
            System.out.print(str + ", ");
        }

        System.out.println();
        // Traversing using Iterator
        Iterator<String> itr = al.iterator();

        System.out.println("Using the iterator");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
