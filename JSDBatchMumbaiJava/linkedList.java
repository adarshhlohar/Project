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

        // for (int i = 0; i < al.size(); i++) {
        // System.out.println(al.get(i));
        // }
    }
}
