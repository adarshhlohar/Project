import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.lang.String;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        System.out.println(al.isEmpty());
        al.add("Adarsh");
        al.add("mahesh");
        al.add("Sameer");
        al.add("Sachin");
        al.add("Dhiraj");
        al.add("Shaam");
        System.out.println(al.isEmpty());

        Collections.sort(al);

        for (String str : al) {
            System.out.print(str + " ");
        }

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(34);
        al1.add(45);
        al1.add(49);
        al1.add(99);
        al1.add(66);
        al1.add(23);
        al1.add(20);
        al1.add(77);

        System.out.println();

        // Sort Elelemt in ascending order
        Collections.sort(al1);
        System.out.println(al1);

        // Sorting element in Descending order
        Comparator<Integer> c =  Collections.reverseOrder();
        Collections.sort(al1,c);

        for (Integer elem : al1) {
            System.out.print(elem + " ");
        }
    }
}
