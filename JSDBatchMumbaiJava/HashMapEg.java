import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class HashMapEg {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(121, "Abhi");
        hm.put(124, "Ram");
        hm.put(123, "Sam");
        hm.put(122, "Sam");
        hm.put(null, null); //one null key value
        hm.put(null, null); //one null key value
        hm.put(125, null);
        hm.put(125, "Adarsh");

        // map to set
        for (Map.Entry<Integer,String> m: hm.entrySet()) {
            System.out.print(m.getKey()+" " + m.getValue() + " ");
        }
    }
}
