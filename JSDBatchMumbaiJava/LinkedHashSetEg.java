import java.util.LinkedHashSet;
import java.lang.String;
import java.util.Iterator;


public class LinkedHashSetEg {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        lhs.add(60);
        lhs.add(70);
        lhs.add(null);  //at least one null element allow
        lhs.add(20);    //duplicate element not allowed


        System.out.println("Iterarting using iterator");
        Iterator<Integer> itr = lhs.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
