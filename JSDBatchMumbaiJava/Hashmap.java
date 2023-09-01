import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class Hashmap {
    public static void main(String[] args) {
        // Initializing Hashmap
        HashMap <String,Integer> map = new HashMap<>();

        // Adding element using put method
        map.put("Aadrsh", 21);
        map.put("Mahesh", 11);
        map.put("Dhiraj", 10);
        map.put("Sameer", 9);
        map.put("Sameer", 5);
        map.put("Suraj", 8);

        System.out.println(map);
        // removing element using remove()
        map.remove("Suraj");

        // It creates an instance of HashMap with the same mappings as the specified map.
        HashMap <String,Integer> map2 = new HashMap<>(map);
        System.out.println("The map2 is : " + map2);

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println("The key is : " + e.getKey() + " And the value is : " + e.getValue());
        }

    }
}
