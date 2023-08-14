import java.lang.String;
import java.net.SocketTimeoutException;
import java.util.StringTokenizer;
// String is immutable (cannot be changed)

// mutable String
// StringBuilder - Async
// StringBuffer - sync

public class String1 {

    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "Welcome";// It doesn't create a new instance
        String s3 = "java";// creating string by Java string literal
        char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
        String s4 = new String(ch);// converting char array to string
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s4.length());

        int num = 45;
        String a = String.valueOf(num);
        System.out.println(a + 56); // printing the string value

        System.out.println(s3.replace("java", "newJava"));
        System.out.println(s3);

        // compare String
        // equalsIgnoreCase
        System.out.println(s1.equals(s2)); // compare original values
        System.out.println(s1 == s2); // compare reference not values

        // concat String
        String name = "Adarsh" + " Lohar";
        System.out.println(name);

        String num1 = 80 + 234 + "my" + 88 + 34;
        System.out.println(num1);

        // concat() & compareto()
        String x = "Welcome";
        String y = "world";
        System.out.println(x.concat(y));
        System.out.println(x.compareTo(y));

        StringTokenizer ss = new StringTokenizer("Welcome to world of java String", " ");
        while (ss.hasMoreTokens()) {
            System.out.println(ss.nextToken());
        }

        // mutable String
        // StringBuilder - Async
        // StringBuffer - sync
        StringBuffer ssb = new StringBuffer("Heello");
        System.out.println(ssb); //Heello
        ssb.append(" Student ");
        System.out.println(ssb); //Heello Student
        ssb.insert(7,"good morning");
        System.out.println(ssb);  //Heello good morningStudent
        ssb.delete(2,6);
        System.out.println(ssb); //Heello good morningStudent
        ssb.replace(3, 8, " Very good ");
        System.out.println(ssb);  //Heello good morningStudent
        ssb.reverse();
        System.out.println(ssb);
        int len = ssb.length();
        System.out.println(len);
    }
}
