import java.lang.String;
import java.util.*;

public class LinkedListEg {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<>();
        al.add("Adarsh");
        al.add("mahesh");
        al.add("Sameer");
        al.add("Sachin");
        al.add(null);
        al.add("Sameer");
        al.add("Dhiraj");
        al.add("Shaam");
        al.addLast("Suresh");
        al.addFirst("Ramesh");
        // System.out.print(al);


        // forword Iteration
        ListIterator<String> itr = al.listIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        
        // BackWord Iteration
        ListIterator<String> itr1 = al.listIterator(al.size());
        while (itr1.hasPrevious()) {
            System.out.print(itr1.previous() + " ");
        }
    }
}
