import java.lang.String;              
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetEg {
    public static void main(String[] args) {
        TreeSet<Integer> hs = new TreeSet<>();
        hs.add(88);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        hs.add(70);
        // hs.add(null);  //does not allow null value in hasgTree
        hs.add(20);    //duplicate element not allowed

        Iterator<Integer> itr = hs.iterator();    
        while(itr.hasNext()){    
            System.out.print(itr.next() + " ");    
        }  

    }
}
